package com.javagda21.wzorce.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        NewsStation newsStation = new NewsStation();

        newsStation.dodajOgladajacego(new Watcher("Marian"));
        newsStation.dodajOgladajacego(new Watcher("Janek"));
        newsStation.dodajOgladajacego(new Watcher("Olek"));
        newsStation.dodajOgladajacego(new Watcher("Arek"));
        newsStation.dodajOgladajacego(new Watcher("Ania"));
        newsStation.dodajOgladajacego(new Watcher("Gosia"));

        newsStation.powiadomOWiadomosci("Cośtam się dzieje.");
    }
}
