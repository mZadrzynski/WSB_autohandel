package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import javax.sound.midi.Soundbank;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        final DecimalFormat df = new DecimalFormat("0.00");
        Time time = new Time();
        Scanner userSelect = new Scanner(System.in);
        Boolean gameOn = true;
        Random r = new Random();
        Owner owner = new Owner();



        ArrayList<Car> cars = new ArrayList();
        for (int i = 0; i < 10; i++) {
            cars.add(new Car("Car" +String.valueOf(i)));
        }
        int carsLength = cars.size();

        ArrayList<Customer> customers = new ArrayList();
        for (int i = 0; i < 2; i++) {
            customers.add(new Customer());
        }


        do {
            if(owner.cash > 70000.0) {
                gameOn = false;
                time.endGame();
            }
            if(owner.cash < 0.0) {
                gameOn = false;
                time.loseGame();
            }
            time.runGame();
            switch (userSelect.nextInt()) {
                case 1:
                    if (carsLength == 0) {
                        System.out.println("brak aut do zakupu");
                    }
                    for (int i = 0; i < carsLength; i++)
                        System.out.println(i + " - " + cars.get(i));
                    break;
                case 2:
                    try {
                        System.out.println("podaj ktory samochod chcesz kupic");
                        int i = userSelect.nextInt();
                            if (owner.cash > cars.get(i).carPrice*0.8){
                                owner.cash = owner.cash - cars.get(i).carPrice*0.8;
                                owner.ownerCars.add(cars.get(i));
                                cars.remove(i);
                                cars.add(new Car(String.valueOf(carsLength + 1)));
                                time.week+=1;
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
                    try {
                        for (int i = 0; i < customers.size(); i++) {
                            for (int j = 0; j < owner.ownerCars.size(); j++) {
                                if (customers.get(i).producer1.equals(owner.ownerCars.get(j).producer) || customers.get(i).producer2.equals(owner.ownerCars.get(j).producer)) {
                                    System.out.println("masz auto na sprzedaz");
                                    if (customers.get(i).customerCash > owner.ownerCars.get(j).carPrice) {
                                        System.out.println("kupiec " + customers.get(i).name + " chce kupic " + owner.ownerCars.get(j).producer
                                                + " za cene " + df.format(owner.ownerCars.get(j).carPrice));
                                        System.out.println("wpisz 1 jesli chcesz sprzedać");
                                        if (userSelect.nextInt() == 1) {
                                            time.sell();
                                            owner.cash = owner.cash + owner.ownerCars.get(j).carPrice*0.98 - 200.0;
                                            customers.remove(i);
                                            owner.ownerCars.remove(j);
                                            customers.add(new Customer());
                                            customers.add(new Customer());
                                            time.week+=1;
                                        }
                                    }
                                }
                                //j++;
                            }
                        }

                    } catch (Exception e){
                        time.error();
                }
                    break;
                case 7:
                    time.advertise();
                    try {
                        switch (userSelect.nextInt()) {
                            case 1:
                                owner.cash = owner.cash - 3000;
                                for (int i = 0; i < r.nextInt(1,5); i++) {
                                    customers.add(new Customer());
                                }
                                time.week+=1;
                                break;
                            case 2:
                                owner.cash = owner.cash - 1000;
                                customers.add(new Customer());
                                time.week+=1;
                                break;
                        }
                    } catch (Exception e) {
                        time.error();
                    }
                    break;
                case 8:
                    System.out.println(df.format(owner.cash));
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
