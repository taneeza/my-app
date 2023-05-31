package com.mycompany.app;

import openweatherapi.GetWeatherData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple GetWeatherData.java.
 */
public class GetWeatherDataTest {
    private static final Logger logger = LogManager.getLogger(GetWeatherDataTest.class);


    /*@Test
    public void getWeatherTest(){
        String actualValue =  GetWeatherData.getWeatherData();
        Assert.assertEquals("stations",actualValue);
        logger.info("Test Passed");
    } */

    @Test
    public void getWeatherTest2(){
        String actualValue =  GetWeatherData.getWeatherData();
        Assert.assertEquals("IT",actualValue);
        logger.info("Test Passed");
    }
}
