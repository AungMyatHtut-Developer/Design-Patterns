package com.amh.strategry_pattern.good_design;


import com.amh.strategry_pattern.good_design.bird.*;
import com.amh.strategry_pattern.good_design.bird.actions.Singing;

public class BirdShow {

    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.display();
        bird.fly();
        bird.nest();
        bird.sing();
        bird.speak();
        bird.swim();

        bird.setSingingBehavior(new Singing());
        bird.sing();

    }
}
