package com.javagda21.wzorce.creational.singleton;

public class Gra {
    private KlasaKonfiguracyjna klasaKonfiguracyjna;

    private int iloscRund;

    private Gracz gracz1;
    private Gracz gracz2;


    public Gra(KlasaKonfiguracyjna klasaKonfiguracyjna) {
        this.klasaKonfiguracyjna = klasaKonfiguracyjna;

        System.out.println("Rozpoczynam grę, ilość rund: " + klasaKonfiguracyjna.getDomyslnaIloscRund());
        this.iloscRund = klasaKonfiguracyjna.getDomyslnaIloscRund();

        this.gracz1 = new Gracz(klasaKonfiguracyjna);
        this.gracz2 = new Gracz(klasaKonfiguracyjna);
    }
}
