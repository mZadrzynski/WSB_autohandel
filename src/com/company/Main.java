package com.company;

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
            if (r.nextInt(0, 8) == 0) {
                cars.add(new Van("Van" + String.valueOf(i)));
            } else {
                cars.add(new Car("Car" + String.valueOf(i)));
            }
        }

        int carsLength = cars.size();

        ArrayList<Customer> customers = new ArrayList();
        for (int i = 0; i < 2; i++) {
            customers.add(new Customer());
        }

        ArrayList<String> transactionHistory = new ArrayList();


        do {

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
                        if (owner.cash > cars.get(i).carPrice) {
                            transactionHistory.add("tura " + time.week + " ZAKUPIONY "
                                    + cars.get(i).producer +" klasy: "+ cars.get(i).carSegment
                                    +", o przebiegu: " + cars.get(i).mileage + " za cene: " + df.format(cars.get(i).carPrice));
                            owner.cash = owner.cash - cars.get(i).carPrice - 200.0;
                            cars.get(i).carPrice *= (r.nextDouble(1.1,1.5));
                            cars.get(i).repAndWashCost += 200.0;
                            owner.ownerCars.add(cars.get(i));
                            System.out.println("brawo kupiles " + cars.get(i).producer);
                            System.out.println("koszty mycia aucia wynosi 200");
                            cars.remove(i);
                            cars.add(new Car(String.valueOf(carsLength + 1)));
                            time.week+=1;
                        } else {
                            System.out.println("nie masz wystarczajaco gotowki by kupic to auto");
                        }
                    } catch (Exception e) {
                        time.error();
                    }
                    break;
                case 3:
                    for (int i = 0; i < owner.ownerCars.size(); i++)
                        System.out.println(i + " - " + owner.ownerCars.get(i));
                    break;
                case 4:
                    try {
                        time.carMechanicsList();
                        owner.CarMechanics();
                        time.carRepairInfo();
                        switch (userSelect.nextInt()) {
                            case 1:
                                System.out.println("podaj numer auta w ktorym chcesz naprawic hamulce");
                                owner.breaksRepair();
                                owner.turboFail();
                                time.week+=1;
                                break;
                            case 2:
                                System.out.println("podaj numer auta w ktorym chcesz naprawic zawieszneie");
                                owner.suspensionRepair();
                                owner.turboFail();
                                time.week+=1;
                                break;
                            case 3:
                                System.out.println("podaj numer auta w ktorym chcesz naprawic silnik");
                                owner.engineRepair();
                                owner.turboFail();
                                time.week+=1;
                                break;
                            case 4:
                                System.out.println("podaj numer auta w ktorym chcesz naprawic skrzynie");
                                owner.gearRepair();
                                owner.turboFail();
                                time.week+=1;
                                break;
                            case 5:
                                System.out.println("podaj numer auta w ktorym chcesz naprawic karoserie");
                                owner.bodyRepair();
                                owner.turboFail();
                                time.week+=1;
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
                                if (customers.get(i).producer1.equals(owner.ownerCars.get(j).producer)
                                        || customers.get(i).producer2.equals(owner.ownerCars.get(j).producer)
                                        || (owner.ownerCars.get(j).carSegment.equals("VAN") && customers.get(i).ifVan)) {
                                    if (owner.ownerCars.get(j).gear == true
                                            && owner.ownerCars.get(j).engine == true
                                            && owner.ownerCars.get(j).body == true
                                            && owner.ownerCars.get(j).suspension == true
                                            && owner.ownerCars.get(j).breaks == true) {
                                        System.out.println("masz auto na sprzedaz");
                                        if (customers.get(i).customerCash > owner.ownerCars.get(j).carPrice) {
                                            System.out.println("kupiec " + customers.get(i).name + " chce kupic " + owner.ownerCars.get(j).producer
                                                    + " za cene " + df.format(owner.ownerCars.get(j).carPrice));
                                            System.out.println("wpisz 1 jesli chcesz sprzeda??");
                                            if (userSelect.nextInt() == 1) {
                                                time.sell();
                                                owner.cash = owner.cash + owner.ownerCars.get(j).carPrice * 0.98 - 200.0;
                                                customers.remove(i);
                                                transactionHistory.add("tura " + time.week + " SPRZEDANY " + owner.ownerCars.get(j).producer + " klasy: " +
                                                        owner.ownerCars.get(j).carSegment +" o przebiegu: " + owner.ownerCars.get(j).mileage + " za cene: "  +
                                                        df.format(owner.ownerCars.get(j).carPrice));
                                                owner.ownerCars.remove(j);
                                                customers.add(new Customer());
                                                customers.add(new Customer());
                                                time.week += 1;
                                            }
                                        } else {
                                            System.out.println("klient " + customers.get(i).name + " niestety nie ma wystarczajaco gotowki");
                                        }
                                    } else {
                                        System.out.println("klient " + customers.get(i).name + " jest zainteresowany(" +
                                                owner.ownerCars.get(j).producer + "), ale musisz go naprawi??!!!");
                                    }
                                }
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
                                owner.cash = owner.cash - 1500;
                                for (int i = 0; i <= r.nextInt(2,6); i++) {
                                    customers.add(new Customer());
                                }
                                time.week+=1;
                                break;
                            case 2:
                                owner.cash = owner.cash - 500;
                                customers.add(new Customer());
                                time.week+=1;
                                break;
                            case 3:
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
                    if (transactionHistory.size() == 0) {
                        System.out.println("nie dokonales jeszcze zadnej tranzakcji");
                    }
                    for (int i = 0; i < transactionHistory.size(); i++)
                        System.out.println(i + " - " + transactionHistory.get(i));
                    break;
                case 10:
                    time.carRepHistory();
                    try {
                        System.out.println(owner.ownerCars.get(userSelect.nextInt()).carRepairHistory);
                    } catch (Exception e) {
                        time.error();
                    }
                case 11:
                    time.carRepCost();
                    try {
                        System.out.println(df.format(owner.ownerCars.get(userSelect.nextInt()).repAndWashCost));
                    } catch (Exception e) {
                        time.error();
                    }
            }
            if(owner.cash > 200000.0) {
                gameOn = false;
                time.endGame();
            }

            if(owner.cash < 0.0) {
                gameOn = false;
                time.loseGame();
            }
        } while (gameOn);
    }
}
