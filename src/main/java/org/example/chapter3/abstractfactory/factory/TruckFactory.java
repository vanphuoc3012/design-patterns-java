package org.example.chapter3.abstractfactory.factory;

import org.example.chapter3.abstractfactory.HeavyTruck;
import org.example.chapter3.abstractfactory.LightTruck;
import org.example.chapter3.abstractfactory.Vehicle;
import org.example.chapter3.abstractfactory.factory.AbstractFactory;

public class TruckFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle(String truckType) {
        Vehicle truck;
        switch (truckType) {
            case "heavy":
                truck = new HeavyTruck();
                break;
            case "light":
                truck = new LightTruck();
                break;
            default:
                throw new IllegalArgumentException("Truck type not support");
        }
        return truck;
    }
}
