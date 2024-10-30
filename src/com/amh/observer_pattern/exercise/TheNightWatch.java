package com.amh.observer_pattern.exercise;

import com.amh.observer_pattern.exercise.display.EnemyDisplay;
import com.amh.observer_pattern.exercise.display.FireDisplay;

public class TheNightWatch {

    public static void main(String[] args) throws InterruptedException {
        NightWatcher nightWatcher = new NightWatcher();
        EnemyDisplay enemyDisplay = new EnemyDisplay(nightWatcher);

        nightWatcher.updateNightWatch(10,2,3);
        Thread.sleep(1000);
        nightWatcher.updateNightWatch(9,3,1);
        Thread.sleep(1000);
        nightWatcher.removeObserver(enemyDisplay);
        nightWatcher.updateNightWatch(34,3,1);

        FireDisplay fireDisplay = new FireDisplay(nightWatcher);
        nightWatcher.updateNightWatch(34, 23, 12);
        Thread.sleep(1000);
        nightWatcher.updateNightWatch(23, 34,56);
        Thread.sleep(1000);
        nightWatcher.addToObserver(enemyDisplay);
        nightWatcher.updateNightWatch(10,10,10);
        Thread.sleep(1000);
        nightWatcher.updateNightWatch(10,23,28);
    }

}
