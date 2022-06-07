package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Owner {
    public String name;
    public Double cash = 150000.0;
    public Car car;
    List<Object> ownerCars = new ArrayList<Object>();
    Scanner userSelect = new Scanner(System.in);

    public Owner() {
    }


    public void ownerSetCar(){
        //try {
           // System.out.println("podaj ktory samochod chcesz kupic");
            //int i = userSelect.nextInt();
            //if(cash >= car.carPrice) {
                //this.cash = cash - car.carPrice;
                //cars.get(i) = this.car;
                ownerCars.add(cars.get(1));
                //cars.remove(String.valueOf(i));
                //cars.add(String.valueOf(new Car("3")));
            //} else {
              //  System.out.println("nie masz wystarczajaco gotowki by kupic to auto");
            //}
        //} catch(Exception e) {
          //  System.out.println("cos poszlo nie tak");
        //}

    }


}
