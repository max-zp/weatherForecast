package com.zhaopeng.bean;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;


public class WeatherForecastBeanTest{
    
    @InjectMocks
    private WeatherForecastBean weatherForecastBean;

    @Before
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testSetGetMethod() {
        try {
            Class<?> clazz = Class.forName("com.zhaopeng.bean.WeatherForecastBean");
            Object obj = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields) {
                try {
                    PropertyDescriptor pd = new PropertyDescriptor(f.getName(), clazz);
                    Method writeMethod = pd.getWriteMethod();
                    writeMethod.invoke(obj, new Object[] { null });
                    Method readMethod = pd.getReadMethod();
                    readMethod.invoke(obj);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }}