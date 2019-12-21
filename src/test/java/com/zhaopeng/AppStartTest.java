package com.zhaopeng;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class AppStartTest{

	@InjectMocks
	private AppStart appStart;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testMain(){
		try{
			appStart.main(null);
		}catch (Exception e) {
		}

	}



}