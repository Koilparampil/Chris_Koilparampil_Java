package com.compnay;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    Warrior warrior1 =new Warrior("Fantismo");
    Warrior warrior2 =new Warrior("AntiFantismo");
    Farmer badFarmer = new Farmer("George");
    @Test
    public void shouldInstantiateAWarriorWithProperties(){
        assertEquals("Fantismo",warrior1.getName());
        assertEquals(75, warrior1.getStrength());
        assertEquals(100,warrior1.getHealth(),0);
        assertEquals(100,warrior1.getStamina());
        assertEquals(50,warrior1.getSpeed());
        assertEquals(10,warrior1.getAttackPower());
        assertFalse(warrior1.isArrested());
        assertFalse((warrior1.isRunning()));
    }

    @Test
    public void shouldReduceHealthOfAnotherCharacterByAttacking(){

        warrior1.attackAnotherCharacter(badFarmer);
        warrior1.attackAnotherCharacter(warrior2);
        assertEquals(62.5,badFarmer.getHealth(),.01);
        assertEquals(87.625,warrior2.getHealth(),.01);
    }
}