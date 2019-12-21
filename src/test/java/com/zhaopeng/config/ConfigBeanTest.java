package com.zhaopeng.config;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class ConfigBeanTest{

	@InjectMocks
	private ConfigBean configBean;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testGetUrl(){
		try{
			java.lang.String result = configBean.getUrl();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetCityList(){
		try{
			java.util.List result = configBean.getCityList();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetCelsius(){
		try{
			configBean.setCelsius("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetFahrenheit(){
		try{
			java.lang.String result = configBean.getFahrenheit();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetFahrenheit(){
		try{
			configBean.setFahrenheit("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetAppId(){
		try{
			configBean.setAppId("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetUrl(){
		try{
			configBean.setUrl("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetCelsius(){
		try{
			java.lang.String result = configBean.getCelsius();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetAppId(){
		try{
			java.lang.String result = configBean.getAppId();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetCityList(){
		try{
			configBean.setCityList(null);
		}catch (Exception e) {
		}

	}



}