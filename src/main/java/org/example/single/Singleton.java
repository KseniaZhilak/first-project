package org.example.single;

public enum Singleton {

    INSTANCE(true, false);

    private boolean empty;
    private boolean boiled;

    Singleton(boolean b, boolean b1) {
        empty = b;
        boiled = b1;
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
