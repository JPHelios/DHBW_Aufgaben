package de.dhbw.programmieren.java.exercise.arrays;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Anzahl der Elemente n eingeben: ");
        int anzahl = scanner.nextInt();

        int array[] = new int[anzahl];
        int temp;

        for(int i = 0; i < array.length; i++){

            System.out.println("Zahl " + i + " eingeben: ");
            array[i] = scanner.nextInt();

        }

        for(int i = 0; i < array.length; i++){

            for(int j = 1; j < (array.length-i); j++){

                if(array[j-1] > array[j]){

                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


    }

}
