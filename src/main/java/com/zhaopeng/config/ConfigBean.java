package com.zhaopeng.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@PropertySource({"classpath:thirdAPIConfig.properties","query.properties"})
@Component
public class ConfigBean {

    @Value("${openweathermap.api.url}")
    private String url;
    @Value("${openweathermap.api.param.unit.Fahrenheit}")
    private String fahrenheit;
    @Value("${openweathermap.api.param.unit.Celsius}")
    private String celsius;
    @Value("${openweathermap.api.param.appId}")
    private String appId;

    @Value("${query.condition.cities}")
    private List<String> cityList;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

}
