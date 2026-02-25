package com.kovan.rpgbattlesystem.model;

public class Rogue extends Character {

    public Rogue(String name) {
        super(name, 100, 18);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(10);
        opponent.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        if (random.nextInt(100) < 30) {
            return; // dodge
        }
        super.takeDamage(damage);
    }
}
