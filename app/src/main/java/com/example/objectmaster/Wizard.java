package com.example.objectmaster;

public class Wizard extends Human {
    int health=50;
    int intelligence = 8 ;

    public Wizard(int stealth, int intelligence, int strength, int health, int health1) {
        super(stealth, intelligence, strength, health);
        this.health = health;
    }
    public void fireball(int health,int intelligence){
        this.health=47;
        this.intelligence=intelligence*3;

    }
}
