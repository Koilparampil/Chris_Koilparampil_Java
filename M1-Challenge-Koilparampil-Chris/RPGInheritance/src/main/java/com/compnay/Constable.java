package com.compnay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constable extends Person {
    public List<String> jurisdiction;

    public Constable(String name) {
        super(name);
        this.setStrength(60);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);;
        this.jurisdiction= new ArrayList<>();
    }

    public void arrestSomeone(Person someoneArrested){
        someoneArrested.setArrested(true);
    }

    public List<String> getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(List<String> jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

}
