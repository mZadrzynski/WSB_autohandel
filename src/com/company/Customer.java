package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Customer {
    public String name, producer1, producer2;
    public Double customerCash;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public Boolean ifVan;

    String names[] = {"Janusz", "Grazyna", "Json", "Zenon", "Marcin", "Roman", "Leon", "Janina", "Elbieta", "Krzysztof"};
    String producers[] = {"toyota", "mazda", "bmw", "mercedes", "fiat", "kia", "fiat", "wv", "audi", "ford"};

    public Customer() {
        Random r = new Random();
        name = names[r.nextInt(0, 9)];
        customerCash = r.nextDouble(5000, 200000);
        producer1 = producers[r.nextInt(0, 9)];
        producer2 = producers[r.nextInt(0,9)];
        if (producer1.equals(producer2)) {
            producer1 = producers[r.nextInt(0, 9)];
            producer2 = producers[r.nextInt(0,9)];
        }
        ifVan = r.nextBoolean();
    }

    @Override
    public String toString() {
        return "Klient: '" + name + '\'' +
                ", gotowka: " + df.format(customerCash) +
                " marka: " + producer1  +
                " lub " + producer2  +
                ", zainteresowany Vanem: " + ifVan;
    }
}
