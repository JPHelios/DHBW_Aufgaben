package de.dhbw.programmieren.java.exercise.kaufmännischesRunden;


public class Round {
    public static void main(String[] args){

        double pi = 3.1415926; // Naeherung der Kreiszahl Pi
        double e = 2.7182818; // Naeherung der Eulerschen Zahl e

        pi = Math.round(pi);
        e = Math.round(e);

        int piInt = (int) pi;
        int eInt = (int) e;
        System.out.println("Pi ganzzahlig: " + piInt); // Ausgabe: 3
        System.out.println("e ganzzahlig: " + eInt); // Ausgabe: 2


    }

}
