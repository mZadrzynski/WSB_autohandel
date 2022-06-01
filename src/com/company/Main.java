package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random rand = new Random();
        int x = rand.nextInt(3);


       Owner owner = new Owner();

        String[] carsNames = {"car1","car2","car3"};
        Car[] cars = new Car[3];
        for (int i = 0; i < 2; i++)
            cars[i] = new Car(carsNames[i]);

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        do {

        } while (owner.cash > 300000);

    }
}
