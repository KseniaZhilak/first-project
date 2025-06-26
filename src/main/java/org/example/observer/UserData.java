package org.example.observer;

import java.util.ArrayList;

public class UserData implements Subject{
    private ArrayList<Observer> observers;
    private String name;

    public UserData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(name);
        }
    }

    public void nameChanged(){
        notifyObservers();
    }

    public void setName(String name) {
        this.name = name;
        nameChanged();
    }
}
