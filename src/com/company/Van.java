package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Van extends Car{
    public Integer vanCapacity;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Van(String carName) {
        super(carName);
        Random r = new Random();
        carSegment = carSegments[5];
        producer = vanProducers[r.nextInt(1, 5)];
        vanCapacity = r.nextInt(600, 1600);
        carPrice = 12000.0 + (900000.0*vanCapacity) / (mileage * r.nextDouble(0.3,2.5));
        if (this.carPrice >= 170000.0) {
            this.carPrice = 170000.0;
        }

    }

    @Override
    public String toString () {
        if (breaks && suspension && engine && gear && body) {
            return producer +
                    " klasy: " + carSegment +
                    ", color: " + color +
                    ", przebieg: " + mileage +
                    ", cena: " + df.format(carPrice) +
                    ", uszkodzenia: brak" +
                    ", pojemnosc: " + vanCapacity + "kg";

        } else {
            return  producer +
                    " klasy: " + carSegment +
                    ", color: " + color +
                    ", przebieg: " + mileage +
                    ", cena: " + df.format(carPrice) +
                    ", hamulce: " + breaks +
                    ", zawieszenie: " + suspension +
                    ", silnik: " + engine +
                    ", skrzynia biegow: " + gear +
                    ", karoseria: " + body +
                    ", pojemnosc: " + vanCapacity + "kg";
        }
    }
}

