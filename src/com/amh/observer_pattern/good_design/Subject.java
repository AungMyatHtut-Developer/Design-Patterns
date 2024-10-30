package com.amh.observer_pattern.good_design;

public interface Subject{

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
