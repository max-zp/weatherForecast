package com.zhaopeng.service.impl;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class QueryConditionServiceImplTest{

	@InjectMocks
	private QueryConditionServiceImpl queryConditionServiceImpl;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testGetCityList(){
		try{
			java.util.List result = queryConditionServiceImpl.getCityList();
		}catch (Exception e) {
		}

	}



}