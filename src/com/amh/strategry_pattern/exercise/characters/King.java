package com.amh.strategry_pattern.exercise.characters;

import com.amh.strategry_pattern.exercise.weapons.SwordBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
