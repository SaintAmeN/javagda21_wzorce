package com.javagda21.wzorce.creational.singleton;

public class Main {
    public static void main(String[] args) {
        KlasaKonfiguracyjna klasaKonfiguracyjna = new KlasaKonfiguracyjna();

        new Gra(klasaKonfiguracyjna);
    }

}
