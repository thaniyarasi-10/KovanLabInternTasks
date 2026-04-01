package com.kovan.rpgbattlesystem.model;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 120, 15);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(6);
        opponent.takeDamage(damage);
    }
}
