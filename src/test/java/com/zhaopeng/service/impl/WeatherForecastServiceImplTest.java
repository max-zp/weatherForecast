package com.zhaopeng.service.impl;

import com.zhaopeng.config.ConfigBean;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class WeatherForecastServiceImplTest{

	@InjectMocks
	private WeatherForecastServiceImpl weatherForecastServiceImpl;

	@Mock
    private ConfigBean configBean;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testGetFutureWeatherInfo(){
		try{
			java.util.List result = weatherForecastServiceImpl.getFutureWeatherInfo("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetCurrentWeather(){
		try{
			com.zhaopeng.bean.WeatherForecastBean result = weatherForecastServiceImpl.getCurrentWeather("city","Beijing");
		}catch (Exception e) {
		}

	}



}