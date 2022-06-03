package com.company;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    public String name;
    public Double cash = 150000.0;
    public Car car;
    List<Car> ownerCars = new ArrayList<Car>();

    public Owner() {
    }

    public void setCar(Car car){
        try {
            this.car = car;
            this.cash = cash - car.carPrice;
            ownerCars.add(this.car);
        } catch(Exception e) {
            System.out.println("nie masz wystarczajaco gotowki");
        }

    }
}
