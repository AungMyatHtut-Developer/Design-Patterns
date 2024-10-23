package com.amh.strategry_pattern.good_design.bird.actions;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.FlyingBehavior;

public class FlyWithSmallWing implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("Flying With Small Wings...");
    }
}
