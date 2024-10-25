package com.amh.strategry_pattern.good_design.bird;

import com.amh.strategry_pattern.good_design.bird.actions.*;

//can't sing, can fly, can nest
public class Sparrow extends Bird{

    public Sparrow() {
        flyingBehavior = new FlyWithSmallWing();
        nestingBehavior = new Nesting();
        singingBehavior = new SingingNoWay();
        speakingBehavior = new SpeakingNoWay();
        swimmingBehavior = new SwimmingNowWay();
        chirpBehavior = new Chirping();
    }

    public void display() {
        System.out.println("Sparrow...");
    }

}
