package com.amh.observer_pattern.traffic_light_control_system;

import com.amh.observer_pattern.traffic_light_control_system.displays.CrossRoadTrafficLightDisplay;
import com.amh.observer_pattern.traffic_light_control_system.displays.MainRoadTrafficLightDisplay;
import com.amh.observer_pattern.traffic_light_control_system.displays.SideRoadTrafficLightDisplay;

public class ControlStation {

    public static void main(String[] args) throws InterruptedException {

        TrafficLight trafficLight = new TrafficLight();

        new CrossRoadTrafficLightDisplay(trafficLight);
        new MainRoadTrafficLightDisplay(trafficLight);
        new SideRoadTrafficLightDisplay(trafficLight);

        trafficLight.updateTrafficLight(true,false,false);
        System.out.println("========================");
        Thread.sleep(2_000);
        trafficLight.updateTrafficLight(false,true,false);
        System.out.println("========================");
        Thread.sleep(2_000);
        trafficLight.updateTrafficLight(false,false,true);
    }
}
