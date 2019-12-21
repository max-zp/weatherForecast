package com.zhaopeng.controller;

import com.zhaopeng.service.QueryConditionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.doNothing;

public class QueryConditionControllerTest{



    @InjectMocks
	private QueryConditionController queryConditionController;

    @Mock
    private QueryConditionService queryConditionService;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testGetWeatherForecasts(){
		try{
			org.springframework.web.servlet.ModelAndView result = queryConditionController.getWeatherForecasts();
		}catch (Exception e) {
		}

	}



}