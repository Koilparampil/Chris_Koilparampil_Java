package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {


    ConverterSwitch convertSwitch= new ConverterSwitch();
    @Test
    public void shouldTakeInAnIntAndConvertToMonth() {
       String expectedValue1 = "January";
       String expectedValue2 = "August";

       assertEquals(expectedValue1,convertSwitch.convertMonth(1));
       assertEquals(expectedValue2,convertSwitch.convertMonth(8));
    }

    @Test
    public void shouldTakeInAnIntAndConvertToDay() {
        String expectedValue1 = "Sunday";
        String expectedValue2 = "Thursday";

        assertEquals(expectedValue1,convertSwitch.convertDay(1));
        assertEquals(expectedValue2,convertSwitch.convertDay(5));
    }
    @Test(expected=NumberFormatException .class)
    public void shouldGiveAnErrorMessageWhenGivenNotAnIntOrIfIntOutOfRangeForConvertMonth() {
        String expectedValue = "There is an Error, you have entered something that is out of the scope of this code";

        assertEquals(expectedValue,convertSwitch.convertMonth(13));
        assertEquals(expectedValue,convertSwitch.convertMonth(Integer.parseInt("e")));
    }
    @Test(expected=NumberFormatException .class)
    public void shouldGiveAnErrorMessageWhenGivenNotAnIntOrIfIntOutOfRangeForConvertDay() {
        String expectedValue = "There is an Error, you have entered something that is out of the scope of this code";

        assertEquals(expectedValue,convertSwitch.convertDay(13));
        assertEquals(expectedValue,convertSwitch.convertDay(Integer.parseInt("e")));
    }
}