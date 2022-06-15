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


    String carProducers[] = {"toyota", "mazda", "bmw", "mercedes", "fiat", "kia", "fiat", "wv", "audi", "ford"};
    String colors[] = {"bialy", "szary", "czarny", "czerwony", "rozowy", "niebieski", "granatowy", "pomaranczowy", "zielony", "zolty"};
    String carSegments[] = {"A", "B", "C", "D", "S", "VAN"};
    String vanProducers[] = {"iveco", "fiatVan", "mercedesVan", "wvVan", "fordVan"};



    public Car (String carName) {
        Random r = new Random();
        repAndWashCost = 0.0;
        carSegment = carSegments[r.nextInt(0, 4)];
        producer = vanProducers[r.nextInt(0, 4)];
        producer = carProducers[r.nextInt(0, 9)];
        color = colors[r.nextInt(0, 9)];
        mileage = r.nextInt(10000, 500000);
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
        carPrice = 1250000000.0 / mileage;
        if (suspension || body && gear) {
            carPrice *= 1.9;
        }
        if (producer == carProducers[2] || producer == carProducers[3]) {
            carPrice *= 3.0;
        }
        if (carSegment == carSegments[4]) {
            carPrice *= 2.8;
        }
    }
        @Override
        public String toString () {
            if (breaks && suspension && engine && gear && body) {
                return producer +
                        " klasy: " + carSegment +
                        ", color: " + color +
                        ", przebieg: " + mileage +
                        ", cena: " + df.format(carPrice * 0.8) +
                        ", uszkodzenia: brak ";

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
                        ", karoseria: " + body;
            }

        }

}


