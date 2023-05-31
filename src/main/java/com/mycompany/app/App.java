package com.mycompany.app;

import openweatherapi.GetWeatherData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


public class App
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        // logger.info( "Version 1.0!" );
        logger.info("Version 1.0!");

        GetWeatherData.getWeatherData();

    }
}