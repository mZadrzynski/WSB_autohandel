package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.util.*;

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
       // ArrayList<String> carsNames = new ArrayList<String>();
       // for (int i= 0; i < 100; i++)
        //    carsNames.add(String.valueOf(i));
        //Car[] cars = new Car[3];
        ArrayList<String> cars = new ArrayList<String>();
        for (int i = 0; i < 3; i++)
            cars.add(String.valueOf(new Car("car" + i)));

        int carsLength = cars.size();




        //Car[] cars = new Car[3];
       // for (int i = 0; i < 3; i++)
        //    cars[i] = new Car(carsNames.get(i));
        //usuwanie z listy
        //cars.remove(0);




        do {
            time.runGame();
            switch (userSelect.nextInt()) {
                case 1:
                    if (carsLength == 0) {
                        System.out.println("brak aut do zakupu");
                    }
                    for (int i = 0; i < carsLength; i++)
                        System.out.println(cars.get(i));
                    break;
                case 2:
                    try {
                        System.out.println("podaj ktory samochod chcesz kupic");
                        int i= userSelect.nextInt();
                        owner.ownerCars.add(new Car(cars.get(i)));
                        cars.remove(i);
                        carsLength--;
                        //owner.cash = owner.cash -
                        System.out.println(carsLength);
                        //if(owner.cash >= cars) {
                        //owner.cash = owner.cash - cars.get(i, price).carPrice;



                        //cars.add(String.valueOf(new Car("3")));

                        //} else {
                        //System.out.println("nie masz wystarczajaco gotowki by kupic to auto");
                    }
                    catch
                    (Exception e) {
                        System.out.println("cos poszlo nie tak");
                    }
                    break;
                case 3:
                    int i= userSelect.nextInt();
                    owner.ownerCars.remove(i);
                    break;
                case 4:
                    System.out.println("napraw samochod");
                    break;
                case 5:
                    System.out.println("przejrzyj klientow");
                    break;
                case 6:
                    System.out.println("sprzedaj auto");
                    break;
                case 7:
                    System.out.println("kup reklame");
                    break;
                case 8:
                    System.out.println(owner.cash);
                    System.out.println(owner.ownerCars);
                    break;
                case 9:
                    System.out.println("sprawdz historie tranzakci");
                    break;
                case 10:
                    System.out.println("sprawdz historie naprawy pojazdu");
                    break;
                case 11:
                    System.out.println("sprawdz historie i koszty napraw posiadanych pojazdow");
                    break;
            }
        } while (gameOn);
    }
}
