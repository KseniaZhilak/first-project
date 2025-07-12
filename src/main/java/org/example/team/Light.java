package org.example.team;


public class Light {
    String room;

    public Light(String room) {
        this.room = room;
    }

    public void on(){
        System.out.println(room + " Light is on");
    }

    public void off(){
        System.out.println(room + " Light is off");
    }
}
