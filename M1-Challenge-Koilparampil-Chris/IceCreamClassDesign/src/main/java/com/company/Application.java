package com.company;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> ingredientList = new ArrayList<String>();
        ingredientList.add("Mint");
        ingredientList.add("Chocolate");
        ingredientList.add("Cream");
        ingredientList.add("Sugar");
        ingredientList.add("Salt");
        ingredientList.add("Vanilla Extract");
        ingredientList.add("Food Coloring");
        com.company.factory.IceCream iceCreamF =
                new com.company.factory.IceCream("Mint Choco Chip", 8.75, 5.45, 75, ingredientList);
        com.company.pointofsale.IceCream iceCreamPOS =
                new com.company.pointofsale.IceCream("Mint Choco Chip", 12.87, 56);

    }
}
