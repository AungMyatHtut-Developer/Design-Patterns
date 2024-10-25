package com.amh.strategry_pattern.exercise.characters;

import com.amh.strategry_pattern.exercise.weapons.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
