package com.company;

public class Calculator {
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){

        return a-b;
    }
    public static int multiplication(int a, int b){

        return a*b;
    }
    public static int division(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Cannot Divide by Zero");
        }
        return a/b;
    }
    public static double addition(double a, double b){
        return a+b;
    }
    public static double subtraction(double a, double b){

        return a-b;
    }
    public static double multiplication(double a, double b){

        return a*b;
    }
    public static double division(double a, double b) {
        if(b==0){
            throw new IllegalArgumentException("Cannot Divide by Zero");
        }
        return a/b;
    }
}
