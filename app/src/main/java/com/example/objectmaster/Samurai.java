package com.example.objectmaster;

public class Samurai extends Human {
    int health=200;

    public Samurai(int stealth, int intelligence, int strength, int health, int health1) {
        super(stealth, intelligence, strength, health);
        this.health = health1;
    }
    public void  deathBlow(Human human){

    }
    public void meditate(){

    }
    public void  howMany(){

    }
}
