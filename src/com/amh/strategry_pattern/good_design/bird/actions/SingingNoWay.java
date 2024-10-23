package com.amh.strategry_pattern.good_design.bird.actions;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.SingingBehavior;

public class SingingNoWay implements SingingBehavior {
    @Override
    public void sing() {
        System.out.println("Can't Sing...");
    }
}
