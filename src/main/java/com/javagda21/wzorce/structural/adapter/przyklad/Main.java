package com.javagda21.wzorce.structural.adapter.przyklad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IDevice> devices = new ArrayList<>();

        devices.add(new LodowkaAdapter(new Lodowka()));
    }
}
