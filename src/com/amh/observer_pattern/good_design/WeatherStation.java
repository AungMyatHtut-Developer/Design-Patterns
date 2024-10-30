package com.amh.observer_pattern.good_design;

import com.amh.observer_pattern.good_design.display.CurrentConditionDisplay;

public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        Thread.sleep(1000);
        weatherData.setMeasurements(70, 45, 36.4f);
        Thread.sleep(1000);
        weatherData.removeObserver(currentConditionDisplay);
        weatherData.setMeasurements(40, 69, 37.4f);
    }
}
