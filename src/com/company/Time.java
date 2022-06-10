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
    public void error() {
        System.out.println("cos poszlo nie tak");
    }
    public void advertise() {
        System.out.println("wybierz jaka rekleme chcerz kupic");
        System.out.println("1 - reklama w gazecie");
        System.out.println("  - koszt - 3000");
        System.out.println("2 - reklama w internecie");
        System.out.println("  - koszt - 1000");
    }
    public void carRepairInfo () {
        System.out.println("wybierz co chcesz naprawic");
        System.out.println("1 - hamulce");
        System.out.println("2 - zawieszenie");
        System.out.println("3 - silnik");
        System.out.println("4 - skrzynie biegow");
        System.out.println("5 - karoserie");
    }
    public void sell () {
        System.out.println("brawo sprzedales auto!");
        System.out.println("koszt mycia auta przed sprzedaza: 200");
        System.out.println("niestety dopadl Cie urzad skarbowy");
        System.out.println("musisz zaplacic 2% podatku od sprzedazy");
    }

    public void endGame () {
        System.out.println("=======================================================");
        System.out.println("koniec rozgrywnki");
        System.out.println("udalo Ci sie wygrac w " + this.week + " tygodniu rozgrywki.");
        System.out.println("=======================================================");
    }
    public void loseGame () {
        System.out.println("=======================================================");
        System.out.println("BRAWO");
        System.out.println("ZBANRUKOTOWALES W " + this.week + " tygodniu rozgrywki.");
        System.out.println("=======================================================");
    }
}
