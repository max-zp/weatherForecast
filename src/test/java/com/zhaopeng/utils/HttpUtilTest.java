package com.zhaopeng.utils;

import okhttp3.OkHttpClient;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class HttpUtilTest{

	@InjectMocks
	private HttpUtil httpUtil;

	@Mock
    private OkHttpClient okHttpClient;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testGetInstance(){
		try{

			com.zhaopeng.utils.HttpUtil result = httpUtil.getInstance();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetData(){
		try{
            httpUtil = HttpUtil.getInstance();
			java.lang.Object result = httpUtil.getData("123",null);
		}catch (Exception e) {
		}

	}



}