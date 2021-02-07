package de.dhbw.programmieren.java.exercise.strings;

import java.util.Scanner;

public class CrossTotal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Zahl für Quersumme eingeben: ");
        String input = scanner.next();

        int quersumme = 0;

        String[] array = new String[input.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(input.charAt(i));
        }

        for (int i = 0; i < array.length; i++) {
            quersumme = quersumme + Integer.valueOf(array[i]);
        }

        System.out.println("Die Quersumme von " + input + " ist " + quersumme);

    }

}
