package com.javagda21.wzorce.creational.singleton;

public class Gracz {
    private int iloscZycia;
    public Gracz() {

        System.out.println("Ilosc zycia gracza: " + KlasaKonfiguracyjna.instance.getDomyslnaIloscZyciaGracza());
        this.iloscZycia = KlasaKonfiguracyjna.instance.getDomyslnaIloscZyciaGracza();
    }
}
