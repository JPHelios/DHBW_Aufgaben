package de.dhbw.programmieren.java.exercise.arrays;

public class Fibonacci {

    public static void main(String[] args) {

        long array[] = new long[50];
        array[0] = 1;
        array[1] = 1;

        for(int i = 2; i < array.length; i++){
            array[i] = array[i-1] + array[i-2];
        }

        for(int i = 0; i < array.length; i++){
            System.out.println("Zahl " + (i+1) + ": " + array[i]);
        }

    }

}
