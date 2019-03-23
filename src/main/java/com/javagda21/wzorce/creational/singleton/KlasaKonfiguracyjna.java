package com.javagda21.wzorce.creational.singleton;

public class KlasaKonfiguracyjna {

    private static KlasaKonfiguracyjna instance;

    private KlasaKonfiguracyjna() {
    }

    public static KlasaKonfiguracyjna getInstance() {
        // 1.
        if (instance == null) {
            // 2
            synchronized (KlasaKonfiguracyjna.class) {
                // 3.
                if (instance == null) {
                    // 4.
                    instance = new KlasaKonfiguracyjna();
                }
            }
        }
        // 5.
        return instance;
    }

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
