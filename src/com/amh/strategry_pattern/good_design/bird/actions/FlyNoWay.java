package com.amh.strategry_pattern.good_design.bird.actions;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.FlyingBehavior;

public class FlyNoWay implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("Can't Fly...");
    }
}
