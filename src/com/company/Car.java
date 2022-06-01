package com.company;
import java.util.Random;
import java.text.DecimalFormat;

public class Car {
    public String producer, color, carSegment;
    public Integer mileage;
    public Double carPrice;
    public Boolean breaks, suspension, engine, gear, body;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    String producers[] = {"toyota", "mazda", "bmw", "mercedes", "fiat", "kia", "fiat", "wv", "audi", "ford"};
    String colors[] = {"bialy", "szary", "czarny", "czerwony", "rozowy", "niebieski", "granatowy", "pomaranczowy", "zielony", "zolty"};
    String carSegments[] = {"A", "B", "C", "D", "S", "dostawczy"};


    public Car(String carsName) {
        Random r = new Random();
        producer = producers[r.nextInt(0, 9)];
        color = colors[r.nextInt(0, 9)];
        carSegment = carSegments[r.nextInt(0, 4)];
        mileage = r.nextInt(10000, 500000);
        breaks = r.nextBoolean();
        suspension = r.nextBoolean();
        engine = r.nextBoolean();
        gear = r.nextBoolean();
        body = r.nextBoolean();
        carPrice = 500000000.0 / mileage;
        if (suspension || body && gear) {
            carPrice *= 1.6;
        }
        if (producer == producers[2] || producer == producers[3]) {
            carPrice *= 2.0;
        }
        if (carSegment == carSegments[4]) {
            carPrice *= 2.5;
        }
    }

        @Override
        public String toString () {
            return "Car " +
                    "producer='" + producer + '\'' +
                    ", color='" + color + '\'' +
                    ", carSegment='" + carSegment + '\'' +
                    ", mileage=" + mileage +
                    ", price=" +  df.format(carPrice) +
                    ", breaks=" + breaks +
                    ", suspension=" + suspension +
                    ", engine=" + engine +
                    ", gear=" + gear +
                    ", body=" + body;
        }
    }


