package com.company;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Time time = new Time();
        Random rand = new Random();
        Scanner userSelect = new Scanner(System.in);
        Integer carList;
        Boolean gameOn = true;


        Owner owner = new Owner();

        //String[] carsNames = {};
        ArrayList<String> carsNames = new ArrayList<String>();
        for (int i= 0; i < 100; i++)
            carsNames.add(String.valueOf(i));
        Car[] cars = new Car[3];
        for (int i = 0; i < 3; i++)
            cars[i] = new Car(carsNames.get(i));



        do {
            time.runGame();
            switch (userSelect.nextInt()) {
                case 1:
                    System.out.println(cars[0]);
                    System.out.println(cars[1]);
                    System.out.println(cars[2]);
                    break;
                case 2:
                    System.out.println("podaj ktore auto chcesz kupic");
                    owner.setCar(cars[userSelect.nextInt()]);

                    break;
                case 3:
                        System.out.println(owner.car);
                        System.out.println(owner.ownerCars);
                        System.out.println(owner.cash);
                        System.out.println(carsNames);
                    break;
            }
        } while (gameOn);
    }
}
