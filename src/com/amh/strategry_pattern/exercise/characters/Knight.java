package com.amh.strategry_pattern.exercise.characters;

import com.amh.strategry_pattern.exercise.weapons.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
