package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Owner {
    public String name;
    public Double cash = 150000.0;
    public Car car;
    public List cars;
    List<String> ownerCars = new ArrayList<String>();
    Scanner userSelect = new Scanner(System.in);

    public Owner() {
    }

    public void setCar(){
        try {
            System.out.println("podaj ktory samochod chcesz kupic");
            int i = userSelect.nextInt();
            //this.cash = cash - car.carPrice;
            ownerCars.add(String.valueOf(i));
            cars.remove(String.valueOf(i));
        } catch(Exception e) {
            System.out.println("nie masz wystarczajaco gotowki");
        }

    }


}
