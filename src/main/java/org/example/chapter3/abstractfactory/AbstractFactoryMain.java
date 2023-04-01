package org.example.chapter3.abstractfactory;

import org.example.chapter3.abstractfactory.factory.AbstractFactory;
import org.example.chapter3.abstractfactory.factory.FactoryProvider;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory carFactory = FactoryProvider.getFactory("car");
        Vehicle fastCar = carFactory.createVehicle("fast");
        fastCar.move();
    }
}
