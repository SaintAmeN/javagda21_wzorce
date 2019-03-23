package com.javagda21.wzorce.behavioral.strategy.zad1;

public class Drukarka {
    private IFormatter formatter;

    public void setFormatter(IFormatter formatter) {
        this.formatter = formatter;
    }

    public String reformat(String tekstDoPrzetworzenia) {
        return formatter.format(tekstDoPrzetworzenia);
    }
}
