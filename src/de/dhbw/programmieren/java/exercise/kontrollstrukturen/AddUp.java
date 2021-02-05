package de.dhbw.programmieren.java.exercise.kontrollstrukturen;

import java.util.Scanner;

//###########################################################################################################################################################
//#Warum muss man beim Scanner immer ein System.out.println() schreiben und warum funktioniert ein Scanner ohne vorherige Consolenausgabe von Text nicht??? #
//###########################################################################################################################################################

public class AddUp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int calculation = 0, insert;

        while(true) {

            System.out.println("Zahl eingeben (<0 für Abbruch): ");
            insert = scanner.nextInt();

            if(insert < 0 ) {
                System.out.println("Summe: " + calculation);
                break;
            }

            calculation = calculation + insert;
        }
    }
}
