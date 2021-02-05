package de.dhbw.programmieren.java.exercise.kontrollstrukturen;

public class Deers {

    public static void main(String[] args){

        float bestand = 200;
        int abschuss = 15;
        float rate = 0.1f;
        int jahr = 1;
        float zuwachs;

        while(bestand < 300){

            zuwachs = bestand * rate - abschuss;
            bestand = (int) bestand + zuwachs;
            System.out.print("Jahr " + jahr + ":  " + (int) bestand + " Hirsche \n");
            jahr++;
        }
    }
}
