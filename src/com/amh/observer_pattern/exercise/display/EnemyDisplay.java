package com.amh.observer_pattern.exercise.display;

import com.amh.observer_pattern.exercise.NightWatcher;
import com.amh.observer_pattern.exercise.Observer;

public class EnemyDisplay implements Observer, NightWatcherView {

    private int enemyCount;
    private NightWatcher nightWatcher;

    public EnemyDisplay(NightWatcher nightWatcher) {
        this.nightWatcher = nightWatcher;
        nightWatcher.addToObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Enemy Display : The EnemyCount : "+ enemyCount);
    }

    @Override
    public void update(int enemyCount, int goshCount, int lightCount ) {
        this.enemyCount =enemyCount;
        display();
    }
}
