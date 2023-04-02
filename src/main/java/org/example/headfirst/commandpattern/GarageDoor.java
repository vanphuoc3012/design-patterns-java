package org.example.headfirst.commandpattern;

public class GarageDoor {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println("Garage door at: " + location + " is up");
    }

    public void down() {
        System.out.println("Garage door at: " + location + " is down");
    }
}
