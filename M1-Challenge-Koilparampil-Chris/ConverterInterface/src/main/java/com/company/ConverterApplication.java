package com.company;

import com.company.interfaces.Converter;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {
        Converter convertIf =new ConverterIf();
        Converter convertSwitch = new ConverterSwitch();
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.println("Enter an Integer for Month: ");
            int convertibleNumber1 = Integer.parseInt(myScanner.nextLine());

            System.out.println("Enter an Integer for Day: ");
            int convertibleNumber2 = Integer.parseInt(myScanner.nextLine());


            System.out.println("The convertIf outputs:");
            System.out.println("this is the Month " + convertIf.convertMonth(convertibleNumber1));
            System.out.println("this is the Day " + convertIf.convertDay(convertibleNumber2));

            System.out.println("The convertSwitch outputs:");
            System.out.println("this is the Month " + convertSwitch.convertMonth(convertibleNumber1));
            System.out.println("this is the Day " + convertSwitch.convertDay(convertibleNumber2));
        }catch(NumberFormatException nFe){
            System.out.println("There is an Error, you have entered something that is out of the scope of this code");
        }
    }
}
