package com.zhaopeng.service;

import com.zhaopeng.bean.WeatherForecastBean;

import java.io.IOException;
import java.util.List;

public interface WeatherForecastService {
    public WeatherForecastBean getCurrentWeather(String city) throws IOException;
    public List<WeatherForecastBean> getFutureWeatherInfo(String city);
}
