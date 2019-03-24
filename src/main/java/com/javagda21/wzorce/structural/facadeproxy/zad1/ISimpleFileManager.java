package com.javagda21.wzorce.structural.facadeproxy.zad1;

import java.io.IOException;
import java.util.List;

public interface ISimpleFileManager {
    public void pominNlinii(int n);
    public List<String> wczytajNLinii(int n) throws IOException;
}

