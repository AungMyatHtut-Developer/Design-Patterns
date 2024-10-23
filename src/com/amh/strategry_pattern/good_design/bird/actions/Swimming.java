package com.amh.strategry_pattern.good_design.bird.actions;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.SwimmingBehavior;

public class Swimming implements SwimmingBehavior {

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }
}
