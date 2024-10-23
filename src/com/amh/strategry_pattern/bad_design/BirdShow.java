package com.amh.strategry_pattern.bad_design;

import com.amh.strategry_pattern.bad_design.bird.*;

public class BirdShow {

    public static void main(String[] args) {
        Nightingale nightingale = new Nightingale();
        nightingale.display();
        nightingale.sing();
        nightingale.fly();
        nightingale.nest();

        Sparrow sparrow = new Sparrow();
        sparrow.display();
        sparrow.fly();
        sparrow.nest();

        Penguin penguin = new Penguin();
        penguin.display();
        penguin.swim();

        EmperorPenguins emperorPenguins = new EmperorPenguins();
        emperorPenguins.display();
        emperorPenguins.swim();

        Parrot parrot = new Parrot();
        parrot.display();
        parrot.fly();
        parrot.nest();
        parrot.speak();
    }
}
