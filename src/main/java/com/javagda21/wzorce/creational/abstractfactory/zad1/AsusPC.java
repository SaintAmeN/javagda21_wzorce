package com.javagda21.wzorce.creational.abstractfactory.zad1;

public class AsusPC extends AbstractPC{
    public AsusPC(String name, int power, double gpuPower, boolean overclocked) {
        super(name, ComputerBrand.ASUS, power, gpuPower, overclocked);
    }

    public static AsusPC createAsusN53(){
        return new AsusPC("N53", 100, 100, false);
    }
}
