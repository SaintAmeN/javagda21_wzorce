package com.javagda21.wzorce.creational.singleton;

public class Gracz {
    private int iloscZycia;
    public Gracz(KlasaKonfiguracyjna klasaKonfiguracyjna) {

        System.out.println("Ilosc zycia gracza: " + klasaKonfiguracyjna.getDomyslnaIloscZyciaGracza());
        this.iloscZycia = klasaKonfiguracyjna.getDomyslnaIloscZyciaGracza();
    }
}
