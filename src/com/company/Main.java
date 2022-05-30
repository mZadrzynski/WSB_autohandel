package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boolean gameOn = true;
        Scanner userInput = new Scanner(System.in);
        Time time = new Time();
        String cars[] = {"toyota", "wv", "merc", "fiat"};
        Random rand = new Random();
        int x = rand.nextInt(3);

       Car car1 = new Car("toyota", "red", "b", 45, 20000, true, true, true, true, true);
       Owner owner = new Owner();

       owner.car = car1;

       time.runGame();

       do {
            switch(userInput.nextInt()) {
                case 1:
                    System.out.println(owner.car);
                case 2:
                    System.out.println("test");
            }

       } while(gameOn);

    }
}
