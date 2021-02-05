package de.dhbw.programmieren.java.exercise.arrays;

import java.util.Scanner;

public class Norm {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Anzahl der Elemente n eingeben: ");
        int n = scanner.nextInt();

        int array[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Bitte x_" + (i+1) + " eingeben: ");
            array[i] = scanner.nextInt();
        }

        float betrag = 0;

        for(int i = 0; i < array.length; i++){
            betrag += array[i]*array[i];
        }


        betrag = (float) Math.sqrt(betrag);

        System.out.println("Der Betrag von x ist " + betrag);

    }
}
