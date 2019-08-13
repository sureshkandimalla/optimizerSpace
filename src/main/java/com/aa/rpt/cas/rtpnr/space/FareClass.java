package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.util.Date;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;


@SpaceClass
public class FareClass implements Serializable {

	
	private static final long serialVersionUID = 8952149460347438453L;
	private Integer fareClassSeq;
	private String fareClassCode;
	private String fareClassDesc;
	private String cabinCode;
	private String newCabinCode;
	private Date newCabinCodeEffectiveDate;
	private Integer relativeValue;
	private Integer loyaltyValue;

	@SpaceId
	public Integer getFareClassSeq() {
		return fareClassSeq;
	}

	public void setFareClassSeq(Integer fareClassSeq) {
		this.fareClassSeq = fareClassSeq;
	}

	public String getFareClassCode() {
		return fareClassCode;
	}

	public void setFareClassCode(String fareClassCode) {
		this.fareClassCode = fareClassCode;
	}

	public String getFareClassDesc() {
		return fareClassDesc;
	}

	public void setFareClassDesc(String fareClassDesc) {
		this.fareClassDesc = fareClassDesc;
	}

	public String getCabinCode() {
		return cabinCode;
	}

	public void setCabinCode(String cabinCode) {
		this.cabinCode = cabinCode;
	}

	public String getNewCabinCode() {
		return newCabinCode;
	}

	public void setNewCabinCode(String newCabinCode) {
		this.newCabinCode = newCabinCode;
	}

	public Date getNewCabinCodeEffectiveDate() {
		return newCabinCodeEffectiveDate;
	}

	public void setNewCabinCodeEffectiveDate(Date newCabinCodeEffectiveDate) {
		this.newCabinCodeEffectiveDate = newCabinCodeEffectiveDate;
	}

	public int getRelativeValue() {
		return relativeValue;
	}

	public void setRelativeValue(int relativeValue) {
		this.relativeValue = relativeValue;
	}

	public Integer getLoyaltyValue() {
		return loyaltyValue;
	}

	public void setLoyaltyValue(Integer loyaltyValue) {
		this.loyaltyValue = loyaltyValue;
	}

	
}
