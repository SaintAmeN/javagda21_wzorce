package com.javagda21.wzorce.creational.singleton;

public class Gracz {
    private int iloscZycia;
    public Gracz() {

        System.out.println("Ilosc zycia gracza: " + KlasaKonfiguracyjna.INSTANCE.getDomyslnaIloscZyciaGracza());
        this.iloscZycia = KlasaKonfiguracyjna.INSTANCE.getDomyslnaIloscZyciaGracza();
    }
}
