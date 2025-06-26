package org.example.decorator.coffeeShop;

public abstract class Beverage {

    String description = "Unknown Beverage";
    Size size;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();


}
