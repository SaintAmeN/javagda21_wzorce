package com.javagda21.wzorce.structural.adapter.przyklad;

public class CzajnikAdapter implements IDevice {
    public Czajnik czajnik;

    public CzajnikAdapter(Czajnik czajnik) {
        this.czajnik = czajnik;
    }

    @Override
    public void wlacz() {
        czajnik.turnOn();
    }

    @Override
    public void wylacz() {
        czajnik.turnOff();
    }
}
