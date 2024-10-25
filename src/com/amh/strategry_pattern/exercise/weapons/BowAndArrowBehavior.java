package com.amh.strategry_pattern.exercise.weapons;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Shooting an arrow with a bow");
    }
}
