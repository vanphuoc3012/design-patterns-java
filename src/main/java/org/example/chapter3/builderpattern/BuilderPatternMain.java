package org.example.chapter3.builderpattern;

public class BuilderPatternMain {
    public static void main(String[] args) {
        System.out.println("Slow car");
        Vehicle slowCar = VehicleBuilder.buildSlowCar();
        slowCar.move();;
        slowCar.parts();

        System.out.println("Fast car");
        FastCar fastCar = new FastCar.Builder()
                .addCabin(new StandardPart())
                .addEngine(new RecordPart())
                .build();
        fastCar.move();
        fastCar.parts();

    }
}
