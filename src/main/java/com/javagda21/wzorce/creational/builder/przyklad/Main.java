package com.javagda21.wzorce.creational.builder.przyklad;

public class Main {
    public static void main(String[] args) {
//        Bohater bohater = new Bohater()
        Bohater.Builder builder = new Bohater.Builder("Marian");

        Bohater bohater = builder
                .setImie("Marian")
                .setImieMatki("Joanna")
                .setNazwisko("Nowak")
                .setDrugieImie("Jakub")
                .create();
    }
}
