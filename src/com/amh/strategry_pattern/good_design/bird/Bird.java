package com.amh.strategry_pattern.good_design.bird;

import com.amh.strategry_pattern.good_design.bird.bird_behavior.*;

public class Bird {

    FlyingBehavior flyingBehavior;
    NestingBehavior nestingBehavior;
    SingingBehavior singingBehavior;
    SpeakingBehavior speakingBehavior;
    SwimmingBehavior swimmingBehavior;

    public void display() {
        System.out.println("Bird...");
    }

    public void fly() {
        flyingBehavior.fly();
    }

    public void nest() {
        nestingBehavior.nest();
    }

    public void sing() {
        singingBehavior.sing();
    }

    public void speak() {
        speakingBehavior.speak();
    }

    public void swim() {
        swimmingBehavior.swim();
    }

    public void setSingingBehavior(SingingBehavior singingBehavior) {
        this.singingBehavior = singingBehavior;
    }


}
