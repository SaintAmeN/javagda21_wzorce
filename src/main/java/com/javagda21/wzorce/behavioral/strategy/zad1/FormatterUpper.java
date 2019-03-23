package com.javagda21.wzorce.behavioral.strategy.zad1;

public class FormatterUpper implements IFormatter {
    @Override
    public String format(String stringToReformat) {
        return stringToReformat.toUpperCase();
    }
}
