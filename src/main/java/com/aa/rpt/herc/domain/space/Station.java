package com.aa.rpt.herc.domain.space;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.io.Serializable;

@SpaceClass
public class Station implements Serializable {

    private static final long serialVersionUID = 3672869454381324248L;

    private String stationCode;
    private String cityCode;
    private String countryCode;
    private String gmtOffSet;
    private String timezoneCode;
    private String dstAdjMin;

    @SpaceId
    public String getStationCode() {
        return stationCode;
    }

    /**
     * @param stationCode the stationCode to set
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    /**
     * @return the cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode the cityCode to set
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
     * @return the timezoneCode
     */
    public String getTimezoneCode() {
        return timezoneCode;
    }

    /**
     * @param timezoneCode the timezoneCode to set
     */
    public void setTimezoneCode(String timezoneCode) {
        this.timezoneCode = timezoneCode;
    }

    public String getDstAdjMin() {
        return dstAdjMin;
    }

    public void setDstAdjMin(String dstAdjMin) {
        this.dstAdjMin = dstAdjMin;
    }

}
