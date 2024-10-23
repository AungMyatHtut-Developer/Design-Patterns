package com.amh.strategry_pattern.bad_design.bird;

import com.amh.strategry_pattern.bad_design.bird.bird_behavior.Swimmable;

//can't sing, can't fly, can't nest
public class EmperorPenguins extends Bird implements Swimmable {

    public void display() {
        System.out.println("Emperor penguins...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }
}
