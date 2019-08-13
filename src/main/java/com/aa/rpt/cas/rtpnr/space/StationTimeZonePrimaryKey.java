package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;


public class StationTimeZonePrimaryKey implements Serializable{
	
	private static final long serialVersionUID = 359646320590025438L;

	private String timezoneCode;
	private Integer dstStartDateSeq;

	/**
	 * @return the timezoneCode
	 */
	//@JsonProperty("timezoneCode")
	public String getTimezoneCode() {
		return timezoneCode;
	}

	/**
	 * @param timezoneCode the timezoneCode to set
	 */
	public void setTimezoneCode(String timezoneCode) {
		this.timezoneCode = timezoneCode;
	}

	/**
	 * @return the dstStartDateSeq
	 */
	//@JsonProperty("dstStartDateSeq")
	public Integer getDstStartDateSeq() {
		return dstStartDateSeq;
	}

	/**
	 * @param dstStartDateSeq the dstStartDateSeq to set
	 */
	public void setDstStartDateSeq(Integer dstStartDateSeq) {
		this.dstStartDateSeq = dstStartDateSeq;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StationTimeZonePrimaryKey [timezoneCode=" + timezoneCode + ", dstStartDateSeq=" + dstStartDateSeq + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dstStartDateSeq == null) ? 0 : dstStartDateSeq.hashCode());
		result = prime * result + ((timezoneCode == null) ? 0 : timezoneCode.hashCode());
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
		StationTimeZonePrimaryKey other = (StationTimeZonePrimaryKey) obj;
		if (dstStartDateSeq == null) {
			if (other.dstStartDateSeq != null)
				return false;
		} else if (!dstStartDateSeq.equals(other.dstStartDateSeq))
			return false;
		if (timezoneCode == null) {
			if (other.timezoneCode != null)
				return false;
		} else if (!timezoneCode.equals(other.timezoneCode))
			return false;
		return true;
	}

	

}
