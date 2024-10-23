package com.amh.strategry_pattern.bad_design.bird;

import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Nestable;
import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Swimmable;

//can't fly, can't sing, can nest
public class Penguin extends Bird implements Nestable, Swimmable {

    public void display() {
        System.out.println("Penguin...");
    }


    @Override
    public void nest() {
        System.out.println("Nesting...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }
}
