package de.dhbw.programmieren.java.exercise.kontrollstrukturen;

import java.util.Scanner;

public class Babylon {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wurzel aus Welcher Zahl ziehen?");
        float a = scanner.nextFloat();
        float xn = 1;

        if(a == 0 ) {
            System.out.println("0 ist eine ungültige Eingabe");
            System.exit(0);
        }


        for(int i = 0; i<=6;i++){

            //System.out.println("xn: " + xn);
            System.out.printf( "xn: %1.14f\n", xn);
            xn = (xn+ (a/xn)) / 2;

            if(xn < 1E+06){
                break;
            }
        }

        xn = Math.abs(xn);
        System.out.printf("\nDie Wurzel aus " + a + " ist %1.3f", xn);
    }
}
