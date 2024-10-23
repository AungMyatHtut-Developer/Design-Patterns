package com.amh.strategry_pattern.bad_design.bird;

import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Flyable;
import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Nestable;
import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Singable;

//can sing, can nest, can fly
public class Nightingale extends Bird implements Singable, Nestable, Flyable {

    public void display() {
        System.out.println("Nightingale...");
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
    public void sing() {
        System.out.println("Singing...");
    }
}
