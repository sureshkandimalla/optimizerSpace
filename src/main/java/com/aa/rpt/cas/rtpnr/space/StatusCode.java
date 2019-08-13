package com.aa.rpt.cas.rtpnr.space;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

@SpaceClass
public class StatusCode {

	/**
	 * Booking Status Code <br/>
	 * Example:
	 * <ul>
	 * <li>HK</li>
	 * <li>OB</li>
	 * </ul>
	 */

	private String statusCode;

	/**
	 * Booking Status Code Type. <br/>Example:
	 * <ul>
	 * <li>H</li>
	 * <li>W</li>
	 * <li>N</li>
	 * </ul>
	 */
	
	private String statusCodeType;

	/**
	 * Detail Description of the Status Code
	 */
	
	private String statusCodeDesc;
	
	/**
	 * If it is active or not
	 */
	
	private String flownInd;
	
	/**
	 * If TDZ has Taken Action 
	 */
	
	private String tdzActionInd;
	
	
	/**
	 * 
	 */
	
	private String msgInd;
	
	

	@SpaceId
	public String getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}


	public String getStatusCodeType() {
		return statusCodeType;
	}


	public void setStatusCodeType(String statusCodeType) {
		this.statusCodeType = statusCodeType;
	}


	public String getStatusCodeDesc() {
		return statusCodeDesc;
	}


	public void setStatusCodeDesc(String statusCodeDesc) {
		this.statusCodeDesc = statusCodeDesc;
	}


	public String getFlownInd() {
		return flownInd;
	}


	public void setFlownInd(String flownInd) {
		this.flownInd = flownInd;
	}


	public String getTdzActionInd() {
		return tdzActionInd;
	}


	public void setTdzActionInd(String tdzActionInd) {
		this.tdzActionInd = tdzActionInd;
	}


	public String getMsgInd() {
		return msgInd;
	}


	public void setMsgInd(String msgInd) {
		this.msgInd = msgInd;
	}

	@Override
	public String toString(){	
		return "StatusCode: " + statusCode + " StatusCodeType: " + statusCodeType ;
		
	}

}
