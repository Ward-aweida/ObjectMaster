package com.example.objectmaster;

public class Wizard extends Human {
    int health=10;

    public Wizard(int stealth, int intelligence, int strength, int health, int health1) {
        super(stealth, intelligence, strength, health);
        this.health = health1;
    }
}
