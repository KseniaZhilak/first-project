package org.example.decorator.coffeeShop;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost =  beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += 1;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 3;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 4;
        }
        return cost;
    }

}
