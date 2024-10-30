package com.amh.observer_pattern.exercise.display;

import com.amh.observer_pattern.exercise.NightWatcher;
import com.amh.observer_pattern.exercise.Observer;

public class FireDisplay implements Observer, NightWatcherView {

    private int fireCount;
    private NightWatcher nightWatcher;

    public FireDisplay(NightWatcher nightWatcher) {
        this.nightWatcher = nightWatcher;
        nightWatcher.addToObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Fire Display : BoomFire Count : "+ fireCount );
    }

    @Override
    public void update(int enemyCount, int horseCount, int lightCount) {
        this.fireCount = lightCount;
        display();
    }
}
