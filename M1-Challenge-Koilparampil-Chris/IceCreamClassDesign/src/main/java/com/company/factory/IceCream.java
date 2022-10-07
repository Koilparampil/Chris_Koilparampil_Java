package com.company.factory;

import java.util.List;
import java.util.Objects;

public class IceCream {

    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTimeInMinutes;
    private List<String> ingredients;


    public double SimpleProfits(){
        return salePrice-productionCost;
    }


    public double getDiscount(int quantityOfPintsBought){
        double returnVal=0;
        if (quantityOfPintsBought>200){
            returnVal = quantityOfPintsBought*(salePrice*.65);
        }else if(quantityOfPintsBought>100){
            returnVal = quantityOfPintsBought*(salePrice*.75);
        }else if(quantityOfPintsBought>=50){
            returnVal = quantityOfPintsBought*(salePrice*.90);
        }else {returnVal = quantityOfPintsBought*salePrice;}

        return returnVal;
    }

    public int getTrucksNeededForShipment(int quantityOfPintsBought){
        return (int) Math.ceil((double)quantityOfPintsBought/50.0);
    }


    public IceCream(String flavor, double salePrice, double productionCost, int productionTimeInMinutes, List<String> ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTimeInMinutes = productionTimeInMinutes;
        this.ingredients = ingredients;
    }

    public IceCream() {
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTimeInMinutes() {
        return productionTimeInMinutes;
    }

    public void setProductionTimeInMinutes(int productionTimeInMinutes) {
        this.productionTimeInMinutes = productionTimeInMinutes;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salePrice, salePrice) == 0 && Double.compare(iceCream.productionCost, productionCost) == 0 && productionTimeInMinutes == iceCream.productionTimeInMinutes && Objects.equals(flavor, iceCream.flavor) && Objects.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, salePrice, productionCost, productionTimeInMinutes, ingredients);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTimeInMinutes=" + productionTimeInMinutes +
                ", ingredients=" + ingredients +
                '}';
    }
}
