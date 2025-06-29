package org.example.single;

public class TestChocolateBoiler {
    public static void main(String[] args) {
//        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
//
//        chocolateBoiler.fill();
//        chocolateBoiler.boil();
//        chocolateBoiler.drain();


        Singleton singleton = Singleton.INSTANCE;
        singleton.fill();
        singleton.boil();
        singleton.drain();
    }
}
