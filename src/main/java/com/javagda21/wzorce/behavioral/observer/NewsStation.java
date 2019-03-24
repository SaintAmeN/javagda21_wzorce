package com.javagda21.wzorce.behavioral.observer;

import java.util.Observable;

public class NewsStation extends Observable {

    public void dodajOgladajacego(Watcher watcher){
        addObserver(watcher);
    }

    public void powiadomOWiadomosci(int waga, String wiadomosc){
        setChanged();
        notifyObservers(new News(waga, wiadomosc));
    }
}
