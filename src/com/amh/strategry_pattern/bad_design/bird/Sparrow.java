package com.amh.strategry_pattern.bad_design.bird;

import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Flyable;
import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Nestable;
import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Singable;

//can't sing, can fly, can nest
public class Sparrow extends Bird implements Flyable, Nestable {

    public void display() {
        System.out.println("Sparrow...");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void nest() {
        System.out.println("Nesting...");
    }
}
