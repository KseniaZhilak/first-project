package org.example.factory;

public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
        name = "NYStyleCheesePizza";
        dough = "Thin";
        sauce = "Marinara Sauce";

        toppings.add("Cheese");
    }
}
