package org.example.chapter3.abstractfactory;

public class LightTruck implements Vehicle{
    @Override
    public void move() {
        System.out.println("Light truck move");
    }
}
