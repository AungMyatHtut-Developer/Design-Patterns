package com.amh.strategry_pattern.good_design.bird;

import com.amh.strategry_pattern.good_design.bird.actions.*;

//can sing, can nest, can fly
public class Nightingale extends Bird{

    public Nightingale() {
        flyingBehavior = new FlyWithSmallWing();
        nestingBehavior = new Nesting();
        singingBehavior = new Singing();
        speakingBehavior = new SpeakingNoWay();
        swimmingBehavior = new SwimmingNowWay();
    }


    public void display() {
        System.out.println("Nightingale...");
    }

}
