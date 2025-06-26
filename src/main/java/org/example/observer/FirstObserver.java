package org.example.observer;

public class FirstObserver implements Observer {
    private String name;
    private Subject subject;

    public FirstObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String name) {
        this.name = name;
        showName();
    }

    public void showName(){
        System.out.println("First Observer: Hello, " + name + "!");
    }
}
