package de.dhbw.programmieren.java.exercise.klassen.Nimmspiel;

public class Haufen {

    int anzahl;
    int index;

    public int getIndex() {
        return index;
    }

    public Haufen(int anzahl, int index){

        this.anzahl = anzahl;
        this.index = index;

    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
