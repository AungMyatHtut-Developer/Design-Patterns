package com.amh.observer_pattern.traffic_light_control_system.displays;

import com.amh.observer_pattern.traffic_light_control_system.Observer;
import com.amh.observer_pattern.traffic_light_control_system.TrafficLight;

import static com.amh.observer_pattern.traffic_light_control_system.TrafficLight.TrafficLightStatus;

public class CrossRoadTrafficLightDisplay implements Observer {

    public CrossRoadTrafficLightDisplay(TrafficLight trafficLight) {
        trafficLight.addObserver(this);
    }

    @Override
    public void update(boolean red, boolean green, boolean yellow) {
        System.out.println("Cross Road Traffic Light Display : "+ TrafficLightStatus(red,green,yellow));
    }
}
