package com.company;
import java.util.Random;
import java.text.DecimalFormat;

public class Car {
    public String producer, color, carSegment;
    public Integer mileage;
    public Double carPrice;
    public Boolean breaks, suspension, engine, gear, body;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    String carProducers[] = {"toyota", "mazda", "bmw", "mercedes", "fiat", "kia", "fiat", "wv", "audi", "ford"};
    String colors[] = {"bialy", "szary", "czarny", "czerwony", "rozowy", "niebieski", "granatowy", "pomaranczowy", "zielony", "zolty"};
    String carSegments[] = {"A", "B", "C", "D", "S", "VAN"};
    String vanProducers[] = {"iveco", "fiatVan", "mercedesVan", "wvVan", "fordVan"};



    public Car (String carName) {
        Random r = new Random();
        carSegment = carSegments[r.nextInt(0, 4)];
        producer = vanProducers[r.nextInt(0, 4)];
        producer = carProducers[r.nextInt(0, 9)];
        color = colors[r.nextInt(0, 9)];
        mileage = r.nextInt(10000, 500000);
        if (r.nextInt(0,4) == 0) {
            breaks = r.nextBoolean();
            suspension = r.nextBoolean();
            engine = r.nextBoolean();
            gear = true;
            body = true;
        } else if (r.nextInt(0,4) == 1) {
            breaks = true;
            suspension = true;
            engine = true;
            gear = r.nextBoolean();
            body = r.nextBoolean();
        } else {
            breaks = true;
            suspension = true;
            engine = true;
            gear = true;
            body = true;
        }
        carPrice = 750000000.0 / mileage;
        if (suspension || body && gear) {
            carPrice *= 1.6;
        }
        if (producer == carProducers[2] || producer == carProducers[3]) {
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
                    ", price=" +  df.format(carPrice*0.8) +
                    ", breaks=" + breaks +
                    ", suspension=" + suspension +
                    ", engine=" + engine +
                    ", gear=" + gear +
                    ", body=" + body;
        }
}


