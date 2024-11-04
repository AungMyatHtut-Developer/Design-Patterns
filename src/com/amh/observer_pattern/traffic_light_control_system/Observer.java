package com.amh.observer_pattern.traffic_light_control_system;

public interface Observer {
    void update(boolean red, boolean green, boolean yellow);
}
