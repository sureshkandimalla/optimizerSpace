package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

@SpaceClass
public class StationTimeZone  implements Serializable{
	
	private static final long serialVersionUID = 8850541632160959499L;
	
	StationTimeZonePrimaryKey stationTimeZonePrimaryKey;
	private Integer dstEndDateSeq;
	private String gmtOffSet;
	private Integer dstOffSet;
	private String dstGroupDesc;
	private String dstGroupName;
	private String dstStartStatCode;
	private String dstEndStatCode;
	private LocalDateTime dstStartTime;
	private LocalDateTime dstEndTime;
	private	ZonedDateTime dstGmtStartTime;
	private ZonedDateTime dstGmtEndTime;
	
	@SpaceId
	public StationTimeZonePrimaryKey getStationTimeZonePrimaryKey() {
		return stationTimeZonePrimaryKey;
	}

	public void setStationTimeZonePrimaryKey(StationTimeZonePrimaryKey stationTimeZonePrimaryKey) {
		this.stationTimeZonePrimaryKey = stationTimeZonePrimaryKey;
	}
	
	/**
	 * @return the timezoneCode
	 */
	public String getTimezoneCode() {
		return getStationTimeZonePrimaryKey().getTimezoneCode();
	}


	/**
	 * @return the dstStartDateSeq
	 */
	public Integer getDstStartDateSeq() {
		return getStationTimeZonePrimaryKey().getDstStartDateSeq();
	}


	/**
	 * @return the dstEndDateSeq
	 */
	public Integer getDstEndDateSeq() {
		return dstEndDateSeq;
	}

	/**
	 * @param dstEndDateSeq the dstEndDateSeq to set
	 */
	public void setDstEndDateSeq(Integer dstEndDateSeq) {
		this.dstEndDateSeq = dstEndDateSeq;
	}

	/**
	 * @return the gmtOffSet
	 */
	public String getGmtOffSet() {
		return gmtOffSet;
	}

	/**
	 * @param gmtOffSet the gmtOffSet to set
	 */
	public void setGmtOffSet(String gmtOffSet) {
		this.gmtOffSet = gmtOffSet;
	}

	/**
	 * @return the dstOffSet
	 */
	public Integer getDstOffSet() {
		return dstOffSet;
	}

	/**
	 * @param dstOffSet the dstOffSet to set
	 */
	public void setDstOffSet(Integer dstOffSet) {
		this.dstOffSet = dstOffSet;
	}

	public String getDstGroupDesc() {
		return dstGroupDesc;
	}

	public void setDstGroupDesc(String dstGroupDesc) {
		this.dstGroupDesc = dstGroupDesc;
	}

	public String getDstGroupName() {
		return dstGroupName;
	}

	public void setDstGroupName(String dstGroupName) {
		this.dstGroupName = dstGroupName;
	}

	public String getDstStartStatCode() {
		return dstStartStatCode;
	}

	public void setDstStartStatCode(String dstStartStatCode) {
		this.dstStartStatCode = dstStartStatCode;
	}

	public String getDstEndStatCode() {
		return dstEndStatCode;
	}

	public void setDstEndStatCode(String dstEndStatCode) {
		this.dstEndStatCode = dstEndStatCode;
	}

	public LocalDateTime getDstStartTime() {
		return dstStartTime;
	}

	public void setDstStartTime(LocalDateTime dstStartTime) {
		this.dstStartTime = dstStartTime;
	}

	public LocalDateTime getDstEndTime() {
		return dstEndTime;
	}

	public void setDstEndTime(LocalDateTime dstEndTime) {
		this.dstEndTime = dstEndTime;
	}

	public ZonedDateTime getDstGmtStartTime() {
		return dstGmtStartTime;
	}

	public void setDstGmtStartTime(ZonedDateTime dstGmtStartTime) {
		this.dstGmtStartTime = dstGmtStartTime;
	}

	public ZonedDateTime getDstGmtEndTime() {
		return dstGmtEndTime;
	}

	public void setDstGmtEndTime(ZonedDateTime dstGmtEndTime) {
		this.dstGmtEndTime = dstGmtEndTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "StationTimeZone [timezoneCode=" + getTimezoneCode() + ", dstStartDateSeq=" + getDstStartDateSeq()
				+ ", dstEndDateSeq=" + dstEndDateSeq + ", gmtOffSet=" + gmtOffSet + ", dstOffSet=" + dstOffSet
				+ ", dstGroupDesc=" + dstGroupDesc + ", dstGroupName=" + dstGroupName + ", dstStartStatCode="
				+ dstStartStatCode + ", dstEndStatCode=" + dstEndStatCode 
				+ ", dstStartTime=" + dstStartTime + ", dstEndTime=" + dstEndTime + ", dstGmtStartTime="
				+ dstGmtStartTime + ", dstGmtEndTime=" + dstGmtEndTime + "]";
	}
	
	

}
