package com.zhaopeng.bean.sub;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class SnowTest{

	@InjectMocks
	private Snow snow;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testSetThreeh(){
		try{
			snow.setThreeh("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetThreeh(){
		try{
			java.lang.String result = snow.getThreeh();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetOneh(){
		try{
			snow.setOneh("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetOneh(){
		try{
			java.lang.String result = snow.getOneh();
		}catch (Exception e) {
		}

	}



}