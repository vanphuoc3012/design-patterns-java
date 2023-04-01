package org.example.chapter3.abstractfactory;

public class HeavyTruck implements Vehicle{
    @Override
    public void move() {
        System.out.println("Heavy truck move");
    }
}
