package org.example.factorymethod;

public class SUVCar implements Vehicle{
    private String type;
    public SUVCar(String type) {
        this.type = type;
    }

    @Override
    public void move() {
        System.out.printf("%s, type: %s, move", type, type);
    }
}
