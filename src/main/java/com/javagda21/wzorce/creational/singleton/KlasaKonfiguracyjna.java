package com.javagda21.wzorce.creational.singleton;

public class KlasaKonfiguracyjna {

    private int domyslnaIloscZyciaGracza = 100;
    private int domyslnaIloscRund = 5;

    public int getDomyslnaIloscZyciaGracza() {
        return domyslnaIloscZyciaGracza;
    }

    public void setDomyslnaIloscZyciaGracza(int domyslnaIloscZyciaGracza) {
        this.domyslnaIloscZyciaGracza = domyslnaIloscZyciaGracza;
    }

    public int getDomyslnaIloscRund() {
        return domyslnaIloscRund;
    }

    public void setDomyslnaIloscRund(int domyslnaIloscRund) {
        this.domyslnaIloscRund = domyslnaIloscRund;
    }
}
