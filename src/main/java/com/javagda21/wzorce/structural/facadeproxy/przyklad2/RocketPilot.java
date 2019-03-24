package com.javagda21.wzorce.structural.facadeproxy.przyklad2;

public class RocketPilot {
    public void flyToMars(IRocketWithEngine rocketWithEngine){
//        rocketWithEngine.coolEngines();
//        rocketWithEngine.systemCheckup();
//        rocketWithEngine.startIgnition();
//        rocketWithEngine.startEngines();
//
        rocketWithEngine.flyToMars();

    }
}
