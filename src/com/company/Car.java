package com.company;
import java.util.*;
import java.text.DecimalFormat;

public class Car {
    public String producer, color, carSegment;
    public Integer mileage;
    public Double carPrice, repAndWashCost;
    public Boolean breaks, suspension, engine, gear, body;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public ArrayList<String> carRepairHistory = new ArrayList<>();

    String carProducers[] = {"toyota", "mazda", "bmw", "mercedes", "fiat", "ssang", "volvo", "wv", "polonez", "ford"};
    String colors[] = {"bialy", "szary", "czarny", "czerwony", "rozowy", "niebieski", "granatowy", "pomaranczowy", "zielony", "zolty"};
    String carSegments[] = {"A", "B", "C", "D", "S", "VAN"};
    String vanProducers[] = {"iveco", "fiatVan", "mercedesVan", "wvVan", "fordVan"};



    public Car (String carName) {
        Random r = new Random();
        repAndWashCost = 0.0;
        carSegment = carSegments[r.nextInt(1, 5)];
        producer = vanProducers[r.nextInt(1, 5)];
        producer = carProducers[r.nextInt(1, 10)];
        color = colors[r.nextInt(1, 10)];
        mileage = r.nextInt(100, 350000);
        if (r.nextInt(0,3) == 0) {
            breaks = r.nextBoolean();
            suspension = r.nextBoolean();
            engine = r.nextBoolean();
            gear = true;
            body = true;
        } else if (r.nextInt(0,3) == 1) {
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
        carPrice = 3000.0 + 1250000000.0 / (mileage * r.nextDouble(0.3,4.5));
        if (engine || (body && gear)) {
            carPrice *= 1.5;
        }
        if (engine && gear && suspension) {
            carPrice *= 2.0;
        }
        if (producer == carProducers[3] || producer == carProducers[4]) {
            carPrice *= 2.0;
        }
        if (producer == carProducers[5] || producer == carProducers[6] || producer == carProducers[9] ) {
            carPrice *= 0.3;
        }
        if (carSegment == carSegments[5]) {
            carPrice *= 3.5;
        }
        if (this.carPrice >= 150000.0) {
            this.carPrice = 150000.0;
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
                        ", uszkodzenia: brak ";

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
                        ", karoseria: " + body;
            }

        }

}


