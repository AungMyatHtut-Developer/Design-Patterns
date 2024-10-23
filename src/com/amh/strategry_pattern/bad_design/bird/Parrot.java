package com.amh.strategry_pattern.bad_design.bird;

import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Flyable;
import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Nestable;
import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Speakable;

public class Parrot extends Bird implements Flyable, Nestable, Speakable {

    public void display() {
        System.out.println("Parrot...");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void nest() {
        System.out.println("Nesting...");
    }

    @Override
    public void speak() {
        System.out.println("Speaking...");
    }

}
