package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PNRSegmentId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 336085607021948692L;
	private LocalDateTime pnrCreateDateTime;
	private String pnrLocator ;
	private LocalDate segDepartureDate;
	private Integer segFlightNumber=0;
	private String segBoard;
	private String segOff;
	public LocalDateTime getPnrCreateDateTime() {
		return pnrCreateDateTime;
	}
	public void setPnrCreateDateTime(LocalDateTime pnrCreateDateTime) {
		this.pnrCreateDateTime = pnrCreateDateTime;
	}
	public String getPnrLocator() {
		return pnrLocator;
	}
	public void setPnrLocator(String pnrLocator) {
		this.pnrLocator = pnrLocator;
	}
	public LocalDate getSegDepartureDate() {
		return segDepartureDate;
	}
	public void setSegDepartureDate(LocalDate segDepartureDate) {
		this.segDepartureDate = segDepartureDate;
	}
	public Integer getSegFlightNumber() {
		return segFlightNumber;
	}
	public void setSegFlightNumber(Integer segFlightNumber) {
		this.segFlightNumber = segFlightNumber;
	}
	public String getSegBoard() {
		return segBoard;
	}
	public void setSegBoard(String segBoard) {
		this.segBoard = segBoard;
	}
	public String getSegOff() {
		return segOff;
	}
	public void setSegOff(String segOff) {
		this.segOff = segOff;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pnrCreateDateTime == null) ? 0 : pnrCreateDateTime.hashCode());
		result = prime * result + ((pnrLocator == null) ? 0 : pnrLocator.hashCode());
		result = prime * result + ((segBoard == null) ? 0 : segBoard.hashCode());
		result = prime * result + ((segDepartureDate == null) ? 0 : segDepartureDate.hashCode());
		result = prime * result + ((segFlightNumber == null) ? 0 : segFlightNumber.hashCode());
		result = prime * result + ((segOff == null) ? 0 : segOff.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PNRSegmentId other = (PNRSegmentId) obj;
		if (pnrCreateDateTime == null) {
			if (other.pnrCreateDateTime != null)
				return false;
		} else if (!pnrCreateDateTime.equals(other.pnrCreateDateTime))
			return false;
		if (pnrLocator == null) {
			if (other.pnrLocator != null)
				return false;
		} else if (!pnrLocator.equals(other.pnrLocator))
			return false;
		if (segBoard == null) {
			if (other.segBoard != null)
				return false;
		} else if (!segBoard.equals(other.segBoard))
			return false;
		if (segDepartureDate == null) {
			if (other.segDepartureDate != null)
				return false;
		} else if (!segDepartureDate.equals(other.segDepartureDate))
			return false;
		if (segFlightNumber == null) {
			if (other.segFlightNumber != null)
				return false;
		} else if (!segFlightNumber.equals(other.segFlightNumber))
			return false;
		if (segOff == null) {
			if (other.segOff != null)
				return false;
		} else if (!segOff.equals(other.segOff))
			return false;
		return true;
	}
	
	
	

}
