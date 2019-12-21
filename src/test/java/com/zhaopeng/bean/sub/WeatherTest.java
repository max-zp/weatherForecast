package com.zhaopeng.bean.sub;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class WeatherTest{

	@InjectMocks
	private Weather weather;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testSetIcon(){
		try{
			weather.setIcon("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetMain(){
		try{
			weather.setMain("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetId(){
		try{
			weather.setId(0);
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetId(){
		try{
			java.lang.Integer result = weather.getId();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetDescription(){
		try{
			weather.setDescription("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetMain(){
		try{
			java.lang.String result = weather.getMain();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetDescription(){
		try{
			java.lang.String result = weather.getDescription();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetIcon(){
		try{
			java.lang.String result = weather.getIcon();
		}catch (Exception e) {
		}

	}



}