package com.company;

public class Car {
    public String producer, color, carSegment;



    public Integer mileage, price;
    public Boolean breaks, suspension, engine, gear, body;

    public Car(String producer, String color, String carSegment, Integer mileage, Integer price, Boolean breaks, Boolean suspension, Boolean engine, Boolean gear, Boolean body) {
        this.producer = producer;
        this.color = color;
        this.carSegment = carSegment;
        this.mileage = mileage;
        this.price = price;
        this.breaks = breaks;
        this.suspension = suspension;
        this.engine = engine;
        this.gear = gear;
        this.body = body;
    }
    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", carSegment='" + carSegment + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                ", breaks=" + breaks +
                ", suspension=" + suspension +
                ", engine=" + engine +
                ", gear=" + gear +
                ", body=" + body +
                '}';
    }
}
