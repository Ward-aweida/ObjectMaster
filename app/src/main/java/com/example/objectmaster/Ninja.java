package com.example.objectmaster;

public class Ninja extends Human{
    int stealth=10;

    public Ninja(int stealth, int intelligence, int strength, int health, int stealth1) {
        super(stealth, intelligence, strength, health);
        this.stealth = stealth1;
    }
    public void steal (Human human){

    }
}
