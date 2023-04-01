package org.example.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        System.out.println("Factory method");
        String type = "sport";
        Vehicle produce = VehicleFactory.produce(type);
        produce.move();
    }
}
