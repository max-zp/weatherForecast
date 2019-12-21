package com.zhaopeng.bean;

import com.zhaopeng.bean.sub.*;

import java.util.List;

/**
 * coord
 * coord.lon City geo location, longitude
 * coord.lat City geo location, latitude
 * weather (more info Weather condition codes)
 * weather.id Weather condition id
 * weather.main Group of weather parameters (Rain, Snow, Extreme etc.)
 * weather.description Weather condition within the group
 * weather.icon Weather icon id
 * base Internal parameter
 * main
 * main.temp Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
 * main.pressure Atmospheric pressure (on the sea level, if there is no sea_level or grnd_level data), hPa
 * main.humidity Humidity, %
 * main.temp_min Minimum temperature at the moment. This is deviation from current temp that is possible for large cities and megalopolises geographically expanded (use these parameter optionally). Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
 * main.temp_max Maximum temperature at the moment. This is deviation from current temp that is possible for large cities and megalopolises geographically expanded (use these parameter optionally). Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
 * main.sea_level Atmospheric pressure on the sea level, hPa
 * main.grnd_level Atmospheric pressure on the ground level, hPa
 * wind
 * wind.speed Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
 * wind.deg Wind direction, degrees (meteorological)
 * clouds
 * clouds.all Cloudiness, %
 * rain
 * rain.1h Rain volume for the last 1 hour, mm
 * rain.3h Rain volume for the last 3 hours, mm
 * snow
 * snow.1h Snow volume for the last 1 hour, mm
 * snow.3h Snow volume for the last 3 hours, mm
 * dt Time of data calculation, unix, UTC
 * sys
 * sys.type Internal parameter
 * sys.id Internal parameter
 * sys.message Internal parameter
 * sys.country Country code (GB, JP etc.)
 * sys.sunrise Sunrise time, unix, UTC
 * sys.sunset Sunset time, unix, UTC
 * timezone Shift in seconds from UTC
 * id City ID
 * name City name
 * cod Internal parameter
 */
public class WeatherForecastBean {

    private String cod;
    private String name;
    private Integer timezone;
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private String dt;
    private SYS sys;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimeZone() {
        return timezone;
    }

    public void setTimeZone(Integer timezone) {
        this.timezone = timezone;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public SYS getSys() {
        return sys;
    }

    public void setSys(SYS sys) {
        this.sys = sys;
    }
}