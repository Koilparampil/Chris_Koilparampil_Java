package com.compnay;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    Farmer farmer1 =new Farmer("George");
    Farmer badFarmer = new Farmer("George");
    Warrior warrior2 =new Warrior("AntiFantismo");
    @Test
    public void shouldInstantiateAFarmerWithProperties(){


        assertEquals("George",farmer1.getName());
        assertEquals(75, farmer1.getStrength());
        assertEquals(100,farmer1.getHealth(),0);
        assertEquals(75,farmer1.getStamina());
        assertEquals(10,farmer1.getSpeed());
        assertEquals(1,farmer1.getAttackPower());
        assertFalse(farmer1.isPlowing());
        assertFalse(farmer1.isHarvesting());
        assertFalse(farmer1.isArrested());
        assertFalse((farmer1.isRunning()));
    }
    @Test
    public void shouldReduceHealthOfAnotherCharacterByAttacking(){

        farmer1.attackAnotherCharacter(badFarmer);
        farmer1.attackAnotherCharacter(warrior2);
        assertEquals(96.25,badFarmer.getHealth(),.01);
        assertEquals(98.7625,warrior2.getHealth(),.01);
    }
}