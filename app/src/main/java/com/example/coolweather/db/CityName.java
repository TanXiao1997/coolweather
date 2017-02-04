package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/2/4 0004.
 */

public class CityName extends DataSupport
{
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getCountryName()
    {
        return countryName;
    }
    public void setCountryName(String cityName)
    {
        this.countryName=countryName;
    }
    public String getWeatherId()
    {
        return weatherId;
    }
    public void setWeatherId(String weatherId)
    {
        this.weatherId=weatherId;
    }
    public int getCityId()
    {
        return cityId;
    }
    public void setCityId(int cityId)
    {
        this.cityId=cityId;
    }
}
