package com.company;

public class Time {
    public Integer year = 2020;
    public Integer week = 0;

    public void runGame() {
        System.out.println("wybierz co chcesz zrobic! wpisz w konsole odpowiedni numer.");
        System.out.println("1 - przegladaj baze aut do kupienia");
        System.out.println("2 - zakup auto");
        System.out.println("3 - przegladaj baze posiadanych aut");
        System.out.println("4 - napraw samochod");
        System.out.println("5 - przejrzyj potencjalnych klientow");
        System.out.println("6 - sprzedaj auto");
        System.out.println("7 - kup reklame");
        System.out.println("8 - sprawdz stan konta");
        System.out.println("9 - sprawdz historie transakcji");
        System.out.println("10 - sprawdz historie napraw pojazdu");
        System.out.println("11 - sprawdz sume kosztow mycia i napraw pojazdu");
    }

    public void error() {
        System.out.println("...");
    }

    public void advertise() {
        System.out.println("wybierz jaka rekleme chcerz kupic");
        System.out.println("1 - reklama w gazecie");
        System.out.println("  - koszt - 1500");
        System.out.println("2 - reklama w internecie");
        System.out.println("  - koszt - 500");
        System.out.println("3 - wroc do menu glownego");
    }

    public void carRepairInfo() {
        System.out.println("wybierz co chcesz naprawic");
        System.out.println("1 - hamulce");
        System.out.println("2 - zawieszenie");
        System.out.println("3 - silnik");
        System.out.println("4 - skrzynie biegow");
        System.out.println("5 - karoserie");
    }

    public void sell() {
        System.out.println("brawo sprzedales auto!");
        System.out.println("koszt mycia auta przed sprzedaza: 200");
        System.out.println("niestety dopadl Cie urzad skarbowy");
        System.out.println("musisz zaplacic 2% podatku od sprzedazy");
    }

    public void endGame() {
        System.out.println("=======================================================");
        System.out.println("koniec rozgrywnki");
        System.out.println("udalo Ci sie wygrac w " + this.week + " tygodniu rozgrywki.");
        System.out.println("=======================================================");
    }

    public void loseGame() {
        System.out.println("=======================================================");
        System.out.println("BRAWO");
        System.out.println("ZBANRUKOTOWALES W " + this.week + " tygodniu rozgrywki.");
        System.out.println("=======================================================");
    }

    public void carMechanicsList() {
        System.out.println("Wybierz ktory mechanik ma naprawiac auto");
        System.out.println("1 - Janusz - najdrozszy ale ma 100% szans na powodzenie");
        System.out.println("2 - Marian - znacznie tańszy ale jest 10% szans ze nie uda mu sie naprawic");
        System.out.println("3 - Adrian - znacznie tańszy ale jest 20% szans ze nie uda mu sie naprawic");
        System.out.println("oraz istnieje mala szansa ze zepsuje cos innego");
    }

    public void carRepHistory() {
        System.out.println("Podaj numer Twojeg auta ktorego historie napraw chcerz sprawdzic");
    }
    public void carRepCost() {
        System.out.println("Podaj numer Twojeg auta ktorego");
        System.out.println("chcesz sprawic sume kosztow mycia i napraw");
    }
}
