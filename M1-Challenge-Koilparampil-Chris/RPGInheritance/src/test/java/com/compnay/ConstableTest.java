package com.compnay;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
Constable constable1 = new Constable("Benson");
Farmer badFarmer = new Farmer("George");

Warrior warrior2 =new Warrior("AntiFantismo");
    @Test
    public void shouldInstantiateAConstableWithProperties(){

        assertEquals("Benson",constable1.getName());
        assertEquals(60, constable1.getStrength());
        assertEquals(100,constable1.getHealth(),0);
        assertEquals(60,constable1.getStamina());
        assertEquals(20,constable1.getSpeed());
        assertEquals(5,constable1.getAttackPower());
        assertFalse(constable1.isArrested());
        assertFalse((constable1.isRunning()));
    }
    @Test
    public void shouldArrestSomeone() {
        constable1.arrestSomeone(badFarmer);

        assertTrue(badFarmer.isArrested());
    }

    @Test
    public void shouldReduceHealthOfAnotherCharacterByAttacking(){

        constable1.attackAnotherCharacter(badFarmer);
        constable1.attackAnotherCharacter(warrior2);
        assertEquals(85,badFarmer.getHealth(),.01);
        assertEquals(95.05,warrior2.getHealth(),.01);
    }
}