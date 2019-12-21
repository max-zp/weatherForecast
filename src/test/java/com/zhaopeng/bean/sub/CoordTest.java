package com.zhaopeng.bean.sub;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
public class CoordTest{

	@InjectMocks
	private Coord coord;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
    public void testGetLat(){
		try{
			java.lang.Float result = coord.getLat();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetLon(){
		try{
			coord.setLon(1F);
		}catch (Exception e) {
		}

	}

	@Test
    public void testGetLon(){
		try{
			java.lang.Float result = coord.getLon();
		}catch (Exception e) {
		}

	}

	@Test
    public void testSetLat(){
		try{
			coord.setLat(1F);
		}catch (Exception e) {
		}

	}



}