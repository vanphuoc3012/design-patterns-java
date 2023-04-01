package org.example.chapter3.abstractfactory;

public class SlowCar implements Vehicle{
    @Override
    public void move() {
        System.out.println("Slow car move");
    }
}
