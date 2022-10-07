package com.compnay;

public class Person {

    private String name;

    private int strength;

    private double health=100;

    private int stamina;

    private int speed;

    private int attackPower;
    private boolean running= false;
    private boolean arrested= false;


    public void attackAnotherCharacter(Person attackedPerson){
        attackedPerson.setHealth(attackedPerson.getHealth()-(strength*attackPower*.05));
    }

    public void attackAnotherCharacter(Warrior attackedPerson){
        attackedPerson.setHealth(attackedPerson.getHealth()-(strength*attackPower*.05)*.33);
        //less damage to person because shield
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }
}
