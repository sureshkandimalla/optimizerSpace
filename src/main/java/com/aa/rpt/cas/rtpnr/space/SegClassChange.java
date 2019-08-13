package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.time.LocalDate;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.annotation.pojo.SpaceRouting;

@SpaceClass
public class SegClassChange implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8616644242205343775L;
	private SegClassChangeId id;
	private String segAirlineCode;
	private LocalDate segDepartureDate;
	private Integer segFlightNumber;
	private String board;
	private String off;
	private Character cabinCode;
	private Boolean segInbound;
	
	private Character pnrTicketStatus;
	private Character pnrGroupType;
	private Integer pnrNumberInNames;
	private String pnrTicketInfo;

	private String segStatusCode;
	private String SegStatusCodeType;
	private Integer segSabreNumberInParty;
	private String segMarketingAirline;
	private Boolean segCodeShare=false;
	
	private Boolean processed = false;

	
	@SpaceId
	public SegClassChangeId getId() {
		return id;
	}

	public void setId(SegClassChangeId id) {
		this.id = id;
	}

	

	public String getSegAirlineCode() {
		return segAirlineCode;
	}

	public void setSegAirlineCode(String segAirlineCode) {
		this.segAirlineCode = segAirlineCode;
	}

	public LocalDate getSegDepartureDate() {
		return segDepartureDate;
	}

	public void setSegDepartureDate(LocalDate segDepartureDate) {
		this.segDepartureDate = segDepartureDate;
	}

	@SpaceRouting
	public Integer getSegFlightNumber() {
		return segFlightNumber;
	}

	public void setSegFlightNumber(Integer segFlightNumber) {
		this.segFlightNumber = segFlightNumber;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getOff() {
		return off;
	}

	public void setOff(String off) {
		this.off = off;
	}

	public Character getCabinCode() {
		return cabinCode;
	}

	public void setCabinCode(Character cabinCode) {
		this.cabinCode = cabinCode;
	}

	public Boolean getSegInbound() {
		return segInbound;
	}

	public void setSegInbound(Boolean segInbound) {
		this.segInbound = segInbound;
	}

	public Character getPnrTicketStatus() {
		return pnrTicketStatus;
	}

	public void setPnrTicketStatus(Character pnrTicketStatus) {
		this.pnrTicketStatus = pnrTicketStatus;
	}

	public Character getPnrGroupType() {
		return pnrGroupType;
	}

	public void setPnrGroupType(Character pnrGroupType) {
		this.pnrGroupType = pnrGroupType;
	}

	public Integer getPnrNumberInNames() {
		return pnrNumberInNames;
	}

	public void setPnrNumberInNames(Integer pnrNumberInNames) {
		this.pnrNumberInNames = pnrNumberInNames;
	}

	public String getPnrTicketInfo() {
		return pnrTicketInfo;
	}

	public void setPnrTicketInfo(String pnrTicketInfo) {
		this.pnrTicketInfo = pnrTicketInfo;
	}

	public String getSegStatusCode() {
		return segStatusCode;
	}

	public void setSegStatusCode(String segStatusCode) {
		this.segStatusCode = segStatusCode;
	}

	public String getSegStatusCodeType() {
		return SegStatusCodeType;
	}

	public void setSegStatusCodeType(String segStatusCodeType) {
		SegStatusCodeType = segStatusCodeType;
	}

	public Integer getSegSabreNumberInParty() {
		return segSabreNumberInParty;
	}

	public void setSegSabreNumberInParty(Integer segSabreNumberInParty) {
		this.segSabreNumberInParty = segSabreNumberInParty;
	}

	public String getSegMarketingAirline() {
		return segMarketingAirline;
	}

	public void setSegMarketingAirline(String segMarketingAirline) {
		this.segMarketingAirline = segMarketingAirline;
	}

	public Boolean getSegCodeShare() {
		return segCodeShare;
	}

	public void setSegCodeShare(Boolean segCodeShare) {
		this.segCodeShare = segCodeShare;
	}

	public Boolean getProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Override
	public String toString() {
		return "SegClassChange [id=" + id + ", segAirlineCode=" + segAirlineCode + ", segDepartureDate="
				+ segDepartureDate + ", segFlightNumber=" + segFlightNumber + ", board=" + board + ", off=" + off
				+ ", cabinCode=" + cabinCode + ", segInbound=" + segInbound + ", pnrTicketStatus=" + pnrTicketStatus
				+ ", pnrGroupType=" + pnrGroupType + ", pnrNumberInNames=" + pnrNumberInNames + ", pnrTicketInfo="
				+ pnrTicketInfo + ", segStatusCode=" + segStatusCode + ", SegStatusCodeType=" + SegStatusCodeType
				+ ", segSabreNumberInParty=" + segSabreNumberInParty + ", segMarketingAirline=" + segMarketingAirline
				+ ", segCodeShare=" + segCodeShare + ", processed=" + processed + "]";
	}
	
	

}
