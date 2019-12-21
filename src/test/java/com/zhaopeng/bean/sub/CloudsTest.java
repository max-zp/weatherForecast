package com.zhaopeng.bean.sub;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class CloudsTest{

	@InjectMocks
	private Clouds clouds;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testGetAll(){
		try{
			java.lang.String result = clouds.getAll();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetAll(){
		try{
			clouds.setAll("123");
		}catch (Exception e) {
		}

	}



}