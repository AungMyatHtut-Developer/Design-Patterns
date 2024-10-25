package com.amh.strategry_pattern.exercise.characters;

import com.amh.strategry_pattern.exercise.weapons.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
