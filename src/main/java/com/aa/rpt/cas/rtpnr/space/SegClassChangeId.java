package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.util.Objects;

public class SegClassChangeId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8777226029536214749L;
	private String locator;
	private Integer seqNumber;
	private Long segId;
	private String newOrOld;
	private String segFareClass;
	
	
	
	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public Integer getSeqNumber() {
		return seqNumber;
	}

	public void setSeqNumber(Integer seqNumber) {
		this.seqNumber = seqNumber;
	}

	public Long getSegId() {
		return segId;
	}

	public void setSegId(Long segId) {
		this.segId = segId;
	}

	public String getNewOrOld() {
		return newOrOld;
	}

	public void setNewOrOld(String newOrOld) {
		this.newOrOld = newOrOld;
	}

	public String getSegFareClass() {
		return segFareClass;
	}

	public void setSegFareClass(String segFareClass) {
		this.segFareClass = segFareClass;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SegClassChangeId that = (SegClassChangeId) o;
		return Objects.equals(locator, that.locator) && 
				Objects.equals(seqNumber, that.seqNumber)
				&& Objects.equals(segId, that.segId) 
				&& Objects.equals(newOrOld, that.newOrOld)
				&& Objects.equals(segFareClass, that.segFareClass)
				;
	}

	@Override
	public int hashCode() {

		return Objects.hash(locator, seqNumber, segId, newOrOld, segFareClass);
	}

	@Override
	public String toString() {
		return "SegClassChangeId [locator=" + locator + ", seqNumber=" + seqNumber + ", segId=" + segId + ", newOrOld="
				+ newOrOld + ", segFareClass=" + segFareClass + "]";
	}
	
	

}
