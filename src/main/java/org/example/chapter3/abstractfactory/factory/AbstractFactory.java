package org.example.chapter3.abstractfactory.factory;

import org.example.chapter3.abstractfactory.Vehicle;

public abstract class AbstractFactory {
    public abstract Vehicle createVehicle(String type);
}
