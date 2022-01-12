package com.techreturners.weatherReport;

import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherReportTest {
    private WeatherReporter testReport;

    @Before
    public void setup() {
        testReport = new WeatherReporter("London", 9);
    }


    @Test
    public void checkLocationIcon(){
        assertEquals("🌦", testReport.getLocationIcon("London"));
    }

    @Test
    public void checkTemperature() {
        assertEquals("It's too cold 🥶!", testReport.getTemperature());
    }
}