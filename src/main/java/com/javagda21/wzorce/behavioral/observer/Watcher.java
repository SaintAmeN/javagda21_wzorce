package com.javagda21.wzorce.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    private String imie;
    private int panicLevel;

    public Watcher(String imie, int panicLevel) {
        this.imie = imie;
        this.panicLevel = panicLevel;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof News) {
            News wiadomosc = (News) arg;
            if (wiadomosc.getLevel() > panicLevel) {
                System.out.println("Wpadam w Panikę! (" + imie + ") " + wiadomosc.getMessage());
            } else {
                System.out.println("Otrzynalem (" + imie + "): " + wiadomosc.getMessage());
            }
        }
    }
}
