package com.amh.strategry_pattern.exercise.characters;

import com.amh.strategry_pattern.exercise.weapons.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
