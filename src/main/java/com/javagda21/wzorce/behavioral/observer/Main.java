package com.javagda21.wzorce.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        NewsStation newsStation = new NewsStation();

        newsStation.dodajOgladajacego(new Watcher("Marian", 3));
        newsStation.dodajOgladajacego(new Watcher("Janek", 5));
        newsStation.dodajOgladajacego(new Watcher("Olek", 2));
        newsStation.dodajOgladajacego(new Watcher("Arek", 8));
        newsStation.dodajOgladajacego(new Watcher("Ania", 10));
        newsStation.dodajOgladajacego(new Watcher("Gosia", 8));

//        newsStation.powiadomOWiadomosci(2, "Cośtam się dzieje.");
//        newsStation.powiadomOWiadomosci(4, "Cośtam się dzieje.");
//        newsStation.powiadomOWiadomosci(6, "Cośtam się dzieje.");
//        newsStation.powiadomOWiadomosci(7, "Cośtam się dzieje.");
        newsStation.powiadomOWiadomosci(10, "Cośtam się dzieje.");
    }
}
