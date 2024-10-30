package com.amh.observer_pattern.good_design.display;

import com.amh.observer_pattern.good_design.DisplayElement;
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
    public void display() {
        System.out.println("Current Conditions : "+ temperature +" F degrees and "+ humidity +" % humidity.");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
