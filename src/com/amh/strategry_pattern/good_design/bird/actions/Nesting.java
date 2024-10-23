package com.amh.strategry_pattern.good_design.bird.actions;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.NestingBehavior;

public class Nesting implements NestingBehavior {
    @Override
    public void nest() {
        System.out.println("Nesting...");
    }
}
