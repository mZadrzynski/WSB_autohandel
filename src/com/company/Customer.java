package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Customer {
    public String name, producer1, producer2;
    public Double customerCash;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public Boolean ifVan;

    String names[] = {"Janusz", "Grazyna", "Json", "Zenon", "Marcin", "Roman", "Leon", "Janina", "Elbieta", "Krzysztof"};
    String producers[] = {"toyota", "mazda", "bmw", "mercedes", "fiat", "ssang", "volvo", "wv", "polonez", "ford"};

    public Customer() {
        Random r = new Random();
        name = names[r.nextInt(1, 10)];
        if (r.nextInt(0,10) == 1) {
            customerCash = r.nextDouble(150000, 200000);
        } else if (r.nextInt(0,4) == 1) {
            customerCash = r.nextDouble(50000, 150000);
        } else {
            customerCash = r.nextDouble(5000, 50000);
        }
        producer1 = producers[r.nextInt(1, 10)];
        producer2 = producers[r.nextInt(1,10)];
        if (producer1.equals(producer2)) {
            producer1 = producers[r.nextInt(1, 10)];
            producer2 = producers[r.nextInt(1,10)];
        }
        if (r.nextInt(0,8) == 0) {
            ifVan = true;
        } else {
            ifVan = false;
        }
    }

    @Override
    public String toString() {
        return  name +
                ", gotowka: " + df.format(customerCash) +
                " marka: " + producer1  +
                " lub " + producer2  +
                ", zainteresowany vanem: " + ifVan;
    }
}
