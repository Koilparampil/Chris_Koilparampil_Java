package com.company.pointofsale;

import java.util.Objects;

public class IceCream {

    private String flavor;
    private double price;
    private int quantityOfPints;



    public double getDiscount(int quantityOfPintsBought){
        double returnVal=0;
        if (quantityOfPintsBought>20){
            returnVal = quantityOfPintsBought*(price*.65);
        }else if(quantityOfPintsBought>10){
            returnVal = quantityOfPintsBought*(price*.75);
        }else if(quantityOfPintsBought>=5){
            returnVal = quantityOfPintsBought*(price*.90);
        }else {returnVal = quantityOfPintsBought*price;}

        return returnVal;
    }

    public void updateQuantityOfPintsAsBought(int quantityOfPintsBought){
        this.quantityOfPints=this.quantityOfPints-quantityOfPintsBought;
    }

    public double priceForCreditCard(){
        return price+(price*0.03);
    }





    public IceCream(String flavor, double price, int quantityOfPints) {
        this.flavor = flavor;
        this.price = price;
        this.quantityOfPints = quantityOfPints;
    }

    public IceCream() {
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOfPints() {
        return quantityOfPints;
    }

    public void setQuantityOfPints(int quantity) {
        this.quantityOfPints = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price, price) == 0 && quantityOfPints == iceCream.quantityOfPints && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, price, quantityOfPints);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantityOfPints=" + quantityOfPints +
                '}';
    }
}
