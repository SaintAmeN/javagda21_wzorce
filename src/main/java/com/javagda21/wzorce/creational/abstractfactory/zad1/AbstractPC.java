package com.javagda21.wzorce.creational.abstractfactory.zad1;

public abstract class AbstractPC {
    private String name;
    private ComputerBrand computerBrand;
    private int power;
    private double gpuPower;
    private boolean overclocked;

    public AbstractPC(String name, ComputerBrand computerBrand, int power, double gpuPower, boolean overclocked) {
        this.name = name;
        this.computerBrand = computerBrand;
        this.power = power;
        this.gpuPower = gpuPower;
        this.overclocked = overclocked;
    }
}
