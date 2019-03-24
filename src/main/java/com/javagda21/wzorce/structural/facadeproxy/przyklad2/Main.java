package com.javagda21.wzorce.structural.facadeproxy.przyklad2;

public class Main {
    public static void main(String[] args) {
        Rocket rocket = new Rocket();

        Mechanic mechanic = new Mechanic();

        mechanic.performRocketCheckup(rocket);
    }
}
