package com.zhaopeng.utils;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class JsonUtilTest{

	@InjectMocks
	private JsonUtil jsonUtil;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testList2Json(){
		try{
			java.lang.String result = jsonUtil.list2Json("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testJson2List(){
		try{
			java.util.List result = jsonUtil.json2List("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testObj2Json(){
		try{
			java.lang.String result = jsonUtil.Obj2Json("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testJson2Bean(){
		try{
			java.lang.Object result = jsonUtil.json2Bean("123",null);
		}catch (Exception e) {
		}

	}



}