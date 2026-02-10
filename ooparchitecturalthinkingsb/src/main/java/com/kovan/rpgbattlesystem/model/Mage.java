package com.kovan.rpgbattlesystem.model;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 80, 25);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(15);
        opponent.takeDamage(damage);
    }
}
