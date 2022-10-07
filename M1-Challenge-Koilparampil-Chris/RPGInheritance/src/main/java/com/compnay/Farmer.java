package com.compnay;

import java.util.ArrayList;
import java.util.Arrays;

public class Farmer extends Person{
    private boolean plowing;
    private boolean harvesting;



    public Farmer(String name) {
        super(name);
        this.setStrength(75);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);;
        this.plowing=false;
        this.harvesting=false;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

}
