package com.amh.strategry_pattern.good_design.bird;

import com.amh.strategry_pattern.good_design.bird.actions.*;

//can't fly, can't sing, can nest
public class Penguin extends Bird {

    public Penguin() {
        flyingBehavior = new FlyNoWay();
        nestingBehavior = new Nesting();
        singingBehavior = new SingingNoWay();
        speakingBehavior = new SpeakingNoWay();
        swimmingBehavior = new Swimming();
        chirpBehavior = new Screaming();
    }

    public void display() {
        System.out.println("Penguin...");
    }
}
