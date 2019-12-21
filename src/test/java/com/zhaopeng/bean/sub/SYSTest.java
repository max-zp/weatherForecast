package com.zhaopeng.bean.sub;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class SYSTest{

	@InjectMocks
	private SYS sYS;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testSetCountry(){
		try{
			sYS.setCountry("123");
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetCountry(){
		try{
			java.lang.String result = sYS.getCountry();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetSunset(){
		try{
			java.lang.Long result = sYS.getSunset();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetType(){
		try{
			java.lang.Integer result = sYS.getType();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetSunrise(){
		try{
			sYS.setSunrise(1L);
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetSunset(){
		try{
			sYS.setSunset(1L);
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetId(){
		try{
			sYS.setId(0);
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetId(){
		try{
			java.lang.Integer result = sYS.getId();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetSunrise(){
		try{
			java.lang.Long result = sYS.getSunrise();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetType(){
		try{
			sYS.setType(0);
		}catch (Exception e) {
		}

	}



}