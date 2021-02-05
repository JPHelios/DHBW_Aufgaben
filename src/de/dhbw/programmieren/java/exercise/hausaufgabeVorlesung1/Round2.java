package de.dhbw.programmieren.java.exercise.hausaufgabeVorlesung1;

import java.util.Scanner;

public class Round2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Gleitkommazahl ein:");
        float f = scanner.nextFloat();
        scanner.close();

        int round = f >= 0 ? (int) (f + 0.5) : (int) (f - 0.5);
        System.out.println(round);
    }
}


/*      Lösung im Sinne der Aufgabe:

        double pi = -3.1415926; // Naeherung der Kreiszahl Pi
        double e = -2.7182818; // Naeherung der Eulerschen Zahl e

        pi = Math.round(pi);
        e = Math.round(e);

        int piInt = (int) (pi-0.5);
        int eInt = (int) (e+0.5);
        System.out.println("Pi ganzzahlig: " + piInt); // Ausgabe: 3
        System.out.println("e ganzzahlig: " + eInt); // Ausgabe: 2


 */