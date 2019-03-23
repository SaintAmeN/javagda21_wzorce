package com.javagda21.wzorce.creational.builder.przyklad;

public class Bohater {
    private String imie = "Jacek", nazwisko, drugieImie, imieMatki, imieOjca, imieDziadka1, imieDziadka2, imieBabci, imieBabci2, miejsceUrodzenia;
    private int romiarButa, wysokosc, iloscZycia, iloscMany, iloscDzieci, iloscWnukow, iloscZwierzat, szerokoscWPasie, waga;
    private double ilosZebow;

    // konstruktor schowany
    public Bohater(String imie, String nazwisko, String drugieImie, String imieMatki, String imieOjca, String imieDziadka1, String imieDziadka2, String imieBabci, String imieBabci2, String miejsceUrodzenia, int romiarButa, int wysokosc, int iloscZycia, int iloscMany, int iloscDzieci, int iloscWnukow, int iloscZwierzat, int szerokoscWPasie, int waga, double ilosZebow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.drugieImie = drugieImie;
        this.imieMatki = imieMatki;
        this.imieOjca = imieOjca;
        this.imieDziadka1 = imieDziadka1;
        this.imieDziadka2 = imieDziadka2;
        this.imieBabci = imieBabci;
        this.imieBabci2 = imieBabci2;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.romiarButa = romiarButa;
        this.wysokosc = wysokosc;
        this.iloscZycia = iloscZycia;
        this.iloscMany = iloscMany;
        this.iloscDzieci = iloscDzieci;
        this.iloscWnukow = iloscWnukow;
        this.iloscZwierzat = iloscZwierzat;
        this.szerokoscWPasie = szerokoscWPasie;
        this.waga = waga;
        this.ilosZebow = ilosZebow;
    }

    public static class Builder {
        private String imie, nazwisko, drugieImie, imieMatki, imieOjca, imieDziadka1, imieDziadka2, imieBabci, imieBabci2, miejsceUrodzenia;
        private int romiarButa = 32, wysokosc, iloscZycia, iloscMany, iloscDzieci, iloscWnukow, iloscZwierzat, szerokoscWPasie, waga;
        private double ilosZebow;

        public Builder() {
        }

        public Builder setImie(String imie) {
            this.imie = imie;
            return this;
        }

        public Builder setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        public Builder setDrugieImie(String drugieImie) {
            this.drugieImie = drugieImie;
            return this;
        }

        public Builder setImieMatki(String imieMatki) {
            this.imieMatki = imieMatki;
            return this;
        }

        public Bohater create() {
            return new Bohater(imie, nazwisko, drugieImie, imieMatki, imieOjca, imieDziadka1, imieDziadka2, imieBabci, imieBabci2, miejsceUrodzenia, romiarButa, wysokosc, iloscZycia, iloscMany, iloscDzieci, iloscWnukow, iloscZwierzat, szerokoscWPasie, waga, ilosZebow);
        }
    }

    @Override
    public String toString() {
        return "Bohater{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", drugieImie='" + drugieImie + '\'' +
                ", imieMatki='" + imieMatki + '\'' +
                ", imieOjca='" + imieOjca + '\'' +
                ", imieDziadka1='" + imieDziadka1 + '\'' +
                ", imieDziadka2='" + imieDziadka2 + '\'' +
                ", imieBabci='" + imieBabci + '\'' +
                ", imieBabci2='" + imieBabci2 + '\'' +
                ", miejsceUrodzenia='" + miejsceUrodzenia + '\'' +
                ", romiarButa=" + romiarButa +
                ", wysokosc=" + wysokosc +
                ", iloscZycia=" + iloscZycia +
                ", iloscMany=" + iloscMany +
                ", iloscDzieci=" + iloscDzieci +
                ", iloscWnukow=" + iloscWnukow +
                ", iloscZwierzat=" + iloscZwierzat +
                ", szerokoscWPasie=" + szerokoscWPasie +
                ", waga=" + waga +
                ", ilosZebow=" + ilosZebow +
                '}';
    }
}
