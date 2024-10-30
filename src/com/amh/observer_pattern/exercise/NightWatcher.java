package com.amh.observer_pattern.exercise;

import java.util.ArrayList;
import java.util.List;

public class NightWatcher implements Subject{

    private List<Observer> observerList;
    private int enemyCount;
    private int goshCount;
    private int lightCount;

    public NightWatcher() {
        observerList = new ArrayList<>();
    }

    @Override
    public void addToObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observerList) {
            o.update(enemyCount,goshCount,lightCount);
        }
    }

    public void updateNightWatch(int enemyCount, int goshCount, int lightCount){
        this.enemyCount = enemyCount;
        this.goshCount = goshCount;
        this.lightCount = lightCount;
        notifyObserver();
    }
}
