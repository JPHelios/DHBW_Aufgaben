package de.dhbw.programmieren.java.exercise.kontrollstrukturen;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie ist Dein Name? ");
        String name = scanner.next();

        Random random = new Random();


        while(true) {                                                                                                       //Spielschleife

            int randomInt = random.nextInt(100) + 1;
            int tryNumber = 0, input = 0;

            while (input != randomInt) {                                                                                    //Versuchsschleife
                ++tryNumber;
                System.out.println(name + ", rate eine Zahl [1-100]: ");
                input = scanner.nextInt();

                if (input == randomInt) {
                    System.out.println("Versuch " + tryNumber + ": " + input + " ist korrekt.");
                } else if (input > randomInt) {
                    System.out.println("Versuch " + tryNumber + ": " + input + " ist zu hoch.");
                } else {
                    System.out.println("Versuch " + tryNumber + ": " + input + " ist zu klein.");
                }

            }

            System.out.println("Was möchtest Du tun? \n 0 - Das Spiekl beenden \n 1 - Das Spiel fortsetzen");
            int decision = scanner.nextInt();

            if(decision == 0){
                break;
            } else {
                System.out.println("Spiel wird neu gestartet!");
            }
        }
    }


}
