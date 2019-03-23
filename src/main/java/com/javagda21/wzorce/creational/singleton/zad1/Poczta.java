package com.javagda21.wzorce.creational.singleton.zad1;

public class Poczta {
    private Automat automat;
    private Rejestracja rejestracja;
    private StronaInternetowa stronaInternetowa;

    public Poczta() {
        this.automat = new Automat();
        this.rejestracja = new Rejestracja();
        this.stronaInternetowa = new StronaInternetowa();
    }

    public int pobierzTicketZAutomatu(){
        return automat.generujTicket();
    }

    public int pobierzTicketZRejestracji(){
        return rejestracja.generujTicket();
    }

    public int pobierzTicketZeStronyInternetowej(){
        return stronaInternetowa.generujTicket();
    }
}
