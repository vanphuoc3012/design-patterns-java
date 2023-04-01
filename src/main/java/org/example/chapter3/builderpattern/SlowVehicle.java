package org.example.chapter3.builderpattern;

public class SlowVehicle implements Vehicle{
    private Part engine;
    private Part cabin;

    public SlowVehicle(Part engine, Part cabin) {
        this.engine = engine;
        this.cabin = cabin;
    }


    @Override
    public void move() {
        System.out.println("Slow vehicle move");
    }

    @Override
    public void parts() {
        System.out.println("Engine: " + engine.name());
        System.out.println("Cabin: " + cabin.name());
    }
}
