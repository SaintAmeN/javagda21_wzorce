package com.javagda21.wzorce.creational.builder.przyklad;

public class Main {
    public static void main(String[] args) {
//        Bohater bohater = new Bohater()
        Bohater.Builder builder = new Bohater.Builder();

        Bohater bohater = new Bohater.Builder()
                .setImie("Marian")
                .setImieMatki("Joanna")
                .setNazwisko("Nowak")
                .setDrugieImie("Jakub")
                .create();

        Bohater tenSamCoWyzej = builder.create();

        Bohater bohater2 = builder
                .setImie("Jacek")
                .create();

        System.out.println(bohater);
        System.out.println(bohater2);
        System.out.println(tenSamCoWyzej);
    }
}
