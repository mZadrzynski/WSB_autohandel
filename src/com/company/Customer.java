package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Customer {
    public String name;
    public Double customerCash;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    String names[] = {"Janusz", "Grazyna", "Json", "Zenon", "Marcin", "Roman", "Leon", "Janina", "Elbieta", "Krzysztof"};

    public Customer() {
        Random r = new Random();
        name = names[r.nextInt(0, 9)];
        customerCash = r.nextDouble(3000, 80000);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name= '" + name + '\'' +
                ", customerCash= " + df.format(customerCash) +
                '}';
    }
}
