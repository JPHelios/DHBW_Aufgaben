package de.dhbw.programmieren.java.exercise.methods;

import de.dhbw.programmieren.java.exercise.klassen.mindgame.InputHelper;

public class Exponentiation {

    public static void main(String[] args){

        System.out.println("Geben Sie bitte die Basis ein: " );
        double base = InputHelper.getDoubleInput();

        System.out.println("Geben Sie bitte den positiven ganzzahligen Exponenten ein:");
        int exponent = InputHelper.getIntegerInput();

        double ergebnis = xPowerN(base, exponent);
        System.out.println(base + "^" + exponent + " = " + ergebnis);

    }

    public static double xPowerN(double x, int n){

        if(n==0) return 1;
        else return x * xPowerN(x, n-1);
    }
}
