package com.javagda21.wzorce.behavioral.observer;

import java.util.Observable;

public class NewsStation extends Observable {

    public void dodajOgladajacego(Watcher watcher){
        addObserver(watcher);
    }

    public void powiadomOWiadomosci(String wiadomosc){
        setChanged();
        notifyObservers(new Message(1, wiadomosc));
    }
}
