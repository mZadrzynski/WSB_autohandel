package com.company;

public class Owner {
    public String name;
    public Double cash = 150000.0;
    public Car car;

    public Owner() {
    }

    public void setCar(Car car){
        try {
            this.car = car;
            this.cash = cash - car.carPrice;
        } catch(Exception e) {
            System.out.println("nie masz wystarczajaco gotowki");
        }
    }
}
