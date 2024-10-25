package com.amh.strategry_pattern.good_design.bird;

import com.amh.strategry_pattern.good_design.bird.actions.*;

//can't sing, can't fly, can't nest
public class EmperorPenguins extends Bird {

    public EmperorPenguins() {
        flyingBehavior = new FlyNoWay();
        nestingBehavior = new NestingNoWay();
        singingBehavior = new SingingNoWay();
        speakingBehavior = new SpeakingNoWay();
        swimmingBehavior = new Swimming();
        chirpBehavior = new Screaming();
    }

    public void display() {
        System.out.println("Emperor penguins...");
    }

}
