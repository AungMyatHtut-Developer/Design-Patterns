package com.amh.strategry_pattern.exercise.weapons;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe.");
    }
}
