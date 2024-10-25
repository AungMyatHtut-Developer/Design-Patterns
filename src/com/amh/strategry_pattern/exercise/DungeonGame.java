package com.amh.strategry_pattern.exercise;

import com.amh.strategry_pattern.exercise.characters.Character;
import com.amh.strategry_pattern.exercise.characters.Knight;
import com.amh.strategry_pattern.exercise.weapons.AxeBehavior;

public class DungeonGame {
    public static void main(String[] args) {
        Character knight = new Knight();
        knight.fight();
        knight.setWeaponBehavior(new AxeBehavior());
        knight.fight();
    }
}
