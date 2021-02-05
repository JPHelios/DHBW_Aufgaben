package de.dhbw.programmieren.java.exercise.klassen.Lotto;

import java.util.Arrays;
import java.util.Scanner;

public class Tipp {

    int[] tipp;

    public Tipp(int anzahl){

        tipp = new int[anzahl];
        boolean einfuegen;
        Scanner scanner = new Scanner(System.in);

        for(int i : tipp) {
            do { //Prüfung der Gültigkeit der Eingabe

                einfuegen = true;

                System.out.println("Geben Sie bitte Ihren Tipp für die " + (i + 1) + ". Zahl ein:");
                int eingabe = scanner.nextInt();

                for (int k : tipp) {
                    if (k == eingabe | eingabe < 1 | eingabe > 49) einfuegen = false;
                }

                if (einfuegen) tipp[i] = eingabe;

            } while (!einfuegen);
        }
    }

    @Override
    public String toString(){

        Arrays.sort(tipp);
        return Arrays.toString(tipp);
    }
}