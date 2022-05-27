package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String cars[] = {"toyota", "wv", "merc", "fiat"};
        Random rand = new Random();
        int x = rand.nextInt(3);

       Car car1 = new Car("toyota", "red", "b", 45, 20000, true, true, true, true, true);
       Owner owner = new Owner();

       owner.car = car1;

        System.out.println(owner.car);
    }
}
