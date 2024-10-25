package com.amh.strategry_pattern.good_design;


import com.amh.strategry_pattern.good_design.bird.*;
import com.amh.strategry_pattern.good_design.bird.actions.Singing;
import com.amh.strategry_pattern.good_design.enemy.Hunter;

public class BirdShow {

    public static void main(String[] args) {
        Bird bird = new Nightingale();
        bird.display();
        bird.fly();
        bird.nest();
        bird.sing();
        bird.speak();
        bird.swim();
        bird.makeVoice();

        bird.setSingingBehavior(new Singing());
        bird.sing();

        System.out.println("Now The Hunter Heard The Bird's sound===================");

        Hunter hunter = new Hunter();
        hunter.setBird(bird.getChirpBehavior());
        hunter.callBird();

    }
}
