package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.time.LocalDateTime;



public class FlightNbrRangeId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -398827117384019462L;
	private Integer startRange;
	private Integer endRange;
	private LocalDateTime effDate;
	private LocalDateTime discDate;

	public Integer getStartRange() {
		return startRange;
	}

	public void setStartRange(Integer startRange) {
		this.startRange = startRange;
	}

	public Integer getEndRange() {
		return endRange;
	}

	public void setEndRange(Integer endRange) {
		this.endRange = endRange;
	}

	public LocalDateTime getEffDate() {
		return effDate;
	}
	public void setEffDate(LocalDateTime effDate) {

		this.effDate = effDate;
	}
	
	public LocalDateTime getDiscDate() {

		return discDate;
	}
	public void setDiscDate(LocalDateTime discDate) {
		this.discDate = discDate;
	}

	@Override
	public int hashCode() {
		final Integer prime = 31;
		Integer result = 1;
		result = prime * result + ((discDate == null) ? 0 : discDate.hashCode());
		result = prime * result + ((effDate == null) ? 0 : effDate.hashCode());
		result = prime * result + endRange;
		result = prime * result + startRange;
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
		FlightNbrRangeId other = (FlightNbrRangeId) obj;
		if (discDate == null) {
			if (other.discDate != null)
				return false;
		} else if (!discDate.equals(other.discDate))
			return false;
		if (effDate == null) {
			if (other.effDate != null)
				return false;
		} else if (!effDate.equals(other.effDate))
			return false;
		if (endRange != other.endRange)
			return false;
		if (startRange != other.startRange)
			return false;
		return true;
	}

	public FlightNbrRangeId() {
		
	}
	
	@Override
	public String toString() {
		return "FlightNbrRangeId [startRange=" + startRange + ", endRange=" + endRange + ", effDate=" + effDate
				+ ", discDate=" + discDate + "]";
	}
	
}
