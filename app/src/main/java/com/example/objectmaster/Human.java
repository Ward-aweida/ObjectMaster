package com.example.objectmaster;

public class Human {
    int stealth,intelligence,strength;
    int  health=100;

    public Human(int stealth, int intelligence, int strength, int health) {
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.strength = strength;
        this.health = health;
    }
    public void attack(Human human){

    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
