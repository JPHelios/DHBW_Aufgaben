package de.dhbw.programmieren.java.exercise.kontrollstrukturen;

import java.util.Scanner;

public class quatratischeFunktion {

    public static void main(String[] args){

        double xF1, xF2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie a ein: ");
        float a = scanner.nextFloat();
        System.out.println("Bitte geben Sie b ein: ");
        float b = scanner.nextFloat();
        System.out.println("Bitte geben Sie c ein: ");
        float c = scanner.nextFloat();

        scanner.close();


        //Fall 1

        if (a == 0){
            if (b == 0 ){
                System.out.println("Die Gleichung ist degeneriert.");
            } else {
                xF1 = - (c / b);
                System.out.println(xF1);
            }


        } else {
            float D = b*b - 4*a*c;

            if (D >= 0 ){
                xF1 =  ((-b+Math.sqrt(D)) / (2*a));
                xF2 = ((-b-Math.sqrt(D)) / (2*a));

                System.out.println(xF1 + " " + xF2);
            } else {
                System.out.println("Die Lösung ist konjungiert komplex");
            }

        }


    }

}
