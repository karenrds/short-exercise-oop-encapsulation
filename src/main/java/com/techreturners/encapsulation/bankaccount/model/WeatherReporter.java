package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String print() {

        double newTemp = (9.0 / 5.0) * temperature + 32;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, getLocationIcon(location), checkTemperature(), newTemp);

    }

    private String getLocationIcon(String location) {
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



    private String checkTemperature() {
        String message;
        message = temperature > 30 ? "It's too hot 🥵!" : (temperature < 10 ? "It's too cold 🥶!" : "Ah hh...it's just right 😊!");
        return message;
    }

}