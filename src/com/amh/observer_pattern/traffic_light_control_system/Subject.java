package com.amh.observer_pattern.traffic_light_control_system;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
