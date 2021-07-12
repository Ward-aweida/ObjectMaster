package com.example.objectmaster;

public class Samurai extends Human {
    int health=10;

    public Samurai(int stealth, int intelligence, int strength, int health, int health1) {
        super(stealth, intelligence, strength, health);
        this.health = health1;
    }
}
