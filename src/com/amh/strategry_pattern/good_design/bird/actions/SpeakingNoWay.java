package com.amh.strategry_pattern.good_design.bird.actions;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.SingingBehavior;
import com.amh.strategry_pattern.good_design.bird.bird_behavior.SpeakingBehavior;

public class SpeakingNoWay implements SpeakingBehavior {
    @Override
    public void speak() {
        System.out.println("Can't Speak...");
    }
}
