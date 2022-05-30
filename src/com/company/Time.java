package com.company;

public class Time {
    public Integer year = 2020;
    public Integer week = 0;
    public Owner owner;

    public void runGame() {
        System.out.println("wybierz co chcesz zrobic!");
        System.out.println("1 - przegladaj baze aut do kupienia");
        System.out.println("2 - zakup auto");
        System.out.println("3 - przegladaj baze posiadanych aut");
        System.out.println("4 - napraw samochod");
        System.out.println("5 - przejrzyj potencjalnych klientow");
        System.out.println("6 - sprzedaj auto");
        System.out.println("7 - kup reklame");
        System.out.println("8 - sprawdz stan konta");
        System.out.println("9 - sprawdz historie tranzakcji");
        System.out.println("10 - sprawdz historie napraw pojazdu oraz koszt");
    }
}