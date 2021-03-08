package de.dhbw.experriments;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CompareBubblesort {

//Unvollständig

    public static void main(String[] args){

        System.out.println("Programm beginnt ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Einträge soll das Array haben?");
        int n = scanner.nextInt();

        int[] array = new int[n];

        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
        }

        int[] var1 = Arrays.copyOf(array, array.length);
        int[] var2 = Arrays.copyOf(array, array.length);


        System.out.println("Variante 1:");
        normalBubblesort(var1);

        System.out.println();

        System.out.println("Variante 2:");
        indexBubblesort(var2);

    }

    public static void normalBubblesort(int[] array){

        int temp;
        long time1 = System.currentTimeMillis();
        for(int i = 0; i < array.length; i++){

            for(int j = 1; j < (array.length-i); j++){

                if(array[j-1] > array[j]){

                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }
            }
        }

        long time2 = System.currentTimeMillis();

        long time = time2 - time1;
        time = time / 1000;

        System.out.println("Dauer in Sekunden: " + time);
    }

    public static void indexBubblesort(int[] array){

        int temp;
        long time1 = System.currentTimeMillis();
        for(int i = 0; i < array.length; i++){

            for(int j = 1; j < (array.length-i); j++){

                if(array[j-1] > array[j]){

                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }
            }
        }

        long time2 = System.currentTimeMillis();

        long time = time2 - time1;
        time = time / 1000;

        System.out.println("Dauer in Sekunden: " + time);
    }
}
