package com.javagda21.wzorce.structural.facadeproxy.przyklad2;

public class Mechanic {

    public void performRocketCheckup(ICheckable rocket){
        rocket.systemCheckup();
    }
}
