package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;
    @Before
    public void setUp(){
        calc = new Calculator();
    }
    @Test
    public void shouldAddTwoIntsTogether(){
        int eValue1 =5;
        int eValue2 = 1290;

        assertEquals(eValue1,calc.addition(2,3));
        assertEquals(eValue2,calc.addition(1039,251));
    }
    @Test
    public void shouldSubtractTwoIntsFromEachOther(){
        int eValue1 =12;
        int eValue2 = -73;

        assertEquals(eValue1,calc.subtraction(35,23));
        assertEquals(eValue2,calc.subtraction(28,101));
    }
    @Test
    public void shouldMultiplyTwoIntsFromEachOther(){
        int eValue1 =63;
        int eValue2 = 0;
        int eValue3 = -42;
        assertEquals(eValue1,calc.multiplication(9,7));
        assertEquals(eValue2,calc.multiplication(4,0));
        assertEquals(eValue3,calc.multiplication(7,-6));
    }
    @Test
    public void shouldDivideTwoIntsFromEachOther(){
        int eValue1 =1;
        int eValue2 = 2;
        int eValue3 = 12;
        assertEquals(eValue1,calc.division(9,7));
        assertEquals(eValue2,calc.division(4,2));
        assertEquals(eValue3,calc.division(72,6));
    }
    @Test(expected= IllegalArgumentException.class)
    public void shouldNotDivideByZero(){


        calc.division(9,0);
        calc.division(4,0);
        calc.division(72,0);
    }
    @Test
    public void shouldAddTwoDoublesTogether(){
        double eValue1 =5.5d;
        double eValue2 = 12.90d;

        assertEquals(eValue1,calc.addition(2.2d,3.3d),0);
        assertEquals(eValue2,calc.addition(10.39d,2.51d),0);
    }
    @Test
    public void shouldSubtractTwoDoublesFromEachOther(){
        double eValue1 =1.2;
        double eValue2 = -7.3;

        assertEquals(eValue1,calc.subtraction(3.5,2.3),0.00000001);
        assertEquals(eValue2,calc.subtraction(2.8,10.1),0.00000001);
    }
    @Test
    public void shouldMultiplyTwoDoublesFromEachOther(){
        double eValue1 =6.3;
        double eValue2 = 0;
        double eValue3 = -4.2;
        assertEquals(eValue1,calc.multiplication(9,0.7),0.00000001);
        assertEquals(eValue2,calc.multiplication(4.85,0),0.00000001);
        assertEquals(eValue3,calc.multiplication(0.7,-6),0.00000001);
    }
    @Test
    public void shouldDivideTwoDoublesFromEachOther(){
        double eValue1=1.7142857142857;
        double eValue2= 4.9090909090909;
        double eValue3= 11;
        assertEquals(eValue1,calc.division(12.0,7.0),0.00000001);
        assertEquals(eValue2,calc.division(10.8,2.2),0.00000001);
        assertEquals(eValue3,calc.division(5.5,0.5),0.00000001);
    }
    @Test(expected= IllegalArgumentException.class)
    public void shouldNotDivideByZeroEvenForDoubles(){


        calc.division(9d,0d);
        calc.division(4d,0d);
        calc.division(72d,0d);
    }
}