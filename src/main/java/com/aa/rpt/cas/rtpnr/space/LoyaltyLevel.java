package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

@SpaceClass
public class LoyaltyLevel implements Serializable{

	private static final long serialVersionUID = 8952149460347438872L;
	private Integer loyaltyNumericCode;
	private String loyaltyLevelCode;
	private String loyaltyPgm1Code;
	private String loyaltyPgm2Code;
	private String oneWorldTier;
	private String loyaltyDesc;

	/**
	 * @return the loyaltyNumericCode
	 */
	//@JsonProperty("loyaltyNumericCode")
	@SpaceId
	public Integer getLoyaltyNumericCode() {
		return loyaltyNumericCode;
	}

	/**
	 * @param loyaltyNumericCode the loyaltyNumericCode to set
	 */
	public void setLoyaltyNumericCode(Integer loyaltyNumericCode) {
		this.loyaltyNumericCode = loyaltyNumericCode;
	}

	/**
	 * @return the loyaltyLevelCode
	 */
	//@JsonProperty("loyaltyLevelCode")
	public String getLoyaltyLevelCode() {
		return loyaltyLevelCode;
	}

	/**
	 * @param loyaltyLevelCode the loyaltyLevelCode to set
	 */
	public void setLoyaltyLevelCode(String loyaltyLevelCode) {
		this.loyaltyLevelCode = loyaltyLevelCode;
	}

	/**
	 * @return the loyaltyPgm1Code
	 */
	//@JsonProperty("loyaltyPgm1Code")
	public String getLoyaltyPgm1Code() {
		return loyaltyPgm1Code;
	}

	/**
	 * @param loyaltyPgm1Code the loyaltyPgm1Code to set
	 */
	public void setLoyaltyPgm1Code(String loyaltyPgm1Code) {
		this.loyaltyPgm1Code = loyaltyPgm1Code;
	}

	/**
	 * @return the loyaltyPgm2Code
	 */
	//@JsonProperty("loyaltyPgm2Code")
	public String getLoyaltyPgm2Code() {
		return loyaltyPgm2Code;
	}

	/**
	 * @param loyaltyPgm2Code the loyaltyPgm2Code to set
	 */
	public void setLoyaltyPgm2Code(String loyaltyPgm2Code) {
		this.loyaltyPgm2Code = loyaltyPgm2Code;
	}

	/**
	 * @return the oneWorldTier
	 */
	//@JsonProperty("oneWorldTier")
	public String getOneWorldTier() {
		return oneWorldTier;
	}

	/**
	 * @param oneWorldTier the oneWorldTier to set
	 */
	public void setOneWorldTier(String oneWorldTier) {
		this.oneWorldTier = oneWorldTier;
	}

	/**
	 * @return the loyaltyDesc
	 */
	//@JsonProperty("loyaltyDesc")
	public String getLoyaltyDesc() {
		return loyaltyDesc;
	}

	/**
	 * @param loyaltyDesc the loyaltyDesc to set
	 */
	public void setLoyaltyDesc(String loyaltyDesc) {
		this.loyaltyDesc = loyaltyDesc;
	}
	
}
