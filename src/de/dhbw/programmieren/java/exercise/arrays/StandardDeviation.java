package de.dhbw.programmieren.java.exercise.arrays;

import java.util.Random;

public class StandardDeviation {



    public static void main(String[] args){

        Random random = new Random();
        int array[] = new int[100];
        int mSumme = 0, sSumme = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        for(int i = 0; i < array.length; i++){
            mSumme += array[i];
        }

        float mittelwert = mSumme / array.length;
        System.out.println("Mittelwert: " + mittelwert);

        for(int i = 0; i < array.length; i++){
            sSumme += (array[i] - mittelwert)*(array[i]-mittelwert);
        }

        sSumme = sSumme / (array.length) -1;
        float standardabweichung = (float) Math.sqrt(sSumme);
        System.out.println("Standardbweichung: " + standardabweichung);
    }

}
