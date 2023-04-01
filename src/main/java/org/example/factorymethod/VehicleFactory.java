package org.example.factorymethod;

public class VehicleFactory {
    public VehicleFactory(){}

    static Vehicle produce(String type) {
        Vehicle vehicle;
        switch (type) {
            case "sport":
                vehicle = new SportCar(type);
                break;
            case "suv":
                vehicle = new SUVCar(type);
                break;
            default:
                throw new IllegalArgumentException("Not supported type");
        }
        return vehicle;
    }
}
