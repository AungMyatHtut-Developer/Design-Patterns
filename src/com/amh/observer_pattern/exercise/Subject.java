package com.amh.observer_pattern.exercise;

public interface Subject {

    void addToObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}


