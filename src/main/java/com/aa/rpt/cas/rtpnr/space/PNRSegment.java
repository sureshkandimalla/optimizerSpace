package com.aa.rpt.cas.rtpnr.space;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import com.aa.rpt.cas.util.SeqConverter;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

@SpaceClass
public class PNRSegment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4490540017968260274L;
	PNRSegmentId id;
	
	//PNR Level Fields
	private LocalDate pnrPurgeDate;
	private Boolean pnrInfant=false;
	private Boolean pnrParentPnr=false;
	private Boolean pnrChildPnr=false;
	private Character pnrTicketStatus=' ';
	private Boolean pnrCodeShare=false;
	private Boolean pnrBlockSpaceRemark=false;
	private Integer pnrCurrentHistorySeq=0;
	private Character pnrPrimaryNameType=' ';
	private Character pnrGroupType=' ';
	private Boolean pnrPlt=false;
	private String pnrPrimaryName;
	private int pnrSeqNumber=0;
	private String pnrAaaCityCode;
	private String pnrHomeStationCityCode;
	private String pnrCreateDutyCode;
	private String pnrCreateAgentSine;
	private String pnrCreatePLTOfficeDesignator;
	private String pnrCreateCRSCode;
	private String pnrCreationCountryCode;
	private String pnrAgencyOwner;
	private Integer pnrNumberInParty=0;
	private Integer pnrNumberOfInfants=0;
	private Integer pnrNumberInNames=0;
	private Integer pnrOrigNumberInNames=0;
	private Integer pnrAadvantageCount=0;
	private Integer pnrExecutivePlatinumCount=0;
	private Integer pnrPlatinumCount=0;
	private Integer pnrVipCount=0;
	private Integer pnrSeniorCitizenCount=0;
	private Integer pnrSeniorCitizenCompanionCount=0;
	private Integer pnrGoldCount=0;
	private Integer pnrPlatinumProCount=0;
	private Integer pnrConciergeKeyCount=0;
	private Integer pnrAirPassCount=0;
	private String pnrImmediateParentLocator;
	private LocalDateTime pnrDivideDateTime;
	private String pnrTicketInfo;
	private String pnrContractNumber;
	private LocalDateTime pnrReceivedDateTime;
	private LocalDateTime pnrLastUpdateDateTime;
	private String pnrOrigBkgCRSCode;
	private String pnrOrigBkgAgencyIATANumber;
	private String pnrOrigBkgAgencyCityCode;
	private String pnrOrigBkgCountryCode;
	private String pnrOrigBkgDutyCode;
	private Boolean pnrHistoryTruncated=false;
	private Boolean pnrHistoryCorrupted=false;
	private LocalDateTime pnrHistoryResetDate;
	private String pnrRlocText;
	private String pnrRlocCRSCityCode;
	private String pnrRlocCRSCode;
	private String pnrRlocOAPnrLocator;
	private String pnrRlocAgencyIdCode;
	private String pnrRlocAgencyIATANumber;
	private String pnrRlocAgencyCityCode;
	private String pnrOrigParentLocator;
	private String pnrPointOfOriginCityCode;
	private Boolean pnrNonRev=false;
	private Boolean pnrPositiveSpace=false;
	private Boolean pnrAwardBooking=false;
	private Boolean pnrGovtFare=false;
	private Boolean pnrExtraSeat=false;
	private Boolean pnrCabinBaggage=false;
	private Boolean pnrAirpass=false;
	private String pnrAirpassType;
	private Boolean pnrFqtuSSR=false;
	private Boolean pnrAutoReqOptOut=false;
	private Boolean pnrItinActiveInd=false;
	private Boolean pnrVcrInd=false;
	private Boolean pnrRmEstimateInd=false;
	private Boolean pnrUmnrSSR=false;
	private Boolean pnrPetSSR=false;
	
	//Segment Level Fields	
	private Long segId=0L;
	private String segAirline;
	//private LocalDateTime segDepartureDate;
	//private Integer segFlightNumber;
	//private String segBoard;
	//private String segOff;
	private String segBoardCountryCode;
	private String segOffCountryCode;
	private String segFareClass;
	private Integer segSequence=0;
	private String segStatusCode;
	private String segOrigStatusCode;
	private Character segCabinCode=' ';
	private Boolean segActive=false;
	private Boolean segInbound=false;
	private Boolean segOutbound=false;
	private Integer segSabreNumberInParty=0;
	private Integer segOrigNumberInParty=0;
	private String segPrevStatusCode;
	private Boolean segRoundRobinCity=false;
	private String segBsgLocator;
	private LocalDateTime segBookingDateTime;
	private LocalDateTime segCreateDateTime;
	private LocalDateTime segCancelDateTime;
	private Boolean segCodeShare=false;
	private String segCrsCode;
	private String segAgencyIATANumber;
	private String segAgencyCityCode;
	private String segCountryCode;
	private String segDutyCode;
	private String segMarketingAirline;
	private String segOperatingAirline;
	private String segMarketingClass;
	private String segOperatingClass;
	private Integer segMarketingFlightNbr=0;
	private Integer segOperatingFlightNbr=0;
	private LocalDateTime segKlDateTime;
	private LocalDateTime segObDateTime;
	private LocalDateTime segLastUpdate;
	private LocalDateTime segDepartureDateTime;
	private LocalDateTime segArrivalDateTime;
	private String segBkgAAACityCode;
	private String segBkgHomeStaCityCode;
	private String segBkgDutyCode;
	private String segBkgAgentSine;
	private String segBkgPltOfficeDesignator;
	private String segBkgCrsCode;
	private String segCurrentAAACityCode;
	private String segCurrentHomeStaCityCode;
	private String segCurrentAgentSine;
	private String segCurrentDutyCode;
	private String segCurrentPltOfficeDesignator; 
	private String segCurrentCrsCode;
	private String segCancelAAACityCode;
	private String segCancelHomeStaCityCode;
	private String segCancelAgentSine;
	private String segCancelDutyCode;
	private String segCancelPltOfficeDesignator;
	private String segCancelCrsCode;
	private String segBkgReceivedFrom;
	private String segCurrentReceivedFrom;
	private String segCancelReceivedFrom;
	private Boolean segCopiedFromParent=false;
	private ZonedDateTime segDepartureDateTimeGMT;
	private ZonedDateTime segArrivalDateTimeGMT;
	private Boolean segMarriedSegment=false;
	private Boolean segFqtuSSR=false;
	private Boolean segIrssSSR=false;
	private LocalDate segTripDepartureDate;
	private String segTripBoard;
	private String segTripOff;
	private Boolean segInline=false;
	private Boolean segOnline=false;
	private Boolean segOffline=false;
	private String segUniqueId;
	private String segOriginalFare;
	private String segEffectiveBidPrice;
	private String segAdjustedFare;
	private String segAdjustedBidPrice;
	private String segFootprintFareClass;
	private String segLowestAvailFareClass;
	private String segPointOfCommencement;
	private Integer segCustomerScore=0;
	private String segAdditionalFlag;
	private String segAdditionalData;
	private Integer segTierLevel=0;
	private String segSupplierCode;
	private String segMarketTypeOrigin;
	private Integer segMarketTypeOriginLevel=0;
	private String segMarketTypeDestination;
	private Integer segMarketTypeDestinationLevel=0;
	private String segTripMarketOrigin;
	private Integer segTripMarketOriginLevel=0;
	private String segTripMarketDestination;
	private Integer segTripMarketDestinationLevel;
	private String segFareMarketOrigin;
	private Integer segFareMarketOriginLevel;
	private String segFareMarketDestination;
	private Integer segFareMarketDestinationLevel;
	private Boolean segRegularFareType=false;
	private Boolean segSponsorFareType=false;
	private Boolean segDefaultFareType=false;
	private Boolean segSponsorDefault=false;
	private Boolean segHostDefault=false;
	private Boolean segDefaultEvaluationType=false;
	private Boolean segSumOfLocals=false;
	private Boolean segTrueOD=false;
	private Boolean segLongestSegmentFare=false;
	private Boolean segDominantSegmentFare=false;
	private Boolean segLocal=false;
	private Boolean segFinancial=false;
	private Boolean segPhysical=false;
	private Boolean segForcedSell=false;
	private Boolean segSchedChg=false;
	private Boolean segForcedPartialCancel=false;
	private Boolean segTtyRejectAgent=false;
	private Boolean segTtyTransaction=false;

	
	
	
	@SpaceId
	public PNRSegmentId getId() {
		return id;
	}
	public void setId(PNRSegmentId id) {
		this.id = id;
	}
	/*
	 * public LocalDateTime getPnrCreateDateTime() { return pnrCreateDateTime; } public
	 * void setPnrCreateDateTime(LocalDateTime pnrCreateDateTime) {
	 * this.pnrCreateDateTime = pnrCreateDateTime; } public String getPnrLocator() {
	 * return pnrLocator; } public void setPnrLocator(String pnrLocator) {
	 * this.pnrLocator = pnrLocator; }
	 */
	public LocalDate getPnrPurgeDate() {
		return pnrPurgeDate;
	}
	public void setPnrPurgeDate(LocalDate pnrPurgeDate) {
		this.pnrPurgeDate = pnrPurgeDate;
	}
	public Boolean isPnrInfant() {
		return pnrInfant;
	}
	public void setPnrInfant(Boolean pnrInfant) {
		this.pnrInfant = pnrInfant;
	}
	public Boolean isPnrParentPnr() {
		return pnrParentPnr;
	}
	public void setPnrParentPnr(Boolean pnrParentPnr) {
		this.pnrParentPnr = pnrParentPnr;
	}
	public Boolean isPnrChildPnr() {
		return pnrChildPnr;
	}
	public void setPnrChildPnr(Boolean pnrChildPnr) {
		this.pnrChildPnr = pnrChildPnr;
	}
	public Character getPnrTicketStatus() {
		return pnrTicketStatus;
	}
	public void setPnrTicketStatus(Character pnrTicketStatus) {
		this.pnrTicketStatus = pnrTicketStatus;
	}
	public Boolean isPnrCodeShare() {
		return pnrCodeShare;
	}
	public void setPnrCodeShare(Boolean pnrCodeShare) {
		this.pnrCodeShare = pnrCodeShare;
	}
	public Boolean isPnrBlockSpaceRemark() {
		return pnrBlockSpaceRemark;
	}
	public void setPnrBlockSpaceRemark(Boolean pnrBlockSpaceRemark) {
		this.pnrBlockSpaceRemark = pnrBlockSpaceRemark;
	}
	public Integer getPnrCurrentHistorySeq() {
		return pnrCurrentHistorySeq;
	}
	public void setPnrCurrentHistorySeq(Integer pnrCurrentHistorySeq) {
		this.pnrCurrentHistorySeq = pnrCurrentHistorySeq;
	}
	public Character getPnrPrimaryNameType() {
		return pnrPrimaryNameType;
	}
	public void setPnrPrimaryNameType(Character pnrPrimaryNameType) {
		this.pnrPrimaryNameType = pnrPrimaryNameType;
	}
	public Character getPnrGroupType() {
		return pnrGroupType;
	}
	public void setPnrGroupType(Character pnrGroupType) {
		this.pnrGroupType = pnrGroupType;
	}
	public Boolean isPnrPlt() {
		return pnrPlt;
	}
	public void setPnrPlt(Boolean pnrPlt) {
		this.pnrPlt = pnrPlt;
	}
	public String getPnrPrimaryName() {
		return pnrPrimaryName;
	}
	public void setPnrPrimaryName(String pnrPrimaryName) {
		this.pnrPrimaryName = pnrPrimaryName;
	}
	public int getPnrSeqNumber() {
		return pnrSeqNumber;
	}
	public void setPnrSeqNumber(int pnrSeqNumber) {
		this.pnrSeqNumber = pnrSeqNumber;
	}
	public String getPnrAaaCityCode() {
		return pnrAaaCityCode;
	}
	public void setPnrAaaCityCode(String pnrAaaCityCode) {
		this.pnrAaaCityCode = pnrAaaCityCode;
	}
	public String getPnrHomeStationCityCode() {
		return pnrHomeStationCityCode;
	}
	public void setPnrHomeStationCityCode(String pnrHomeStationCityCode) {
		this.pnrHomeStationCityCode = pnrHomeStationCityCode;
	}
	public String getPnrCreateDutyCode() {
		return pnrCreateDutyCode;
	}
	public void setPnrCreateDutyCode(String pnrCreateDutyCode) {
		this.pnrCreateDutyCode = pnrCreateDutyCode;
	}
	public String getPnrCreateAgentSine() {
		return pnrCreateAgentSine;
	}
	public void setPnrCreateAgentSine(String pnrCreateAgentSine) {
		this.pnrCreateAgentSine = pnrCreateAgentSine;
	}
	public String getPnrCreatePLTOfficeDesignator() {
		return pnrCreatePLTOfficeDesignator;
	}
	public void setPnrCreatePLTOfficeDesignator(String pnrCreatePLTOfficeDesignator) {
		this.pnrCreatePLTOfficeDesignator = pnrCreatePLTOfficeDesignator;
	}
	public String getPnrCreateCRSCode() {
		return pnrCreateCRSCode;
	}
	public void setPnrCreateCRSCode(String pnrCreateCRSCode) {
		this.pnrCreateCRSCode = pnrCreateCRSCode;
	}
	public String getPnrCreationCountryCode() {
		return pnrCreationCountryCode;
	}
	public void setPnrCreationCountryCode(String pnrCreationCountryCode) {
		this.pnrCreationCountryCode = pnrCreationCountryCode;
	}
	public String getPnrAgencyOwner() {
		return pnrAgencyOwner;
	}
	public void setPnrAgencyOwner(String pnrAgencyOwner) {
		this.pnrAgencyOwner = pnrAgencyOwner;
	}
	public Integer getPnrNumberInParty() {
		return pnrNumberInParty;
	}
	public void setPnrNumberInParty(Integer pnrNumberInParty) {
		this.pnrNumberInParty = pnrNumberInParty;
	}
	public Integer getPnrNumberOfInfants() {
		return pnrNumberOfInfants;
	}
	public void setPnrNumberOfInfants(Integer pnrNumberOfInfants) {
		this.pnrNumberOfInfants = pnrNumberOfInfants;
	}
	public Integer getPnrNumberInNames() {
		return pnrNumberInNames;
	}
	public void setPnrNumberInNames(Integer pnrNumberInNames) {
		this.pnrNumberInNames = pnrNumberInNames;
	}
	public Integer getPnrOrigNumberInNames() {
		return pnrOrigNumberInNames;
	}
	public void setPnrOrigNumberInNames(Integer pnrOrigNumberInNames) {
		this.pnrOrigNumberInNames = pnrOrigNumberInNames;
	}
	public Integer getPnrAadvantageCount() {
		return pnrAadvantageCount;
	}
	public void setPnrAadvantageCount(Integer pnrAadvantageCount) {
		this.pnrAadvantageCount = pnrAadvantageCount;
	}
	public Integer getPnrExecutivePlatinumCount() {
		return pnrExecutivePlatinumCount;
	}
	public void setPnrExecutivePlatinumCount(Integer pnrExecutivePlatinumCount) {
		this.pnrExecutivePlatinumCount = pnrExecutivePlatinumCount;
	}
	public Integer getPnrPlatinumCount() {
		return pnrPlatinumCount;
	}
	public void setPnrPlatinumCount(Integer pnrPlatinumCount) {
		this.pnrPlatinumCount = pnrPlatinumCount;
	}
	public Integer getPnrVipCount() {
		return pnrVipCount;
	}
	public void setPnrVipCount(Integer pnrVipCount) {
		this.pnrVipCount = pnrVipCount;
	}
	public Integer getPnrSeniorCitizenCount() {
		return pnrSeniorCitizenCount;
	}
	public void setPnrSeniorCitizenCount(Integer pnrSeniorCitizenCount) {
		this.pnrSeniorCitizenCount = pnrSeniorCitizenCount;
	}
	public Integer getPnrSeniorCitizenCompanionCount() {
		return pnrSeniorCitizenCompanionCount;
	}
	public void setPnrSeniorCitizenCompanionCount(Integer pnrSeniorCitizenCompanionCount) {
		this.pnrSeniorCitizenCompanionCount = pnrSeniorCitizenCompanionCount;
	}
	public Integer getPnrGoldCount() {
		return pnrGoldCount;
	}
	public void setPnrGoldCount(Integer pnrGoldCount) {
		this.pnrGoldCount = pnrGoldCount;
	}
	public Integer getPnrPlatinumProCount() {
		return pnrPlatinumProCount;
	}
	public void setPnrPlatinumProCount(Integer pnrPlatinumProCount) {
		this.pnrPlatinumProCount = pnrPlatinumProCount;
	}
	public Integer getPnrConciergeKeyCount() {
		return pnrConciergeKeyCount;
	}
	public void setPnrConciergeKeyCount(Integer pnrConciergeKeyCount) {
		this.pnrConciergeKeyCount = pnrConciergeKeyCount;
	}
	public Integer getPnrAirPassCount() {
		return pnrAirPassCount;
	}
	public void setPnrAirPassCount(Integer pnrAirPassCount) {
		this.pnrAirPassCount = pnrAirPassCount;
	}
	public String getPnrImmediateParentLocator() {
		return pnrImmediateParentLocator;
	}
	public void setPnrImmediateParentLocator(String pnrImmediateParentLocator) {
		this.pnrImmediateParentLocator = pnrImmediateParentLocator;
	}
	public LocalDateTime getPnrDivideDateTime() {
		return pnrDivideDateTime;
	}
	public void setPnrDivideDateTime(LocalDateTime pnrDivideDateTime) {
		this.pnrDivideDateTime = pnrDivideDateTime;
	}
	public String getPnrTicketInfo() {
		return pnrTicketInfo;
	}
	public void setPnrTicketInfo(String pnrTicketInfo) {
		this.pnrTicketInfo = pnrTicketInfo;
	}
	public String getPnrContractNumber() {
		return pnrContractNumber;
	}
	public void setPnrContractNumber(String pnrContractNumber) {
		this.pnrContractNumber = pnrContractNumber;
	}
	public LocalDateTime getPnrReceivedDateTime() {
		return pnrReceivedDateTime;
	}
	public void setPnrReceivedDateTime(LocalDateTime pnrReceivedDateTime) {
		this.pnrReceivedDateTime = pnrReceivedDateTime;
	}
	public LocalDateTime getPnrLastUpdateDateTime() {
		return pnrLastUpdateDateTime;
	}
	public void setPnrLastUpdateDateTime(LocalDateTime pnrLastUpdateDateTime) {
		this.pnrLastUpdateDateTime = pnrLastUpdateDateTime;
	}
	public String getPnrOrigBkgCRSCode() {
		return pnrOrigBkgCRSCode;
	}
	public void setPnrOrigBkgCRSCode(String pnrOrigBkgCRSCode) {
		this.pnrOrigBkgCRSCode = pnrOrigBkgCRSCode;
	}
	public String getPnrOrigBkgAgencyIATANumber() {
		return pnrOrigBkgAgencyIATANumber;
	}
	public void setPnrOrigBkgAgencyIATANumber(String pnrOrigBkgAgencyIATANumber) {
		this.pnrOrigBkgAgencyIATANumber = pnrOrigBkgAgencyIATANumber;
	}
	public String getPnrOrigBkgAgencyCityCode() {
		return pnrOrigBkgAgencyCityCode;
	}
	public void setPnrOrigBkgAgencyCityCode(String pnrOrigBkgAgencyCityCode) {
		this.pnrOrigBkgAgencyCityCode = pnrOrigBkgAgencyCityCode;
	}
	public String getPnrOrigBkgCountryCode() {
		return pnrOrigBkgCountryCode;
	}
	public void setPnrOrigBkgCountryCode(String pnrOrigBkgCountryCode) {
		this.pnrOrigBkgCountryCode = pnrOrigBkgCountryCode;
	}
	public String getPnrOrigBkgDutyCode() {
		return pnrOrigBkgDutyCode;
	}
	public void setPnrOrigBkgDutyCode(String pnrOrigBkgDutyCode) {
		this.pnrOrigBkgDutyCode = pnrOrigBkgDutyCode;
	}
	public Boolean isPnrHistoryTruncated() {
		return pnrHistoryTruncated;
	}
	public void setPnrHistoryTruncated(Boolean pnrHistoryTruncated) {
		this.pnrHistoryTruncated = pnrHistoryTruncated;
	}
	public Boolean isPnrHistoryCorrupted() {
		return pnrHistoryCorrupted;
	}
	public void setPnrHistoryCorrupted(Boolean pnrHistoryCorrupted) {
		this.pnrHistoryCorrupted = pnrHistoryCorrupted;
	}
	public LocalDateTime getPnrHistoryResetDate() {
		return pnrHistoryResetDate;
	}
	public void setPnrHistoryResetDate(LocalDateTime pnrHistoryResetDate) {
		this.pnrHistoryResetDate = pnrHistoryResetDate;
	}
	public String getPnrRlocText() {
		return pnrRlocText;
	}
	public void setPnrRlocText(String pnrRlocText) {
		this.pnrRlocText = pnrRlocText;
	}
	public String getPnrRlocCRSCityCode() {
		return pnrRlocCRSCityCode;
	}
	public void setPnrRlocCRSCityCode(String pnrRlocCRSCityCode) {
		this.pnrRlocCRSCityCode = pnrRlocCRSCityCode;
	}
	public String getPnrRlocCRSCode() {
		return pnrRlocCRSCode;
	}
	public void setPnrRlocCRSCode(String pnrRlocCRSCode) {
		this.pnrRlocCRSCode = pnrRlocCRSCode;
	}
	public String getPnrRlocOAPnrLocator() {
		return pnrRlocOAPnrLocator;
	}
	public void setPnrRlocOAPnrLocator(String pnrRlocOAPnrLocator) {
		this.pnrRlocOAPnrLocator = pnrRlocOAPnrLocator;
	}
	public String getPnrRlocAgencyIdCode() {
		return pnrRlocAgencyIdCode;
	}
	public void setPnrRlocAgencyIdCode(String pnrRlocAgencyIdCode) {
		this.pnrRlocAgencyIdCode = pnrRlocAgencyIdCode;
	}
	public String getPnrRlocAgencyIATANumber() {
		return pnrRlocAgencyIATANumber;
	}
	public void setPnrRlocAgencyIATANumber(String pnrRlocAgencyIATANumber) {
		this.pnrRlocAgencyIATANumber = pnrRlocAgencyIATANumber;
	}
	public String getPnrRlocAgencyCityCode() {
		return pnrRlocAgencyCityCode;
	}
	public void setPnrRlocAgencyCityCode(String pnrRlocAgencyCityCode) {
		this.pnrRlocAgencyCityCode = pnrRlocAgencyCityCode;
	}
	public String getPnrOrigParentLocator() {
		return pnrOrigParentLocator;
	}
	public void setPnrOrigParentLocator(String pnrOrigParentLocator) {
		this.pnrOrigParentLocator = pnrOrigParentLocator;
	}
	public String getPnrPointOfOriginCityCode() {
		return pnrPointOfOriginCityCode;
	}
	public void setPnrPointOfOriginCityCode(String pnrPointOfOriginCityCode) {
		this.pnrPointOfOriginCityCode = pnrPointOfOriginCityCode;
	}
	public Boolean isPnrNonRev() {
		return pnrNonRev;
	}
	public void setPnrNonRev(Boolean pnrNonRev) {
		this.pnrNonRev = pnrNonRev;
	}
	public Boolean isPnrPositiveSpace() {
		return pnrPositiveSpace;
	}
	public void setPnrPositiveSpace(Boolean pnrPositiveSpace) {
		this.pnrPositiveSpace = pnrPositiveSpace;
	}
	public Boolean isPnrAwardBooking() {
		return pnrAwardBooking;
	}
	public void setPnrAwardBooking(Boolean pnrAwardBooking) {
		this.pnrAwardBooking = pnrAwardBooking;
	}
	public Boolean isPnrGovtFare() {
		return pnrGovtFare;
	}
	public void setPnrGovtFare(Boolean pnrGovtFare) {
		this.pnrGovtFare = pnrGovtFare;
	}
	public Boolean isPnrExtraSeat() {
		return pnrExtraSeat;
	}
	public void setPnrExtraSeat(Boolean pnrExtraSeat) {
		this.pnrExtraSeat = pnrExtraSeat;
	}
	public Boolean isPnrCabinBaggage() {
		return pnrCabinBaggage;
	}
	public void setPnrCabinBaggage(Boolean pnrCabinBaggage) {
		this.pnrCabinBaggage = pnrCabinBaggage;
	}
	public Boolean isPnrAirpass() {
		return pnrAirpass;
	}
	public void setPnrAirpass(Boolean pnrAirpass) {
		this.pnrAirpass = pnrAirpass;
	}
	public String getPnrAirpassType() {
		return pnrAirpassType;
	}
	public void setPnrAirpassType(String pnrAirpassType) {
		this.pnrAirpassType = pnrAirpassType;
	}
	public Boolean isPnrFqtuSSR() {
		return pnrFqtuSSR;
	}
	public void setPnrFqtuSSR(Boolean pnrFqtuSSR) {
		this.pnrFqtuSSR = pnrFqtuSSR;
	}
	public Boolean isPnrAutoReqOptOut() {
		return pnrAutoReqOptOut;
	}
	public void setPnrAutoReqOptOut(Boolean pnrAutoReqOptOut) {
		this.pnrAutoReqOptOut = pnrAutoReqOptOut;
	}
	public Boolean isPnrItinActiveInd() {
		return pnrItinActiveInd;
	}
	public void setPnrItinActiveInd(Boolean pnrItinActiveInd) {
		this.pnrItinActiveInd = pnrItinActiveInd;
	}
	public Boolean isPnrVcrInd() {
		return pnrVcrInd;
	}
	public void setPnrVcrInd(Boolean pnrVcrInd) {
		this.pnrVcrInd = pnrVcrInd;
	}
	public Boolean isPnrRmEstimateInd() {
		return pnrRmEstimateInd;
	}
	public void setPnrRmEstimateInd(Boolean pnrRmEstimateInd) {
		this.pnrRmEstimateInd = pnrRmEstimateInd;
	}
	public Boolean isPnrUmnrSSR() {
		return pnrUmnrSSR;
	}
	public void setPnrUmnrSSR(Boolean pnrUmnrSSR) {
		this.pnrUmnrSSR = pnrUmnrSSR;
	}
	public Boolean isPnrPetSSR() {
		return pnrPetSSR;
	}
	public void setPnrPetSSR(Boolean pnrPetSSR) {
		this.pnrPetSSR = pnrPetSSR;
	}
	public Long getSegId() {
		return segId;
	}
	public void setSegId(Long segId) {
		this.segId = segId;
	}
	public String getSegAirline() {
		return segAirline;
	}
	public void setSegAirline(String segAirline) {
		this.segAirline = segAirline;
	}

	/*
	 * public LocalDateTime getSegDepartureDate() { return segDepartureDate; } public
	 * void setSegDepartureDate(LocalDateTime segDepartureDate) { this.segDepartureDate =
	 * segDepartureDate; } public Integer getSegFlightNumber() { return segFlightNumber;
	 * } public void setSegFlightNumber(Integer segFlightNumber) { this.segFlightNumber
	 * = segFlightNumber; } public String getSegBoard() { return segBoard; } public
	 * void setSegBoard(String segBoard) { this.segBoard = segBoard; } public String
	 * getSegOff() { return segOff; } public void setSegOff(String segOff) {
	 * this.segOff = segOff; }
	 */
	public String getSegBoardCountryCode() {
		return segBoardCountryCode;
	}
	public void setSegBoardCountryCode(String segBoardCountryCode) {
		this.segBoardCountryCode = segBoardCountryCode;
	}
	public String getSegOffCountryCode() {
		return segOffCountryCode;
	}
	public void setSegOffCountryCode(String segOffCountryCode) {
		this.segOffCountryCode = segOffCountryCode;
	}
	public String getSegFareClass() {
		return segFareClass;
	}
	public void setSegFareClass(String segFareClass) {
		this.segFareClass = segFareClass;
	}
	public Integer getSegSequence() {
		return segSequence;
	}
	public void setSegSequence(Integer segSequence) {
		this.segSequence = segSequence;
	}
	public String getSegStatusCode() {
		return segStatusCode;
	}
	public void setSegStatusCode(String segStatusCode) {
		this.segStatusCode = segStatusCode;
	}
	public String getSegOrigStatusCode() {
		return segOrigStatusCode;
	}
	public void setSegOrigStatusCode(String segOrigStatusCode) {
		this.segOrigStatusCode = segOrigStatusCode;
	}
	public Character getSegCabinCode() {
		return segCabinCode;
	}
	public void setSegCabinCode(Character segCabinCode) {
		this.segCabinCode = segCabinCode;
	}
	public Boolean isSegActive() {
		return segActive;
	}
	public void setSegActive(Boolean segActive) {
		this.segActive = segActive;
	}
	public Boolean isSegInbound() {
		return segInbound;
	}
	public void setSegInbound(Boolean segInbound) {
		this.segInbound = segInbound;
	}
	public Boolean isSegOutbound() {
		return segOutbound;
	}
	public void setSegOutbound(Boolean segOutbound) {
		this.segOutbound = segOutbound;
	}
	public Integer getSegSabreNumberInParty() {
		return segSabreNumberInParty;
	}
	public void setSegSabreNumberInParty(Integer segSabreNumberInParty) {
		this.segSabreNumberInParty = segSabreNumberInParty;
	}
	public Integer getSegOrigNumberInParty() {
		return segOrigNumberInParty;
	}
	public void setSegOrigNumberInParty(Integer segOrigNumberInParty) {
		this.segOrigNumberInParty = segOrigNumberInParty;
	}
	public String getSegPrevStatusCode() {
		return segPrevStatusCode;
	}
	public void setSegPrevStatusCode(String segPrevStatusCode) {
		this.segPrevStatusCode = segPrevStatusCode;
	}
	public Boolean isSegRoundRobinCity() {
		return segRoundRobinCity;
	}
	public void setSegRoundRobinCity(Boolean segRoundRobinCity) {
		this.segRoundRobinCity = segRoundRobinCity;
	}
	public String getSegBsgLocator() {
		return segBsgLocator;
	}
	public void setSegBsgLocator(String segBsgLocator) {
		this.segBsgLocator = segBsgLocator;
	}
	public LocalDateTime getSegBookingDateTime() {
		return segBookingDateTime;
	}
	public void setSegBookingDateTime(LocalDateTime segBookingDateTime) {
		this.segBookingDateTime = segBookingDateTime;
	}
	public LocalDateTime getSegCreateDateTime() {
		return segCreateDateTime;
	}
	public void setSegCreateDateTime(LocalDateTime segCreateDateTime) {
		this.segCreateDateTime = segCreateDateTime;
	}
	public LocalDateTime getSegCancelDateTime() {
		return segCancelDateTime;
	}
	public void setSegCancelDateTime(LocalDateTime segCancelDateTime) {
		this.segCancelDateTime = segCancelDateTime;
	}
	public Boolean isSegCodeShare() {
		return segCodeShare;
	}
	public void setSegCodeShare(Boolean segCodeShare) {
		this.segCodeShare = segCodeShare;
	}
	public String getSegCrsCode() {
		return segCrsCode;
	}
	public void setSegCrsCode(String segCrsCode) {
		this.segCrsCode = segCrsCode;
	}
	public String getSegAgencyIATANumber() {
		return segAgencyIATANumber;
	}
	public void setSegAgencyIATANumber(String segAgencyIATANumber) {
		this.segAgencyIATANumber = segAgencyIATANumber;
	}
	public String getSegAgencyCityCode() {
		return segAgencyCityCode;
	}
	public void setSegAgencyCityCode(String segAgencyCityCode) {
		this.segAgencyCityCode = segAgencyCityCode;
	}
	public String getSegCountryCode() {
		return segCountryCode;
	}
	public void setSegCountryCode(String segCountryCode) {
		this.segCountryCode = segCountryCode;
	}
	public String getSegDutyCode() {
		return segDutyCode;
	}
	public void setSegDutyCode(String segDutyCode) {
		this.segDutyCode = segDutyCode;
	}
	public String getSegMarketingAirline() {
		return segMarketingAirline;
	}
	public void setSegMarketingAirline(String segMarketingAirline) {
		this.segMarketingAirline = segMarketingAirline;
	}
	public String getSegOperatingAirline() {
		return segOperatingAirline;
	}
	public void setSegOperatingAirline(String segOperatingAirline) {
		this.segOperatingAirline = segOperatingAirline;
	}
	public String getSegMarketingClass() {
		return segMarketingClass;
	}
	public void setSegMarketingClass(String segMarketingClass) {
		this.segMarketingClass = segMarketingClass;
	}
	public String getSegOperatingClass() {
		return segOperatingClass;
	}
	public void setSegOperatingClass(String segOperatingClass) {
		this.segOperatingClass = segOperatingClass;
	}
	public Integer getSegMarketingFlightNbr() {
		return segMarketingFlightNbr;
	}
	public void setSegMarketingFlightNbr(Integer segMarketingFlightNbr) {
		this.segMarketingFlightNbr = segMarketingFlightNbr;
	}
	public Integer getSegOperatingFlightNbr() {
		return segOperatingFlightNbr;
	}
	public void setSegOperatingFlightNbr(Integer segOperatingFlightNbr) {
		this.segOperatingFlightNbr = segOperatingFlightNbr;
	}
	public LocalDateTime getSegKlDateTime() {
		return segKlDateTime;
	}
	public void setSegKlDateTime(LocalDateTime segKlDateTime) {
		this.segKlDateTime = segKlDateTime;
	}
	public LocalDateTime getSegObDateTime() {
		return segObDateTime;
	}
	public void setSegObDateTime(LocalDateTime segObDateTime) {
		this.segObDateTime = segObDateTime;
	}
	public LocalDateTime getSegLastUpdate() {
		return segLastUpdate;
	}
	public void setSegLastUpdate(LocalDateTime segLastUpdate) {
		this.segLastUpdate = segLastUpdate;
	}
	public LocalDateTime getSegDepartureDateTime() {
		return segDepartureDateTime;
	}
	public void setSegDepartureDateTime(LocalDateTime segDepartureDateTime) {
		this.segDepartureDateTime = segDepartureDateTime;
	}
	public LocalDateTime getSegArrivalDateTime() {
		return segArrivalDateTime;
	}
	public void setSegArrivalDateTime(LocalDateTime segArrivalDateTime) {
		this.segArrivalDateTime = segArrivalDateTime;
	}
	public String getSegBkgAAACityCode() {
		return segBkgAAACityCode;
	}
	public void setSegBkgAAACityCode(String segBkgAAACityCode) {
		this.segBkgAAACityCode = segBkgAAACityCode;
	}
	public String getSegBkgHomeStaCityCode() {
		return segBkgHomeStaCityCode;
	}
	public void setSegBkgHomeStaCityCode(String segBkgHomeStaCityCode) {
		this.segBkgHomeStaCityCode = segBkgHomeStaCityCode;
	}
	public String getSegBkgDutyCode() {
		return segBkgDutyCode;
	}
	public void setSegBkgDutyCode(String segBkgDutyCode) {
		this.segBkgDutyCode = segBkgDutyCode;
	}
	public String getSegBkgAgentSine() {
		return segBkgAgentSine;
	}
	public void setSegBkgAgentSine(String segBkgAgentSine) {
		this.segBkgAgentSine = segBkgAgentSine;
	}
	public String getSegBkgPltOfficeDesignator() {
		return segBkgPltOfficeDesignator;
	}
	public void setSegBkgPltOfficeDesignator(String segBkgPltOfficeDesignator) {
		this.segBkgPltOfficeDesignator = segBkgPltOfficeDesignator;
	}
	public String getSegBkgCrsCode() {
		return segBkgCrsCode;
	}
	public void setSegBkgCrsCode(String segBkgCrsCode) {
		this.segBkgCrsCode = segBkgCrsCode;
	}
	public String getSegCurrentAAACityCode() {
		return segCurrentAAACityCode;
	}
	public void setSegCurrentAAACityCode(String segCurrentAAACityCode) {
		this.segCurrentAAACityCode = segCurrentAAACityCode;
	}
	public String getSegCurrentHomeStaCityCode() {
		return segCurrentHomeStaCityCode;
	}
	public void setSegCurrentHomeStaCityCode(String segCurrentHomeStaCityCode) {
		this.segCurrentHomeStaCityCode = segCurrentHomeStaCityCode;
	}
	public String getSegCurrentAgentSine() {
		return segCurrentAgentSine;
	}
	public void setSegCurrentAgentSine(String segCurrentAgentSine) {
		this.segCurrentAgentSine = segCurrentAgentSine;
	}
	public String getSegCurrentDutyCode() {
		return segCurrentDutyCode;
	}
	public void setSegCurrentDutyCode(String segCurrentDutyCode) {
		this.segCurrentDutyCode = segCurrentDutyCode;
	}
	public String getSegCurrentPltOfficeDesignator() {
		return segCurrentPltOfficeDesignator;
	}
	public void setSegCurrentPltOfficeDesignator(String segCurrentPltOfficeDesignator) {
		this.segCurrentPltOfficeDesignator = segCurrentPltOfficeDesignator;
	}
	public String getSegCurrentCrsCode() {
		return segCurrentCrsCode;
	}
	public void setSegCurrentCrsCode(String segCurrentCrsCode) {
		this.segCurrentCrsCode = segCurrentCrsCode;
	}
	public String getSegCancelAAACityCode() {
		return segCancelAAACityCode;
	}
	public void setSegCancelAAACityCode(String segCancelAAACityCode) {
		this.segCancelAAACityCode = segCancelAAACityCode;
	}
	public String getSegCancelHomeStaCityCode() {
		return segCancelHomeStaCityCode;
	}
	public void setSegCancelHomeStaCityCode(String segCancelHomeStaCityCode) {
		this.segCancelHomeStaCityCode = segCancelHomeStaCityCode;
	}
	public String getSegCancelAgentSine() {
		return segCancelAgentSine;
	}
	public void setSegCancelAgentSine(String segCancelAgentSine) {
		this.segCancelAgentSine = segCancelAgentSine;
	}
	public String getSegCancelDutyCode() {
		return segCancelDutyCode;
	}
	public void setSegCancelDutyCode(String segCancelDutyCode) {
		this.segCancelDutyCode = segCancelDutyCode;
	}
	public String getSegCancelPltOfficeDesignator() {
		return segCancelPltOfficeDesignator;
	}
	public void setSegCancelPltOfficeDesignator(String segCancelPltOfficeDesignator) {
		this.segCancelPltOfficeDesignator = segCancelPltOfficeDesignator;
	}
	public String getSegCancelCrsCode() {
		return segCancelCrsCode;
	}
	public void setSegCancelCrsCode(String segCancelCrsCode) {
		this.segCancelCrsCode = segCancelCrsCode;
	}
	public String getSegBkgReceivedFrom() {
		return segBkgReceivedFrom;
	}
	public void setSegBkgReceivedFrom(String segBkgReceivedFrom) {
		this.segBkgReceivedFrom = segBkgReceivedFrom;
	}
	public String getSegCurrentReceivedFrom() {
		return segCurrentReceivedFrom;
	}
	public void setSegCurrentReceivedFrom(String segCurrentReceivedFrom) {
		this.segCurrentReceivedFrom = segCurrentReceivedFrom;
	}
	public String getSegCancelReceivedFrom() {
		return segCancelReceivedFrom;
	}
	public void setSegCancelReceivedFrom(String segCancelReceivedFrom) {
		this.segCancelReceivedFrom = segCancelReceivedFrom;
	}
	public Boolean isSegCopiedFromParent() {
		return segCopiedFromParent;
	}
	public void setSegCopiedFromParent(Boolean segCopiedFromParent) {
		this.segCopiedFromParent = segCopiedFromParent;
	}
	public ZonedDateTime getSegDepartureDateTimeGMT() {
		return segDepartureDateTimeGMT;
	}
	public void setSegDepartureDateTimeGMT(ZonedDateTime segDepartureDateTimeGMT) {
		this.segDepartureDateTimeGMT = segDepartureDateTimeGMT;
	}
	public ZonedDateTime getSegArrivalDateTimeGMT() {
		return segArrivalDateTimeGMT;
	}
	public void setSegArrivalDateTimeGMT(ZonedDateTime segArrivalDateTimeGMT) {
		this.segArrivalDateTimeGMT = segArrivalDateTimeGMT;
	}
	public Boolean isSegMarriedSegment() {
		return segMarriedSegment;
	}
	public void setSegMarriedSegment(Boolean segMarriedSegment) {
		this.segMarriedSegment = segMarriedSegment;
	}
	public Boolean isSegFqtuSSR() {
		return segFqtuSSR;
	}
	public void setSegFqtuSSR(Boolean segFqtuSSR) {
		this.segFqtuSSR = segFqtuSSR;
	}
	public Boolean isSegIrssSSR() {
		return segIrssSSR;
	}
	public void setSegIrssSSR(Boolean segIrssSSR) {
		this.segIrssSSR = segIrssSSR;
	}
	public LocalDate getSegTripDepartureDate() {
		return segTripDepartureDate;
	}
	public void setSegTripDepartureDate(LocalDate segTripDepartureDate) {
		this.segTripDepartureDate = segTripDepartureDate;
	}
	public String getSegTripBoard() {
		return segTripBoard;
	}
	public void setSegTripBoard(String segTripBoard) {
		this.segTripBoard = segTripBoard;
	}
	public String getSegTripOff() {
		return segTripOff;
	}
	public void setSegTripOff(String segTripOff) {
		this.segTripOff = segTripOff;
	}
	public Boolean isSegInline() {
		return segInline;
	}
	public void setSegInline(Boolean segInline) {
		this.segInline = segInline;
	}
	public Boolean isSegOnline() {
		return segOnline;
	}
	public void setSegOnline(Boolean segOnline) {
		this.segOnline = segOnline;
	}
	public Boolean isSegOffline() {
		return segOffline;
	}
	public void setSegOffline(Boolean segOffline) {
		this.segOffline = segOffline;
	}
	public String getSegUniqueId() {
		return segUniqueId;
	}
	public void setSegUniqueId(String segUniqueId) {
		this.segUniqueId = segUniqueId;
	}
	public String getSegOriginalFare() {
		return segOriginalFare;
	}
	public void setSegOriginalFare(String segOriginalFare) {
		this.segOriginalFare = segOriginalFare;
	}
	public String getSegEffectiveBidPrice() {
		return segEffectiveBidPrice;
	}
	public void setSegEffectiveBidPrice(String segEffectiveBidPrice) {
		this.segEffectiveBidPrice = segEffectiveBidPrice;
	}
	public String getSegAdjustedFare() {
		return segAdjustedFare;
	}
	public void setSegAdjustedFare(String segAdjustedFare) {
		this.segAdjustedFare = segAdjustedFare;
	}
	public String getSegAdjustedBidPrice() {
		return segAdjustedBidPrice;
	}
	public void setSegAdjustedBidPrice(String segAdjustedBidPrice) {
		this.segAdjustedBidPrice = segAdjustedBidPrice;
	}
	public String getSegFootprintFareClass() {
		return segFootprintFareClass;
	}
	public void setSegFootprintFareClass(String segFootprintFareClass) {
		this.segFootprintFareClass = segFootprintFareClass;
	}
	public String getSegLowestAvailFareClass() {
		return segLowestAvailFareClass;
	}
	public void setSegLowestAvailFareClass(String segLowestAvailFareClass) {
		this.segLowestAvailFareClass = segLowestAvailFareClass;
	}
	public String getSegPointOfCommencement() {
		return segPointOfCommencement;
	}
	public void setSegPointOfCommencement(String segPointOfCommencement) {
		this.segPointOfCommencement = segPointOfCommencement;
	}
	public Integer getSegCustomerScore() {
		return segCustomerScore;
	}
	public void setSegCustomerScore(Integer segCustomerScore) {
		this.segCustomerScore = segCustomerScore;
	}
	public String getSegAdditionalFlag() {
		return segAdditionalFlag;
	}
	public void setSegAdditionalFlag(String segAdditionalFlag) {
		this.segAdditionalFlag = segAdditionalFlag;
	}
	public String getSegAdditionalData() {
		return segAdditionalData;
	}
	public void setSegAdditionalData(String segAdditionalData) {
		this.segAdditionalData = segAdditionalData;
	}
	public Integer getSegTierLevel() {
		return segTierLevel;
	}
	public void setSegTierLevel(Integer segTierLevel) {
		this.segTierLevel = segTierLevel;
	}
	public String getSegSupplierCode() {
		return segSupplierCode;
	}
	public void setSegSupplierCode(String segSupplierCode) {
		this.segSupplierCode = segSupplierCode;
	}
	public String getSegMarketTypeOrigin() {
		return segMarketTypeOrigin;
	}
	public void setSegMarketTypeOrigin(String segMarketTypeOrigin) {
		this.segMarketTypeOrigin = segMarketTypeOrigin;
	}
	public Integer getSegMarketTypeOriginLevel() {
		return segMarketTypeOriginLevel;
	}
	public void setSegMarketTypeOriginLevel(Integer segMarketTypeOriginLevel) {
		this.segMarketTypeOriginLevel = segMarketTypeOriginLevel;
	}
	public String getSegMarketTypeDestination() {
		return segMarketTypeDestination;
	}
	public void setSegMarketTypeDestination(String segMarketTypeDestination) {
		this.segMarketTypeDestination = segMarketTypeDestination;
	}
	public Integer getSegMarketTypeDestinationLevel() {
		return segMarketTypeDestinationLevel;
	}
	public void setSegMarketTypeDestinationLevel(Integer segMarketTypeDestinationLevel) {
		this.segMarketTypeDestinationLevel = segMarketTypeDestinationLevel;
	}
	public String getSegTripMarketOrigin() {
		return segTripMarketOrigin;
	}
	public void setSegTripMarketOrigin(String segTripMarketOrigin) {
		this.segTripMarketOrigin = segTripMarketOrigin;
	}
	public Integer getSegTripMarketOriginLevel() {
		return segTripMarketOriginLevel;
	}
	public void setSegTripMarketOriginLevel(Integer segTripMarketOriginLevel) {
		this.segTripMarketOriginLevel = segTripMarketOriginLevel;
	}
	public String getSegTripMarketDestination() {
		return segTripMarketDestination;
	}
	public void setSegTripMarketDestination(String segTripMarketDestination) {
		this.segTripMarketDestination = segTripMarketDestination;
	}
	public Integer getSegTripMarketDestinationLevel() {
		return segTripMarketDestinationLevel;
	}
	public void setSegTripMarketDestinationLevel(Integer segTripMarketDestinationLevel) {
		this.segTripMarketDestinationLevel = segTripMarketDestinationLevel;
	}
	public String getSegFareMarketOrigin() {
		return segFareMarketOrigin;
	}
	public void setSegFareMarketOrigin(String segFareMarketOrigin) {
		this.segFareMarketOrigin = segFareMarketOrigin;
	}
	public Integer getSegFareMarketOriginLevel() {
		return segFareMarketOriginLevel;
	}
	public void setSegFareMarketOriginLevel(Integer segFareMarketOriginLevel) {
		this.segFareMarketOriginLevel = segFareMarketOriginLevel;
	}
	public String getSegFareMarketDestination() {
		return segFareMarketDestination;
	}
	public void setSegFareMarketDestination(String segFareMarketDestination) {
		this.segFareMarketDestination = segFareMarketDestination;
	}
	public Integer getSegFareMarketDestinationLevel() {
		return segFareMarketDestinationLevel;
	}
	public void setSegFareMarketDestinationLevel(Integer segFareMarketDestinationLevel) {
		this.segFareMarketDestinationLevel = segFareMarketDestinationLevel;
	}
	public Boolean isSegRegularFareType() {
		return segRegularFareType;
	}
	public void setSegRegularFareType(Boolean segRegularFareType) {
		this.segRegularFareType = segRegularFareType;
	}
	public Boolean isSegSponsorFareType() {
		return segSponsorFareType;
	}
	public void setSegSponsorFareType(Boolean segSponsorFareType) {
		this.segSponsorFareType = segSponsorFareType;
	}
	public Boolean isSegDefaultFareType() {
		return segDefaultFareType;
	}
	public void setSegDefaultFareType(Boolean segDefaultFareType) {
		this.segDefaultFareType = segDefaultFareType;
	}
	public Boolean isSegSponsorDefault() {
		return segSponsorDefault;
	}
	public void setSegSponsorDefault(Boolean segSponsorDefault) {
		this.segSponsorDefault = segSponsorDefault;
	}
	public Boolean isSegHostDefault() {
		return segHostDefault;
	}
	public void setSegHostDefault(Boolean segHostDefault) {
		this.segHostDefault = segHostDefault;
	}
	public Boolean isSegDefaultEvaluationType() {
		return segDefaultEvaluationType;
	}
	public void setSegDefaultEvaluationType(Boolean segDefaultEvaluationType) {
		this.segDefaultEvaluationType = segDefaultEvaluationType;
	}
	public Boolean isSegSumOfLocals() {
		return segSumOfLocals;
	}
	public void setSegSumOfLocals(Boolean segSumOfLocals) {
		this.segSumOfLocals = segSumOfLocals;
	}
	public Boolean isSegTrueOD() {
		return segTrueOD;
	}
	public void setSegTrueOD(Boolean segTrueOD) {
		this.segTrueOD = segTrueOD;
	}
	public Boolean isSegLongestSegmentFare() {
		return segLongestSegmentFare;
	}
	public void setSegLongestSegmentFare(Boolean segLongestSegmentFare) {
		this.segLongestSegmentFare = segLongestSegmentFare;
	}
	public Boolean isSegDominantSegmentFare() {
		return segDominantSegmentFare;
	}
	public void setSegDominantSegmentFare(Boolean segDominantSegmentFare) {
		this.segDominantSegmentFare = segDominantSegmentFare;
	}
	public Boolean isSegLocal() {
		return segLocal;
	}
	public void setSegLocal(Boolean segLocal) {
		this.segLocal = segLocal;
	}
	public Boolean isSegFinancial() {
		return segFinancial;
	}
	public void setSegFinancial(Boolean segFinancial) {
		this.segFinancial = segFinancial;
	}
	public Boolean isSegPhysical() {
		return segPhysical;
	}
	public void setSegPhysical(Boolean segPhysical) {
		this.segPhysical = segPhysical;
	}
	public Boolean isSegForcedSell() {
		return segForcedSell;
	}
	public void setSegForcedSell(Boolean segForcedSell) {
		this.segForcedSell = segForcedSell;
	}
	public Boolean isSegSchedChg() {
		return segSchedChg;
	}
	public void setSegSchedChg(Boolean segSchedChg) {
		this.segSchedChg = segSchedChg;
	}
	public Boolean isSegForcedPartialCancel() {
		return segForcedPartialCancel;
	}
	public void setSegForcedPartialCancel(Boolean segForcedPartialCancel) {
		this.segForcedPartialCancel = segForcedPartialCancel;
	}
	public Boolean isSegTtyRejectAgent() {
		return segTtyRejectAgent;
	}
	public void setSegTtyRejectAgent(Boolean segTtyRejectAgent) {
		this.segTtyRejectAgent = segTtyRejectAgent;
	}
	public Boolean isSegTtyTransaction() {
		return segTtyTransaction;
	}
	public void setSegTtyTransaction(Boolean segTtyTransaction) {
		this.segTtyTransaction = segTtyTransaction;
	}
	

	@Override
	protected PNRSegment clone()
	{

		PNRSegment clon = new PNRSegment();
		
		PNRSegmentId id = new PNRSegmentId();
		clon.setId(id);

		//clon.setId(this.getId());
		//clon.setPnr(this.getPnr());
		//////
		clon.getId().setSegFlightNumber(this.getId().getSegFlightNumber());
		clon.getId().setSegBoard(this.getId().getSegBoard());
		clon.getId().setSegOff(this.getId().getSegOff());
		clon.getId().setSegDepartureDate(this.getId().getSegDepartureDate());
		clon.setSegDepartureDateTime(this.getSegDepartureDateTime());
		clon.setSegDepartureDateTimeGMT(this.getSegDepartureDateTimeGMT());
		clon.setSegAirline(this.getSegAirline());
		clon.setSegBoardCountryCode(this.getSegBoardCountryCode());
		clon.setSegOffCountryCode(this.getSegOffCountryCode());
		//clon.setSegment(this.getSegment());
		/////
		
		clon.setSegFareClass(this.getSegFareClass());
		clon.setSegSequence(this.getSegSequence());
		clon.setSegStatusCode(this.getSegStatusCode());
		clon.setSegCabinCode(this.getSegCabinCode());
		clon.setSegActive(this.isSegActive());
		clon.setSegInbound(this.isSegInbound());
		clon.setSegOutbound(this.isSegOutbound());
		clon.setSegSabreNumberInParty(this.getSegSabreNumberInParty());
		clon.setSegPrevStatusCode(this.getSegPrevStatusCode());
		clon.setSegRoundRobinCity(this.isSegRoundRobinCity());
		clon.setSegBsgLocator(this.getSegBsgLocator());
		clon.setSegBookingDateTime(this.getSegBookingDateTime() == null ? null : LocalDateTime.from(this.getSegBookingDateTime()));
		clon.setSegCodeShare(this.isSegCodeShare());
		clon.setSegCrsCode(this.getSegCrsCode());
		clon.setSegAgencyIATANumber(this.getSegAgencyIATANumber());
		clon.setSegAgencyCityCode(this.getSegAgencyCityCode());
		clon.setSegCountryCode(this.getSegCountryCode());
		clon.setSegDutyCode(this.getSegDutyCode());
		clon.setSegCancelDateTime(this.getSegCancelDateTime() == null ? null : LocalDateTime.from(this.getSegCancelDateTime()));
		clon.setSegMarketingAirline(this.getSegMarketingAirline());
		clon.setSegOperatingAirline(this.getSegOperatingAirline());
		clon.setSegMarketingClass(this.getSegMarketingClass());
		clon.setSegOperatingClass(this.getSegOperatingClass());
		clon.setSegMarketingFlightNbr(this.getSegMarketingFlightNbr());
		clon.setSegOperatingFlightNbr(this.getSegOperatingFlightNbr());
		clon.setSegKlDateTime(this.getSegKlDateTime() == null ? null : LocalDateTime.from(this.getSegKlDateTime()));
		clon.setSegObDateTime(this.getSegObDateTime() == null ? null : LocalDateTime.from(this.getSegObDateTime()));
		clon.setSegLastUpdate(this.getSegLastUpdate() == null ? null : LocalDateTime.from(this.getSegLastUpdate()));
		clon.setSegDepartureDateTime(this.getSegDepartureDateTime()== null ? null : LocalDateTime.from(this.getSegDepartureDateTime()));
		clon.setSegArrivalDateTime(this.getSegArrivalDateTime() == null ? null : LocalDateTime.from(this.getSegArrivalDateTime()));
		clon.setSegOrigNumberInParty(this.getSegOrigNumberInParty());
		clon.setSegOrigStatusCode(this.getSegOrigStatusCode());
		clon.setSegBkgAAACityCode(this.getSegBkgAAACityCode());
		clon.setSegBkgHomeStaCityCode(this.getSegBkgHomeStaCityCode());
		clon.setSegBkgAgentSine(this.getSegBkgAgentSine());
		clon.setSegBkgDutyCode(this.getSegBkgDutyCode());
		clon.setSegBkgPltOfficeDesignator(this.getSegBkgPltOfficeDesignator());
		clon.setSegBkgCrsCode(this.getSegBkgCrsCode());
		clon.setSegCurrentAAACityCode(this.getSegCurrentAAACityCode());
		clon.setSegCurrentHomeStaCityCode(this.getSegCurrentHomeStaCityCode());
		clon.setSegCurrentAgentSine(this.getSegCurrentAgentSine());
		clon.setSegCurrentDutyCode(this.getSegCurrentDutyCode());
		clon.setSegCurrentPltOfficeDesignator(this.getSegCurrentPltOfficeDesignator());
		clon.setSegCurrentCrsCode(this.getSegCurrentCrsCode());
		clon.setSegCancelAAACityCode(this.getSegCancelAAACityCode());
		clon.setSegCancelHomeStaCityCode(this.getSegCancelHomeStaCityCode());
		clon.setSegCancelAgentSine(this.getSegCancelAgentSine());
		clon.setSegCancelDutyCode(this.getSegCancelDutyCode());
		clon.setSegCancelPltOfficeDesignator(this.getSegCancelPltOfficeDesignator());
		clon.setSegCancelCrsCode(this.getSegCancelCrsCode());
		clon.setSegBkgReceivedFrom(this.getSegBkgReceivedFrom());
		clon.setSegCurrentReceivedFrom(this.getSegCurrentReceivedFrom());
		clon.setSegCancelReceivedFrom(this.getSegCancelReceivedFrom());
		clon.setSegCopiedFromParent(this.isSegCopiedFromParent());
		
		/*Start : Foot PrInteger new fields added to C2_PNR_SEGMENT*/
		
		clon.setSegUniqueId(this.getSegUniqueId());
		clon.setSegOriginalFare(this.getSegOriginalFare());
		clon.setSegEffectiveBidPrice(this.getSegEffectiveBidPrice());
		clon.setSegAdjustedFare(this.getSegAdjustedFare());
		clon.setSegAdjustedBidPrice(this.getSegAdjustedBidPrice());
		clon.setSegFootprintFareClass(this.getSegFootprintFareClass());
		clon.setSegLowestAvailFareClass(this.getSegLowestAvailFareClass());
		clon.setSegPointOfCommencement(this.getSegPointOfCommencement());
		clon.setSegCustomerScore(this.getSegCustomerScore());
		clon.setSegAdditionalFlag(this.getSegAdditionalFlag());
		clon.setSegAdditionalData(this.getSegAdditionalData());
		clon.setSegTierLevel(this.getSegTierLevel());
		clon.setSegSupplierCode(this.getSegSupplierCode());
		clon.setSegMarketTypeOrigin(this.getSegMarketTypeOrigin());
		clon.setSegMarketTypeOriginLevel(this.getSegMarketTypeOriginLevel());
		clon.setSegMarketTypeDestination(this.getSegMarketTypeDestination());
		clon.setSegMarketTypeDestinationLevel(this.getSegMarketTypeDestinationLevel());
		clon.setSegTripMarketOrigin(this.getSegTripMarketOrigin());
		clon.setSegTripMarketOriginLevel(this.getSegTripMarketOriginLevel());
		clon.setSegTripMarketDestination(this.getSegTripMarketDestination());
		clon.setSegTripMarketDestinationLevel(this.getSegTripMarketDestinationLevel());
		clon.setSegFareMarketOrigin(this.getSegFareMarketOrigin());
		clon.setSegFareMarketOriginLevel(this.getSegFareMarketOriginLevel());
		clon.setSegFareMarketDestination(this.getSegFareMarketDestination());
		clon.setSegFareMarketDestinationLevel(this.getSegFareMarketDestinationLevel());
		clon.setSegRegularFareType(this.isSegRegularFareType());
		clon.setSegSponsorFareType(this.isSegSponsorFareType());
		clon.setSegDefaultFareType(this.isSegDefaultFareType());
		clon.setSegSponsorDefault(this.isSegSponsorDefault());
		clon.setSegHostDefault(this.isSegHostDefault());
		clon.setSegDefaultEvaluationType(this.isSegDefaultEvaluationType());
		clon.setSegSumOfLocals(this.isSegSumOfLocals());
		clon.setSegTrueOD(this.isSegTrueOD());
		clon.setSegLongestSegmentFare(this.isSegLongestSegmentFare());
		clon.setSegDominantSegmentFare(this.isSegDominantSegmentFare());
		clon.setSegLocal(this.isSegLocal());
		clon.setSegFinancial(this.isSegFinancial());
		clon.setSegPhysical(this.isSegPhysical());
		clon.setSegForcedSell(this.isSegForcedSell());
		clon.setSegSchedChg(this.isSegSchedChg());
		clon.setSegForcedPartialCancel(this.isSegForcedPartialCancel());
		clon.setSegTtyRejectAgent(this.isSegTtyRejectAgent());
		clon.setSegTtyTransaction(this.isSegTtyTransaction());
		clon.setSegIrssSSR(this.isSegIrssSSR());		
		/*End : Foot PrInteger new fields added to C2_PNR_SEGMENT*/

		
		
		return clon;
	}
	

	
	@Override
	public String toString() {
		return new StringBuffer().
		append("PNRSegment[").
		//append(id).append(",").
		//append(pnr).append(",").
		//append(segment).append(",").
		append(segFareClass).append(",").
		append(segSabreNumberInParty).append(",").
		append(segStatusCode).append(",").
		append(segPrevStatusCode).append(",").
		append(segActive).append(",").
		append(SeqConverter.sDate2String(segDepartureDateTime)).append(",").
		append(SeqConverter.sDate2String(segArrivalDateTime)).append(",").
		append(SeqConverter.sDate2String(segBookingDateTime)).append(",").
		append(segInbound).append(",").
		append(segOutbound).append(",").
		append(segSequence).append(",").
		append(segMarketingAirline).append(",").
		append(segCodeShare).
		append("]").
		toString();
	}
	
	
	
}
