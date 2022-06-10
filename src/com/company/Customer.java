package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Customer {
    public String name, producer1, producer2;
    public Double customerCash;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    String names[] = {"Janusz", "Grazyna", "Json", "Zenon", "Marcin", "Roman", "Leon", "Janina", "Elbieta", "Krzysztof"};
    String producers[] = {"toyota", "mazda", "bmw", "mercedes", "fiat", "kia", "fiat", "wv", "audi", "ford"};

    public Customer() {
        Random r = new Random();
        name = names[r.nextInt(0, 9)];
        customerCash = r.nextDouble(3000, 80000);
        producer1 = producers[r.nextInt(0, 9)];
        producer2 = producers[r.nextInt(0,9)];

    }

    @Override
    public String toString() {
        return "Customer{" +
                "imie: '" + name + '\'' +
                ", gotowka: " + df.format(customerCash) +
                "  marka 1: '" + producer1 + '\'' +
                "  marka 2: '" + producer2 + '\'' +
                '}';
    }
}
