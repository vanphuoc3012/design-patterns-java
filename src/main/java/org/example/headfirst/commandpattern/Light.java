package org.example.headfirst.commandpattern;

public class Light {
    String location;
    int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        System.out.println(location + "light is on");
    }

    public void off() {
        level = 0;
        System.out.println(location + "Light is off");
    }

    public int getLevel() {
        return level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
