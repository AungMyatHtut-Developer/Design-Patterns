package com.amh.strategry_pattern.good_design.bird.actions;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.SwimmingBehavior;

public class SwimmingNowWay implements SwimmingBehavior {
    @Override
    public void swim() {
        System.out.println("Can't Swim....");
    }
}
