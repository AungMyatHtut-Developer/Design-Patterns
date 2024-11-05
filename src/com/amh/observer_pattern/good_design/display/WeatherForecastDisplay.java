package com.amh.observer_pattern.good_design.display;

import com.amh.observer_pattern.good_design.Observer;
import com.amh.observer_pattern.good_design.WeatherData;

public class WeatherForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public WeatherForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.lastPressure = currentPressure;
        this.currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: Current Pressure:" + currentPressure +"\tLast Pressure:" + lastPressure);
    }
}
