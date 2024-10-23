package com.amh.strategry_pattern.good_design.bird.actions;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.SingingBehavior;

public class Singing implements SingingBehavior {
    @Override
    public void sing() {
        System.out.println("Singing...");
    }
}
