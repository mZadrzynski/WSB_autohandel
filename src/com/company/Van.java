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
        return "Van " +
                "producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", carSegment='" + carSegment + '\'' +
                ", mileage=" + mileage +
                ", price=" +  df.format(carPrice*0.8) +
                ", breaks=" + breaks +
                ", suspension=" + suspension +
                ", engine=" + engine +
                ", gear=" + gear +
                ", body=" + body +
                ", capacity=" + vanCapacity + "kg";

    }
}

