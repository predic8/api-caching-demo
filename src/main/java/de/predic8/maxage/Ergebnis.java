package de.predic8.maxage;

import java.util.*;

public class Ergebnis {

    List<Long> faktoren;
    static int berechnung;

    public Ergebnis(List<Long> faktoren) {
        this.faktoren = faktoren;
        berechnung++;
    }

    public List<Long> getFaktoren() {
        return faktoren;
    }

    public void setFaktoren(List<Long> faktoren) {
        this.faktoren = faktoren;
    }

    public int getBerechnung() {
        return berechnung;
    }
}
