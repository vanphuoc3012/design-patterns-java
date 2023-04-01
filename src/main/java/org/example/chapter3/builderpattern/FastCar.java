package org.example.chapter3.builderpattern;

public class FastCar implements Vehicle{
    private Part engine;
    private Part cabin;

    public FastCar(Part engine, Part cabin) {
        this.engine = engine;
        this.cabin = cabin;
    }

    public static class Builder {
        private Part engine;
        private Part cabin;

        public Builder() {
        }

        Builder addEngine(Part engine) {
            this.engine = engine;
            return this;
        }
        Builder addCabin(Part cabin) {
            this.cabin = cabin;
            return this;
        }

        FastCar build() {
            return new FastCar(engine, cabin);
        }
    }

    @Override
    public void move() {
        System.out.println("Fast car move");
    }

    @Override
    public void parts() {
        System.out.println("Engine: " + engine.name());
        System.out.println("Cabin: " + cabin.name());
    }

}
