package com.amh.observer_pattern.bad_design;

import com.amh.observer_pattern.bad_design.display.CurrentConditionDisplay;
import com.amh.observer_pattern.bad_design.display.ForecastDisplay;
import com.amh.observer_pattern.bad_design.display.StatisticsDisplay;

public class WeatherData {

    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    private float getPressure() {
        return 0;
    }

    private float getHumidity() {
        return 0;
    }

    private float getTemperature() {
        return 0;
    }
}
