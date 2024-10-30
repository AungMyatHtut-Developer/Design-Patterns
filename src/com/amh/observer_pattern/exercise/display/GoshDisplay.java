package com.amh.observer_pattern.exercise.display;

import com.amh.observer_pattern.exercise.NightWatcher;
import com.amh.observer_pattern.exercise.Observer;

public class GoshDisplay implements Observer, NightWatcherView {

    private int goshCounter;
    private NightWatcher nightWatcher;

    public GoshDisplay(NightWatcher nightWatcher) {
        this.nightWatcher = nightWatcher;
        nightWatcher.addToObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Gosh Display : Gosh Count : "+ goshCounter );
    }

    @Override
    public void update(int enemyCount, int goshCounter, int lightCount) {
        this.goshCounter = goshCounter;
        display();
    }
}
