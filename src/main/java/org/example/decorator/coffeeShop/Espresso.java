package org.example.decorator.coffeeShop;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 25;
    }
}
