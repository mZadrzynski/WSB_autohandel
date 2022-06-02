package com.company;
import javax.sound.midi.Soundbank;
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

        String[] carsNames = {"1", "2", "3"};
        Car[] cars = new Car[3];
        for (int i = 0; i < 3; i++)
            cars[i] = new Car(carsNames[i]);

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
                        System.out.println(owner.cash);
                    break;
            }
        } while (gameOn);
    }
}
