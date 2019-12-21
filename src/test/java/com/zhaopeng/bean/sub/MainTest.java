package com.zhaopeng.bean.sub;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class MainTest{

	@InjectMocks
	private Main main;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testGetTemp_max(){
		try{
			java.lang.Float result = main.getTemp_max();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetFeels_like(){
		try{
			main.setFeels_like(1F);
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetTemp_min(){
		try{
			java.lang.Float result = main.getTemp_min();
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetPressure(){
		try{
			java.lang.Integer result = main.getPressure();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetTemp(){
		try{
			main.setTemp(1F);
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetPressure(){
		try{
			main.setPressure(0);
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetFeels_like(){
		try{
			java.lang.Float result = main.getFeels_like();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetHumidity(){
		try{
			main.setHumidity(0);
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetTemp_max(){
		try{
			main.setTemp_max(1F);
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetHumidity(){
		try{
			java.lang.Integer result = main.getHumidity();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetTemp_min(){
		try{
			main.setTemp_min(1F);
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetTemp(){
		try{
			java.lang.Float result = main.getTemp();
		}catch (Exception e) {
		}

	}



}