package com.kovan.rpgbattlesystem.model;

import java.io.Serializable;
import java.util.Random;

public abstract class Character implements Serializable {

    protected String name;
    protected int health;
    protected int strength;
    protected Random random = new Random();

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public abstract void attack(Character opponent);

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
