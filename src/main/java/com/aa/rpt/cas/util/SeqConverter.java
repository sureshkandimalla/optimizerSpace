/**
 * ***********************************************************************
 * Package          : com.aa.rpt.cas.lib.converter 
 * Class            : SeqConverter.java
 * Abstract         : No
 * Inherited From   : N/A
 * Implemented From : N/A
 * Description      : -----
 * 
 * 
 * MAINTENANCE LOG
 * ----------------------------------------------------------------------
 * Date           Modified By        Description 
 * ----------------------------------------------------------------------
 * Jul 26, 2004   Zubayr Rashid  Initial 
 * 
 * ***********************************************************************
 * 
 */

package com.aa.rpt.cas.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class SeqConverter
{
	// static constants
	private static DateTimeFormatter yyyyMMdd_HHmmss = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");
	private static DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	private static final int OFF_SET = 1;
	private static final int CHAR_BASE = 26;
	private static final char CHAR_BASE_ZERO = 'A';
	private static final char WEIGHTED_CHAR_BASE_ZERO = 'Q';
	private static final int PNR_LOC_LEN = 6;
	private static final int AIRLINE_CODE_LEN = 2;
	private static final int BRD_OFF_LEN = 6;
	private static final int MIN_SEQ = 0 + OFF_SET;
    private static final int MAX_PNR_LOC = 
    	(int) Math.pow(CHAR_BASE, PNR_LOC_LEN) - 1 + OFF_SET;
	private static final int MAX_AIRLINE_CODE =
		(int) Math.pow(CHAR_BASE, AIRLINE_CODE_LEN) - 1 + OFF_SET;
	private static final int MAX_BRD_OFF =
		(int) Math.pow(CHAR_BASE, BRD_OFF_LEN) - 1 + OFF_SET;
	private static final int[] WEIGHT =
	{
		10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,
	 	0,1,2,3,4,5,6,7,8,9
	};
	private static final char[] WEIGHTED_CHAR =
	{
		'Q','R','S','T','U','V','W','X','Y','Z',
		'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P'
	};
	private static final Logger log = LogManager.getLogger(SeqConverter.class);
	
	// public static methods

	public static int sFareClass2Seq(final char fareClass)
	{
		return fareClass - 'A' + 1;									
	}
	
	public static char sSeq2FareClass(final int seq)
	{
		return (char) (seq - 1 + 'A');
	}
	
	public static int sPnrLoc2Seq(final String loc)
	{
		if(loc == null)
			throw new NullPointerException
				("String argument passed as PNR Locator is null");
		if(loc.length() != PNR_LOC_LEN)
			throw new IllegalArgumentException
				("Not a valid PNR Locator. '" + 
			    loc + 
				"' does not have lenght " +
			    PNR_LOC_LEN);
		if(!sIsUpper(loc))
			throw new IllegalArgumentException
				("Not a valid PNR Locator. '" +
				loc + 
				"' does not have all upper case letters");			
		return sWeightedString2Seq(loc);
	}
	
	public static String sSeq2PnrLoc(final int seq)
	{
		if(seq < MIN_SEQ || seq > MAX_PNR_LOC)
			throw new IllegalArgumentException
				("Not a valid PNR Locator Sequence. " +
				seq +
				" is not in the range " +
				MIN_SEQ +
				".." +
				MAX_PNR_LOC);
		return sWeightedSeq2String(seq, PNR_LOC_LEN);
	}
	
	public static int sAirlineCode2Seq(final String airlineCode)
	{
		if(airlineCode == null)
			throw new NullPointerException
				("String argument passed as Airline Code is null");
		if(airlineCode.length() != AIRLINE_CODE_LEN)
			throw new IllegalArgumentException
				("Not a valid Airline Code. '" + 
				airlineCode + 
				"' does not have lenght " +
				AIRLINE_CODE_LEN);
		if(!sIsUpper(airlineCode))
			throw new IllegalArgumentException
				("Not a valid Airline Code. '" +
				airlineCode + 
				"' does not have all upper case letters");
		return sString2Seq(airlineCode);
	}
	
	public static String sSeq2AirlineCode(final int seq)
	{
		if(seq < MIN_SEQ || seq > MAX_AIRLINE_CODE)
			throw new IllegalArgumentException
				("Not a valid Airline Code Sequence. " +
				seq +
				" is not in the range " +
				MIN_SEQ +
				".." +
				MAX_AIRLINE_CODE);
		return sSeq2String(seq, AIRLINE_CODE_LEN);
	}
	
	public static int sBrdOff2Seq(final String brdOff)
	{
		if(brdOff == null)
			throw new NullPointerException
				("String argument passed as Board Off is null");
		if(brdOff.length() != BRD_OFF_LEN)
			throw new IllegalArgumentException
				("Not a valid Board Off. '" + 
				brdOff + 
				"' does not have lenght " +
				BRD_OFF_LEN);
		if(!sIsUpper(brdOff))
			throw new IllegalArgumentException
				("Not a valid Board Off. '" +
				brdOff + 
				"' does not have all upper case letters");			
		return sString2Seq(brdOff);
	}
	
	public static int sBrdOff2Seq(final String brd, final String off)
	{
		return sBrdOff2Seq(brd + off);
	}
	
	public static String sSeq2BrdOff(final int seq)
	{
		if(seq < MIN_SEQ || seq > MAX_BRD_OFF)
			throw new IllegalArgumentException
				("Not a valid Board Off Sequence. " +
				seq +
				" is not in the range " +
				MIN_SEQ +
				".." +
				MAX_BRD_OFF);
		return sSeq2String(seq, BRD_OFF_LEN);
	}
	
	public static int sDate2Seq(final Calendar date)
	{
		return 
			date.get(Calendar.YEAR) * 10000 +
			(date.get(Calendar.MONTH) + 1) * 100 +
			date.get(Calendar.DAY_OF_MONTH);
	}
	
	public static int sDate2Seq(final TemporalAccessor temporalAccessor)
	{
		return Integer.parseInt(yyyyMMdd.format(temporalAccessor));
	}
	
	public static Calendar sSeq2Date(final int seq)
	{
		if(seq < 0)
		throw new IllegalArgumentException
			("Not a valid Date Sequence. " + seq + " is less than 0" );
		return new GregorianCalendar
			(seq / 10000,
			seq % 10000 / 100 - 1,
			seq % 100);											 
	}
	
	public static String sDate2String(final TemporalAccessor date)
	{
		if(date == null)
			return null;
		return yyyyMMdd_HHmmss.format(date);
	}

	public static String sDate2String(final Calendar date)
	{
		if(date == null)
			return null;
		final StringBuffer strBuf = new StringBuffer(16);
		final int dateSeq = sDate2Seq(date);
		for(int devider = 10000000; 
			devider > dateSeq && devider > 1; 
			devider /= 10)
			strBuf.append('0');		
		strBuf.append(dateSeq);
		strBuf.append(' ');
		final int timeSeq = 
			date.get(Calendar.HOUR_OF_DAY) * 10000 +
			date.get(Calendar.MINUTE) * 100 +
			date.get(Calendar.SECOND);
		for(int devider = 100000; 
			devider > timeSeq && devider > 1; 
			devider /= 10)
			strBuf.append('0');
		strBuf.append(timeSeq);
		return strBuf.toString();
	}
	
	public static int sGetClassId(final int pos, final int classSeq)
	{
		return classSeq * 10 + pos;
	}
	
	public static short sDateDifference
		(final Calendar dateA, final Calendar dateB)
	{
		final Calendar midnightA = new GregorianCalendar
			(dateA.get(Calendar.YEAR), dateA.get(Calendar.MONTH),
			dateA.get(Calendar.DAY_OF_MONTH));
		final Calendar midnightB = new GregorianCalendar
			(dateB.get(Calendar.YEAR), dateB.get(Calendar.MONTH),
			dateB.get(Calendar.DAY_OF_MONTH));
		return (short) 
			((midnightA.getTime().getTime() - midnightB.getTime().getTime()) /
			(1000 * 60 *  60 *  24 ));
	}
	
	public static short sDateDifference(final int dateSeqA, final int dateSeqB)
	{
		return (short) 
			((sSeq2Date(dateSeqA).getTime().getTime() - 
			sSeq2Date(dateSeqB).getTime().getTime()) /
			(1000 * 60 *  60 *  24));
	}
	
		
	/**
	 * @param lParseDate long value having PARS Date
	 * @return Calendar representing PARS Date. 
	 * 			Calendar is used as return type to make this method compatible with sDate2Seq method. 
	 */
	public static Calendar sPARSDate2Date(long lParseDate)  
	{
		SimpleDateFormat datestamp = new SimpleDateFormat("MM'/'dd'/'yyyy");
		Date basePARSDate=null;
		GregorianCalendar currDate= new GregorianCalendar();
		try
		{
		basePARSDate = datestamp.parse("1/2/1966");
		}
		catch(ParseException pEx) //Exception is caught so that calling method does not have to handle it.
		{log.debug("This Exception should not occur : " + pEx.toString());}
		currDate.setTime( new Date((lParseDate*1000*60*60*24)+ basePARSDate.getTime()));
		return currDate;
	} 

	// private static methods

	private static int sString2Seq(final String str) 
	{
		int seq = 0;
		for(int i = 0, size = str.length(); i < size; i++)
		{
			seq += (str.charAt(i) - CHAR_BASE_ZERO) *
				Math.pow(CHAR_BASE, size - i - 1);
		}
		return seq + OFF_SET;
	}
	
	private static String sSeq2String(final int seq, final int len)
	{
		StringBuffer str = new StringBuffer(len);
		str.setLength(len);
		int quotient = seq - OFF_SET;
		int pos = len - 1;
		while(quotient >= CHAR_BASE)
		{
			final int remainder = quotient % CHAR_BASE;
			str.setCharAt(pos, (char) (CHAR_BASE_ZERO + remainder));
			quotient /= CHAR_BASE;
			pos --;
		}
		str.setCharAt(pos, (char) (CHAR_BASE_ZERO + quotient));
		pos--;
		while(pos >= 0)
		{
			str.setCharAt(pos, CHAR_BASE_ZERO);
			pos--;
		}
		return str.toString();	
	}
	
	private static int sWeightedString2Seq(final String str) 
	{
		int seq = 0;
		int size = str.length();
		for(int i = 0; i < size; i++)
		{
			seq += WEIGHT[(str.charAt(i) - CHAR_BASE_ZERO)] *
				Math.pow(CHAR_BASE, size - i - 1);
		}
		return seq + OFF_SET;
	}
	
	private static String sWeightedSeq2String(final int seq, final int len)
	{
		StringBuffer str = new StringBuffer(len);
		str.setLength(len);
		int quotient = seq - OFF_SET;
		int pos = len - 1;
		while(quotient >= CHAR_BASE)
		{
			final int remainder = quotient % CHAR_BASE;
			str.setCharAt(pos, WEIGHTED_CHAR[remainder]);
			quotient /= CHAR_BASE;
			pos --;
		}
		str.setCharAt(pos, WEIGHTED_CHAR[quotient]);
		pos--;
		while(pos >= 0)
		{
			str.setCharAt(pos, WEIGHTED_CHAR_BASE_ZERO);
			pos--;
		}
		return str.toString();	
	}
	
	private static boolean sIsUpper(final String str)
	{
		for(int i = 0, len = str.length(); i < len; i++)
			if(str.charAt(i) < 'A' || str.charAt(i) > 'Z')
				return false;
		return true;
	}
	
	// constructors
	
	private SeqConverter()
	{
	}
}
