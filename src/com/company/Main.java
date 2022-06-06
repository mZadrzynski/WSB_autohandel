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
        //Car[] cars = new Car[3];
        ArrayList<String> cars = new ArrayList<String>();
        for (int i = 0; i < 3; i++)
            cars.add(String.valueOf(new Car(carsNames.get(i))));

        //Car[] cars = new Car[3];
       // for (int i = 0; i < 3; i++)
        //    cars[i] = new Car(carsNames.get(i));
        //usuwanie z listy
        //cars.remove(0);



        do {
            time.runGame();
            switch (userSelect.nextInt()) {
                case 1:
                    System.out.println(cars.get(0));
                    System.out.println(cars.get(1));
                    System.out.println(cars.get(2));
                    break;
                case 2:
                    System.out.println("podaj ktore auto chcesz kupic");
                   // owner.setCar(cars.set(userSelect.nextInt());
                    break;
                case 3:
                        System.out.println(owner.ownerCars);
                    break;
                case 4:
                    System.out.println("napraw samochod");
                    break;
                case 5:
                    System.out.println("przejrzyj klientow");
                    break;
                case 5:
                    System.out.println("sprzedaj auto");
                    break;
                case 6:
                    System.out.println("kup reklame");
                    break;
                case 7:
                    System.out.println(owner.cash);
                    break;
                case 8:
                    System.out.println("sprawdz historie tranzakci");
                    break;
                case 9:
                    System.out.println("sprawdz historie naprawy pojazdu");
                    break;
                case 10:
                    System.out.println("sprawdz historie i koszty napraw posiadanych pojazdow");
                    break;
            }
        } while (gameOn);
    }
}
