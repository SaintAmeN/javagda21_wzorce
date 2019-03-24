package com.javagda21.wzorce.behavioral.observer;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;

import java.util.Observable;

public class NewsStation {

//    private StringProperty stringProperty;
    private SimpleObjectProperty<News> newsProperty = new SimpleObjectProperty<>();

    public void dodajOgladajacego(Watcher watcher){
        newsProperty.addListener(watcher);
    }

    public void powiadomOWiadomosci(int waga, String wiadomosc){
//        setChanged();
//        notifyObservers(new News(waga, wiadomosc));
        newsProperty.setValue(new News(waga, wiadomosc));
    }
}
