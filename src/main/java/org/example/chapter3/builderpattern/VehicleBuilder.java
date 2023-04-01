package org.example.chapter3.builderpattern;

public final class VehicleBuilder {
    public static Vehicle buildSlowCar() {
        RecordPart engine = new RecordPart();
        StandardPart cabin = new StandardPart();
        return new SlowVehicle(engine, cabin);
    }
}
