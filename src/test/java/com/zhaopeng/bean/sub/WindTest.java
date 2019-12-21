package com.zhaopeng.bean.sub;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class WindTest{

	@InjectMocks
	private Wind wind;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testSetSpeed(){
		try{
			wind.setSpeed(1F);
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetDeg(){
		try{
			wind.setDeg(0);
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetSpeed(){
		try{
			java.lang.Float result = wind.getSpeed();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetDeg(){
		try{
			java.lang.Integer result = wind.getDeg();
		}catch (Exception e) {
		}

	}



}