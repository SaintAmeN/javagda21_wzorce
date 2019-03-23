package com.javagda21.wzorce.creational.builder.zad2;

public class Main {
    public static void main(String[] args) {
        Stamp pieczatka = new Stamp.Builder()
                .setFirstDayNumber(0)
                .setSecondDayNumber(5)
                .setFirstMonthNumber(0)
                .setSecondMonthNumber(3)
                .setYearNumber1(2)
                .setYearNumber2(0)
                .setYearNumber3(1)
                .setYearNumber4(9)
                .setCaseNumber(233)
                .createStamp();

        System.out.println(pieczatka);
    }
}
