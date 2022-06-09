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
        Boolean gameOn = true;


        Owner owner = new Owner();



        ArrayList<Car> cars = new ArrayList();
        for (int i = 0; i < 3; i++) {
            cars.add(new Car("Car" +String.valueOf(i)));
        }
        int carsLength = cars.size();

        ArrayList<Customer> customers = new ArrayList();
        for (int i = 0; i < 2; i++) {
            customers.add(new Customer());
        }


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
                        int i = userSelect.nextInt();
                            if (owner.cash > cars.get(i).carPrice){
                                owner.cash = owner.cash - cars.get(i).carPrice;
                                owner.ownerCars.add(cars.get(i));
                                cars.remove(i);
                                cars.add(new Car(String.valueOf(carsLength + 1)));
                            } else {
                                System.out.println("nie masz wystarczajaco gotowki by kupic to auto");
                    }}
                    catch (Exception e) {
                        time.error();
                    }
                    break;
                case 3:
                    for (int i = 0; i < owner.ownerCars.size(); i++)
                        System.out.println(owner.ownerCars.get(i));
                    break;
                case 4:
                    try {
                        time.carRepairInfo();
                        switch (userSelect.nextInt()) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }

                    } catch (Exception e) {
                        time.error();
                    }
                    break;
                case 5:
                    for (int i = 0; i < customers.size(); i++)
                        System.out.println(customers.get(i));
                    break;
                case 6:
                    System.out.println("sprzedaj auto");
                    break;
                case 7:
                    time.advertise();
                    try {
                        switch (userSelect.nextInt()) {
                            case 1:
                                owner.cash = owner.cash - 3000;
                                Random r = new Random();
                                for (int i = 0; i < r.nextInt(1,5); i++) {
                                    customers.add(new Customer());
                                }
                                break;
                            case 2:
                                owner.cash = owner.cash - 1000;
                                customers.add(new Customer());
                                break;
                        }
                    } catch (Exception e) {
                        time.error();
                    }
                    break;
                case 8:
                    System.out.println(owner.cash);
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
