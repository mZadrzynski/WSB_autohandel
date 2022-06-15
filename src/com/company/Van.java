package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Van extends Car{
    Integer vanCapacity;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Van(String carName) {
        super(carName);
        Random r = new Random();
        carSegment = carSegments[5];
        producer = vanProducers[r.nextInt(0, 4)];
        vanCapacity = r.nextInt(600, 1600);
        carPrice = (750000.0*vanCapacity) / mileage;
    }

    @Override
    public String toString () {
        if (breaks && suspension && engine && gear && body) {
            return producer +
                    " klasy: " + carSegment +
                    ", color: " + color +
                    ", przebieg: " + mileage +
                    ", cena: " + df.format(carPrice * 0.8) +
                    ", uszkodzenia: brak " +
                    ", pojemnosc: " + vanCapacity + "kg";

        } else {
            return  producer +
                    " klasy: " + carSegment +
                    ", color: " + color +
                    ", przebieg: " + mileage +
                    ", cena: " + df.format(carPrice * 0.8) +
                    ", hamulce: " + breaks +
                    ", zawieszenie: " + suspension +
                    ", silnik: " + engine +
                    ", skrzynia biegow: " + gear +
                    ", karoseria: " + body +
                    ", pojemnosc: " + vanCapacity + "kg";
        }
    }
}

