package com.javagda21.wzorce.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    private String imie;

    public Watcher(String imie) {
        this.imie = imie;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Otrzynalem (" + imie + "): " + arg);
    }
}
