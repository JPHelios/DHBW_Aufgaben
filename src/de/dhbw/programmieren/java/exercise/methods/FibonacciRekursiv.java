package de.dhbw.programmieren.java.exercise.methods;

import de.dhbw.programmieren.java.exercise.klassen.mindgame.InputHelper;

public class FibonacciRekursiv {

    public static void main(String[] args){

        System.out.println("Wie viele Fibonacci-Zahlen sollen berechnet werden?");
        int anzahl = InputHelper.getIntegerInput();

        int f1 = 1, f2 = 1;

        long timeStart = System.currentTimeMillis();
        int ergebnis = recursiveFibonacci(f1, f2, anzahl);
        long timeEnd = System.currentTimeMillis();
        //System.out.println("F( " + f1 + " ) = " + f1);
        System.out.println("Zeitaufwand:" + (timeEnd - timeStart));
        System.out.println(ergebnis);
    }

    public static int recursiveFibonacci(int f1, int f2, int n){
        System.out.println("");
        if(n==2){
            return f2;
        } else {
            return recursiveFibonacci(f2, f1 + f2, n-1 );
        }
    }
}
