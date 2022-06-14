package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Owner {
    public Double cash = 70000.0;
    List<Car> ownerCars = new ArrayList();
    Scanner userSelect = new Scanner(System.in);
    public Boolean repairResult;
    public Boolean repairTurboFail = false;
    public Integer repairCostMultiplier;
    Random r = new Random();
    public Integer i;
    public Owner() {}

    public void CarMechanics () {
        switch (userSelect.nextInt()) {
            case (1):
                repairResult = true;
                repairCostMultiplier = 3;
                break;
            case (2):
                if (r.nextInt(0,9) == 4) {
                    repairResult = false;
                } else {
                    repairResult = true;
                }
                repairCostMultiplier = 2;
                break;
            case (3):
               if (r.nextInt(0,4) == 2) {
                    repairResult = false;
                } else {
                    repairResult = true;
            }
               if (r.nextInt(0,20) == 10) {
                   repairTurboFail = true;
               }
               repairCostMultiplier = 1;
               break;
        }
    }
    public void breaksRepair () {
        i = userSelect.nextInt();
        if (ownerCars.get(i).breaks) {
            System.out.println("w aucie " + ownerCars.get(i).producer + " hamulce sa sprawne");
        } else {
            if (repairResult = true) {
                this.cash = cash - ownerCars.get(i).carPrice * 0.02 * repairCostMultiplier;
                ownerCars.get(i).breaks = true;
                ownerCars.get(i).carPrice *= 1.1;
                System.out.println("udalo sie naprawic hamulce w " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.02 * repairCostMultiplier);
            } else {
                System.out.println("nie udalo sie naprawic hamulcow w " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.02 * repairCostMultiplier);
            }
        }
    }

    public void suspensionRepair () {
        i = userSelect.nextInt();
        if (ownerCars.get(i).suspension) {
            System.out.println("w aucie " + ownerCars.get(i).producer + " zawieszenie jest sprawne");
        } else {
            if (repairResult = true) {
                this.cash = cash - ownerCars.get(i).carPrice * 0.04 * repairCostMultiplier;
                System.out.println("udalo sie naprawic zawieszenie w " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.04 * repairCostMultiplier);
                ownerCars.get(i).suspension = true;
                ownerCars.get(i).carPrice *= 1.2;
            } else {
                System.out.println("nie udalo sie naprawic zawieszenia w " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.04 * repairCostMultiplier);
                this.cash = cash - ownerCars.get(i).carPrice * 0.04 * repairCostMultiplier;
            }
        }
    }
    public void gearRepair () {
        i = userSelect.nextInt();
        if (ownerCars.get(i).gear) {
            System.out.println("w aucie " + ownerCars.get(i).producer + " skrzynia biegow jest sprawna");
        } else {
            if (repairResult = true) {
                this.cash = cash - ownerCars.get(i).carPrice * 0.1 * repairCostMultiplier;
                System.out.println("udalo sie naprawic skrzenie biegow w " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.1 * repairCostMultiplier);
                ownerCars.get(i).gear = true;
                ownerCars.get(i).carPrice *= 1.5;
            } else {
                System.out.println("nie udalo sie naprawic skrzyni biegow " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.1 * repairCostMultiplier);
                this.cash = cash - ownerCars.get(i).carPrice * 0.1 * repairCostMultiplier;
            }
        }
    }
    public void engineRepair () {
        i = userSelect.nextInt();
        if (ownerCars.get(i).engine) {
            System.out.println("w aucie " + ownerCars.get(i) + " silnik jest na chodzie");
        } else {
            if (repairResult = true) {
                this.cash = cash - ownerCars.get(i).carPrice * 0.2 * repairCostMultiplier;
                System.out.println("udalo sie naprawic silnik w " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.2 * repairCostMultiplier);
                ownerCars.get(i).engine = true;
                ownerCars.get(i).carPrice *= 2.0;
            } else {
                System.out.println("nie udalo sie naprawic silnika w " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.2 * repairCostMultiplier);
                this.cash = cash - ownerCars.get(i).carPrice * 0.2 * repairCostMultiplier;
            }
        }
    }
    public void bodyRepair () {
        i = userSelect.nextInt();
        if (ownerCars.get(i).body) {
            System.out.println("w aucie karoseria " + ownerCars.get(i) + " jest stan igla");
        } else {
            if (repairResult = true) {
                this.cash = cash - ownerCars.get(i).carPrice * 0.1 * repairCostMultiplier;
                System.out.println("udalo sie wyklepac karoserie " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.1 * repairCostMultiplier);
                ownerCars.get(i).body = true;
                ownerCars.get(i).carPrice *= 1.5;
            } else {
                System.out.println("nie udalo sie wyklepac karoserii " + ownerCars.get(i).producer);
                System.out.println("koszt naprawy wyniosl: " + ownerCars.get(i).carPrice * 0.1 * repairCostMultiplier);
                this.cash = cash - ownerCars.get(i).carPrice * 0.1 * repairCostMultiplier;
            }
        }
    }
    public void turboFail () {
        if (repairTurboFail) {
            System.out.println("niestety naprawa wyjatkowo sie nie udala");
            repairTurboFail = false;
            switch (r.nextInt(0, 4)) {
                case (0):
                    ownerCars.get(i).breaks = false;
                    System.out.println("dodatkowo zepsute zostaly hamulce");
                    break;
                case (1):
                    ownerCars.get(i).suspension = false;
                    System.out.println("dodatkowo zepsute zostalo zawieszenie");
                    break;
                case (2):
                    ownerCars.get(i).engine = false;
                    System.out.println("mechanik zatarl silnik");
                    break;
                case (3):
                    ownerCars.get(i).body = false;
                    System.out.println("mechanik porysowal cala karoserie");
                    break;
                case (4):
                    ownerCars.get(i).gear = false;
                    System.out.println("mechanik zaoral przekladnie");
                    break;
            }
        } else {
            System.out.println("szerokiej drogi!");
            }
        }
}



   // public void ownerSetCar(){
        //try {
           // System.out.println("podaj ktory samochod chcesz kupic");
            //int i = userSelect.nextInt();
            //if(cash >= car.carPrice) {
                //this.cash = cash - car.carPrice;
                //cars.get(i) = this.car;
                //ownerCars.add(cars.get(1));
                //cars.remove(String.valueOf(i));
                //cars.add(String.valueOf(new Car("3")));
            //} else {
              //  System.out.println("nie masz wystarczajaco gotowki by kupic to auto");
            //}
        //} catch(Exception e) {
          //  System.out.println("cos poszlo nie tak");
        //}

   // }



