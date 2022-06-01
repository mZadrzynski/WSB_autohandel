package com.company;

public class Car {
    public String producer, color, carSegment;
    public Integer mileage, price;
    public Boolean breaks, suspension, engine, gear, body;

    public Car(String carsName) {




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
