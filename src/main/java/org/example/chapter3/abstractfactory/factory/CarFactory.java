package org.example.chapter3.abstractfactory.factory;

import org.example.chapter3.abstractfactory.FastCar;
import org.example.chapter3.abstractfactory.SlowCar;
import org.example.chapter3.abstractfactory.Vehicle;
import org.example.chapter3.abstractfactory.factory.AbstractFactory;

public class CarFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle(String carType) {
        Vehicle car;
        switch (carType) {
            case "fast":
                car = new FastCar();
                break;
            case "slow":
                car = new SlowCar();
                break;
            default:
                throw new IllegalArgumentException("Car type not support");

        }
        return car;
    }
}
