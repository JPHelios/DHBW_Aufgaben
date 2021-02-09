package de.dhbw.programmieren.java.exercise.methods;

import java.util.Arrays;

public class Quicksort {


    public static void main(String[] args) {
        int[] daten = {9, 2, 5, 7, 8, 3, 4, 10, 1, 6};

        System.out.println(Arrays.toString(daten));
        quicksort(0, daten.length-1, daten);
        System.out.println(Arrays.toString(daten));


    }

    public static void quicksort(int links, int rechts, int[] daten){

        if(links < rechts){

            int teiler = teile(links,rechts, daten);
            quicksort(links, teiler-1, daten);
            quicksort(teiler+1, rechts, daten);

        }
    }

    public static int teile(int links, int rechts, int[] daten){

        int i = links;
        int j = rechts - 1;
        int pivot = daten[rechts];

        do {
            while (daten[i] <= pivot & i < rechts) i = i + 1;
            while (daten[j] >= pivot & j > links) j = j - 1;

            if (i < j) {
                int tmp = daten[i];
                daten[i] = daten[j];
                daten[j] = tmp;

            }
        } while (i < j);

        if(daten[i] > pivot){

            int tmp = daten[i];
            daten[i] = daten[rechts];
            daten[rechts] = tmp;

        }

        return i;
    }
}
