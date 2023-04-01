package org.example.chapter3.abstractfactory.factory;

import org.example.chapter3.abstractfactory.factory.AbstractFactory;
import org.example.chapter3.abstractfactory.factory.CarFactory;
import org.example.chapter3.abstractfactory.factory.TruckFactory;

public final class FactoryProvider {
    private FactoryProvider(){}

    public static AbstractFactory getFactory(String factoryType) {
        AbstractFactory factory;
        switch (factoryType) {
            case "car":
                factory = new CarFactory();
                break;
            case "truck":
                factory = new TruckFactory();
                break;
            default:
                throw new IllegalArgumentException("Not supported factory factoryType");
        }
        return factory;
    }
}
