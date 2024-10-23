package com.amh.strategry_pattern.good_design.bird;

import com.amh.strategry_pattern.good_design.bird.actions.*;

public class Parrot extends Bird{

    public Parrot() {
        flyingBehavior = new FlyWithBigWing();
        nestingBehavior = new Nesting();
        singingBehavior = new SingingNoWay();
        speakingBehavior = new Speaking();
        swimmingBehavior = new SwimmingNowWay();
    }

    public void display() {
        System.out.println("Parrot...");
    }

}
