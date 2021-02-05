package de.dhbw.programmieren.java.exercise.arrays;

import java.util.Scanner;

public class DotProduct {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Anzahl derElemente n eingeben: ");
        int n = scanner. nextInt();

        int x[] = new int[n];
        int y[] = new int[n];
        int ergebnis = 0;

        for(int i = 0; i < x.length; i++){

            System.out.println("Bitte x_" + i + " eingeben:");
            x[i] = scanner.nextInt();

        }

        for(int i = 0; i < y.length; i++){

            System.out.println("Bitte x_" + i + " eingeben:");
            y[i] = scanner.nextInt();

        }

        if(x.length == y.length) {

            for (int i = 0; i < x.length; i++) {

                ergebnis += x[i]*y[i];

            }

        }

        System.out.println("Das Skalarpordukt von x und y ist " + ergebnis);

    }

}
