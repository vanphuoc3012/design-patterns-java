package org.example.factorymethod;

public class SportCar implements Vehicle{
    private String type;

    public SportCar(String type) {
        this.type = type;
    }

    @Override
    public void move() {
        System.out.printf("%s, type: %s, move", type, type);
    }
}
