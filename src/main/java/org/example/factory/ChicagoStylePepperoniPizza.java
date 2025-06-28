package org.example.factory;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "ChicagoStylePepperoniPizza";
        dough = "Thin";
        sauce = "Tomato Sauce";

        toppings.add("Pepperoni");
    }
}
