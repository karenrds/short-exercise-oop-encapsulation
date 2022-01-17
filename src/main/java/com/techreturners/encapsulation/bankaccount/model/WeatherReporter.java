package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private final int COLD_THRESHOLD = 10;
    private final int HOT_THRESHOLD = 30;


    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String print() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, retrieveWeatherByLocation(location), getTemperature(), convertFromCelsiusToFahrenheit());
    }

    public double convertFromCelsiusToFahrenheit() {
        return (9.0 / 5.0) * temperature + 32;
    }

    public String retrieveWeatherByLocation(String location) {
        String result;
        switch (location) {
            case "London":
                result = "🌦";
                break;
            case "California":
                result = "🌅";
                break;
            case "Cape Town":
                result = "🌤";
                break;
            default:
                result = "🔆";
                break;
        }
        return result;
    }

    public String getTemperature() {
        String message;
        message = temperature > HOT_THRESHOLD ? "It's too hot 🥵!" : (temperature < COLD_THRESHOLD ? "It's too cold 🥶!" : "Ah hh...it's just right 😊!");
        return message;
    }
}