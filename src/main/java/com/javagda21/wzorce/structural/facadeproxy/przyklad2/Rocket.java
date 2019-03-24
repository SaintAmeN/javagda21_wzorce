package com.javagda21.wzorce.structural.facadeproxy.przyklad2;

public class Rocket implements IRocketWithEngine, ICheckable {
    // facade
    public void flyToMars(){
        coolEngines();
        systemCheckup();
        startIgnition();
        startEngines();
        //. fly...
    }

    public void startEngines(){
        System.out.println("Starting engines");
    }

    public void coolEngines(){
        System.out.println("Cooling engines. Engines are cool :)");
    }

    public void startIgnition(){
        System.out.println("Start ignition");
    }

    public void systemCheckup(){
        checkEngine();
        checkIfTeslaIsOnBoard();
    }

    public void checkIfTeslaIsOnBoard() {
        System.out.println("Tesla is on board");
    }

    public void checkEngine(){
        System.out.println("Engine is on board :)");
    }
}
