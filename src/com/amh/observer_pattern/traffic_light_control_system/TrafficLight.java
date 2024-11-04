package com.amh.observer_pattern.traffic_light_control_system;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight implements Subject {

    private List<Observer> observerList;
    private boolean red;
    private boolean green;
    private boolean yellow;

    public TrafficLight() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    public void updateTrafficLight(boolean red, boolean green, boolean yellow) {
        this.red = red;
        this.green = green;
        this.yellow = yellow;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(red,green,yellow);
        }
    }

    public static String TrafficLightStatus(boolean red, boolean green, boolean yellow) {
        if (red) {
            return "RED";
        } else if (green) {
            return "GREEN";
        } else if (yellow) {
            return "YELLOW";
        } else {
            return "BLACK";
        }
    }
}
