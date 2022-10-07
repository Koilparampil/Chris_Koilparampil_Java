package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    ConverterIf convertIf;

    @Before
    public void setUp()  {
        convertIf= new ConverterIf();
    }

    @Test
    public void shouldTakeInAnIntAndConvertToMonth() {
        String expectedValue1 = "January";
        String expectedValue2 = "August";

        assertEquals(expectedValue1,convertIf.convertMonth(1));
        assertEquals(expectedValue2,convertIf.convertMonth(8));
    }

    @Test
    public void shouldTakeInAnIntAndConvertToDay() {
        String expectedValue1 = "Sunday";
        String expectedValue2 = "Thursday";

        assertEquals(expectedValue1,convertIf.convertDay(1));
        assertEquals(expectedValue2,convertIf.convertDay(5));
    }

    @Test(expected=NumberFormatException .class)
    public void shouldGiveAnErrorMessageWhenGivenNotAnIntOrIfIntOutOfRangeForConvertMonth() {
        String expectedValue = "There is an Error, you have entered something that is out of the scope of this code";

        assertEquals(expectedValue,convertIf.convertMonth(13));
        assertEquals(expectedValue,convertIf.convertMonth(Integer.parseInt("e")));
    }
    @Test(expected=NumberFormatException .class)
    public void shouldGiveAnErrorMessageWhenGivenNotAnIntOrIfIntOutOfRangeForConvertDay() {
        String expectedValue = "There is an Error, you have entered something that is out of the scope of this code";

        assertEquals(expectedValue,convertIf.convertDay(13));
        assertEquals(expectedValue,convertIf.convertDay(Integer.parseInt("e")));
    }
}