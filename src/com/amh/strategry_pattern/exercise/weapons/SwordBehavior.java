package com.amh.strategry_pattern.exercise.weapons;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword.");
    }
}
