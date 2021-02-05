package de.dhbw.programmieren.java.exercise.klassen.Nimmspiel;

public class Spieler {

    String playerName;
    boolean amZug;
    int num;

    public String getPlayerName() {
        return playerName;
    }

    public Spieler(String name, int num){

        this.playerName = name;
        this. num = num;

    }

    public boolean getAmZug() {
        return amZug;
    }

    public void setAmZug(boolean amZug) {
        this.amZug = amZug;
    }

}