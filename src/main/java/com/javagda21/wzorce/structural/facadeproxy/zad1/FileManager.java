package com.javagda21.wzorce.structural.facadeproxy.zad1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager implements ISimpleFileManager {
    private BufferedReader bufferedReader = null;
    private String sciezkaDoPliku;

    public FileManager(String sciezkaDoPliku) {
        this.sciezkaDoPliku = sciezkaDoPliku;
    }

    public void otworzPlik() {
        try {
            bufferedReader = new BufferedReader(new FileReader(sciezkaDoPliku));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void zamknijPlik() {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedReader = null;
    }

    public String wczytajLinie() throws IOException {
        if (bufferedReader == null) { // sprawdzenie czy plik jest otwarty
            otworzPlik(); // jesli nie jest otwarty to go otwieramy
        }
        String linia;

        linia = bufferedReader.readLine(); // czytam linie
        if (linia == null) { // null oznacza ze plik sie skonczyl
            przewinPlik();
            return wczytajLinie();
        }
        return linia;
    }

    public void przewinPlik() {
        zamknijPlik();
        otworzPlik();
    }

    public void pominLinie() {
        try {
            wczytajLinie();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void pominNlinii(int n) {
        try {
            wczytajNLinii(n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> wczytajNLinii(int n) throws IOException {
        List<String> linie = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            linie.add(wczytajLinie());
        }
        return linie;
    }
}
