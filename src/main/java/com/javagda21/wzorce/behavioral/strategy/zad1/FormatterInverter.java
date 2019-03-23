package com.javagda21.wzorce.behavioral.strategy.zad1;

public class FormatterInverter implements IFormatter {
    @Override
    public String format(String stringToReformat) {
        char[] chars = stringToReformat.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }
}
