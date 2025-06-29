package org.example.single;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

   // private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    private static class InstanceHolder{
        private static final ChocolateBoiler INSTANCE = new ChocolateBoiler();
    }

    public static ChocolateBoiler getInstance() {
        /*if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;*/
        return InstanceHolder.INSTANCE;
    }

    public void fill() {
       if (isEmpty()) {
           empty = false;
           boiled = false;
           System.out.println("Chocolate boiler is not empty");
       }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("Chocolate boiler is boiled");
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("Chocolate boiler is empty");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
