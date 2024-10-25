package com.amh.strategry_pattern.good_design.bird.actions;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.ChirpBehavior;

public class Chirping implements ChirpBehavior {
    @Override
    public void chirp() {
        System.out.println("Chirping...");
    }
}
