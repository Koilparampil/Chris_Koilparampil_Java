package com.compnay;

public class Warrior extends Person{
    private int shieldStrength;

    public Warrior(String name) {
        super(name);
        this.setStrength(75);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.shieldStrength = 100;

    }
    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

}
