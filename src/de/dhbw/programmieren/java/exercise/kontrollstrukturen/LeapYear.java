package de.dhbw.programmieren.java.exercise.kontrollstrukturen;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


            System.out.println("Bitte gebe das Jahr ein");
            int jahr = scanner.nextInt();


            if ((jahr % 4 == 0 & jahr % 100 != 0) | jahr % 400 == 0) {
                System.out.println(jahr + " ist ein Schaltjahr");
            } else {
                System.out.println(jahr + " ist kein Schaltjahr");
            }

    }
}