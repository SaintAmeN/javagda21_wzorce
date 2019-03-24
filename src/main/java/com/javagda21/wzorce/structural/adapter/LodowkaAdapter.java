package com.javagda21.wzorce.structural.adapter;

public class LodowkaAdapter implements IDevice {
    private Lodowka lodowka;

    public LodowkaAdapter(Lodowka lodowka) {
        this.lodowka = lodowka;
    }

    @Override
    public void wlacz() {
        lodowka.switchOn();
    }

    @Override
    public void wylacz() {
        lodowka.switchOff();
    }
}
