package com.javagda21.wzorce.creational.singleton.zad1;

public class Rejestracja implements IGeneratorTicketow{
    public int generujTicket() {
//        return GeneratorTicketow.getInstance().pobierzNastepnyNumerek();
        return GeneratorTicketow.INSTANCE.pobierzNastepnyNumerek();
    }
}
