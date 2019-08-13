package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

@SpaceClass
public class FlightNbrRange implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6984722337594746671L;

	private FlightNbrRangeId flightNbrRangeId;
	private String category;
	private String flightType;
	private String operatingCarrier;
	private LocalDateTime startTravelData;
	private LocalDateTime endTravelData;
	private String description;
	private Integer count;
	private Integer airlineCode;
	private LocalDateTime excelDate;
	private LocalDateTime rowCreatedDate;
	private Integer flightNo;
	private Integer airlineCodeSeq=0;
	private boolean isExcluded;

	@SpaceId
	public FlightNbrRangeId getFlightNbrRangeId() {
		return flightNbrRangeId;
	}

	public void setFlightNbrRangeId(FlightNbrRangeId flightNbrRangeId) {
		this.flightNbrRangeId = flightNbrRangeId;
	}

	public Integer getFlightNo() {
		return flightNo;
	}

	public boolean isExcluded() {
		return isExcluded;
	}

	public void setExcluded(boolean isExcluded) {
		this.isExcluded = isExcluded;
	}

	public void setFlightNo(Integer flightNo) {
		this.flightNo = flightNo;
	}

	public Integer getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(Integer airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperatingCarrier() {
		return operatingCarrier;
	}

	public void setOperatingCarrier(String operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public LocalDateTime getExcelDate() {
		return excelDate;
	}

	public void setExcelDate(LocalDateTime excelDate) {
		this.excelDate = excelDate;
	}

	public LocalDateTime getStartTravelData() {
		return startTravelData;
	}

	public void setStartTravelData(LocalDateTime startTravelData) {
		this.startTravelData = startTravelData;
	}

	public LocalDateTime getEndTravelData() {
		return endTravelData;
	}

	public void setEndTravelData(LocalDateTime endTravelData) {
		this.endTravelData = endTravelData;
	}

	public LocalDateTime getRowCreatedDate() {
		return rowCreatedDate;
	}

	public void setRowCreatedDate(LocalDateTime rowCreatedDate) {
		this.rowCreatedDate = rowCreatedDate;
	}

	public Integer getAirlineCodeSeq() {
		return airlineCodeSeq;
	}

	public void setAirlineCodeSeq(Integer airlineCodeSeq) {
		this.airlineCodeSeq = airlineCodeSeq;
	}

	@Override
	public String toString() {
		return "FlightNbrRange [category=" + category + ", flightType=" + flightType + ", operatingCarrier="
				+ operatingCarrier + ", startTravelData=" + startTravelData + ", endTravelData=" + endTravelData
				+ ", description=" + description + ", count=" + count + ", airlineCode=" + airlineCode + ", excelDate="
				+ excelDate + ", rowCreatedDate=" + rowCreatedDate + ", flightNo=" + flightNo + ", isExcluded="
				+ isExcluded + "]";
	}

}
