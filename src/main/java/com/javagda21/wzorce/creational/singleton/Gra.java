package com.javagda21.wzorce.creational.singleton;

public class Gra {

    private int iloscRund;

    private Gracz gracz1;
    private Gracz gracz2;

    public Gra() {

        System.out.println("Rozpoczynam grę, ilość rund: " + KlasaKonfiguracyjna.INSTANCE.getDomyslnaIloscRund());
        this.iloscRund = KlasaKonfiguracyjna.INSTANCE.getDomyslnaIloscRund();

        this.gracz1 = new Gracz();
        this.gracz2 = new Gracz();
    }
}
