package com.company;

public class App {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("1 + 1 ="+calc.addition(1,1));
        System.out.println("23 - 52 ="+calc.subtraction(23,52));
        System.out.println("34 * 2 ="+calc.multiplication(34,2));
        System.out.println("12 / 3 ="+calc.division(12,3));
        System.out.println("12 / 7 ="+calc.division(12,7));
        System.out.println("12.0 / 7.0 ="+calc.division(12.0,7.0));
        System.out.println("3.4 + 2.3 ="+calc.addition(3.4,2.3));
        System.out.println("6.7 * 4.4 ="+calc.multiplication(6.7,4.4));
        System.out.println("5.5 - 0.5 ="+calc.subtraction(5.5,0.5));
        System.out.println("10.8/2.2 ="+calc.division(10.8,2.2));
    }
}
