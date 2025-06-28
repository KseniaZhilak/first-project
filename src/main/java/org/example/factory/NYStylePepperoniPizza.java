package org.example.factory;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NYStylePepperoniPizza";
        dough = "Thin";
        sauce = "Tomato Sauce";

        toppings.add("Pepperoni");
    }
}
