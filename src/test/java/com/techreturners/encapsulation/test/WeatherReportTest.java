package com.techreturners.encapsulation.test;
import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherReportTest {
    private WeatherReporter l1;
    private WeatherReporter l2;
    private WeatherReporter l3;

    public WeatherReportTest() {
    }

    @Before
    public void setup() {
         l1 = new WeatherReporter("London", 7.0);
         l2 = new WeatherReporter("California", 35.0);
         l3 = new WeatherReporter("Cape Town", 19.0);
    }

    @Test
    public void checkWeatherByLocation() {
        assertEquals("🌦", l1.retrieveWeatherByLocation("London"));
        assertEquals("🌅", l2.retrieveWeatherByLocation("California"));
        assertEquals("🌤", l3.retrieveWeatherByLocation("Cape Town"));

    }

    @Test
    public void checkTemperature() {
        assertEquals("It's too cold 🥶!", l1.getTemperature());
        assertEquals("It's too hot 🥵!", l2.getTemperature());
        assertEquals("Ah hh...it's just right 😊!", l3.getTemperature());
    }

    @Test
    public void checkPrint() {
        assertEquals("I am in London and it is 🌦. It's too cold 🥶!. The temperature in Fahrenheit is 44.6.", l1.print());
        assertEquals("I am in California and it is 🌅. It's too hot 🥵!. The temperature in Fahrenheit is 95.0.", l2.print());
        assertEquals("I am in Cape Town and it is 🌤. Ah hh...it's just right 😊!. The temperature in Fahrenheit is 66.2.", l3.print());
    }
}