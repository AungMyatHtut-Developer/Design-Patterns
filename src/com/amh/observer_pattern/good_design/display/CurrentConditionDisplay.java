package com.amh.observer_pattern.good_design.display;

import com.amh.observer_pattern.good_design.Observer;
import com.amh.observer_pattern.good_design.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : "+ temperature +" F degrees and "+ humidity +" % humidity.");
    }
}
