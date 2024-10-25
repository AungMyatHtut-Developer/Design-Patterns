package com.amh.strategry_pattern.exercise.weapons;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Cutting with sharp edges.");
    }
}
