package org.example.decorator.coffeeShop;

public class StarbuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        beverage.setSize(Size.TALL);
        beverage =  new Mocha(beverage);
        beverage =  new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
