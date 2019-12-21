package com.zhaopeng.controller;

import com.zhaopeng.service.QueryConditionService;
import com.zhaopeng.service.WeatherForecastService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WeatherForecastControllerTest{

	@InjectMocks
	private WeatherForecastController weatherForecastController;

    @Mock
    private WeatherForecastService weatherForecastService;

    @Mock
    private QueryConditionService queryConditionService;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testGetWeatherForecasts(){
		try{
			org.springframework.web.servlet.ModelAndView result = weatherForecastController.getWeatherForecasts("Melbourne");
		}catch (Exception e) {
		}

	}



}