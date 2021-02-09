package de.dhbw.programmieren.java.exercise.strings;

import java.util.Scanner;

public class RomanNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine röm. Zahl ein:");
        StringBuffer input = new StringBuffer();
        StringBuffer cutOut = new StringBuffer();

        String staticInput = input.toString();

        input.append(scanner.next());

        int wert = 0;

        for(int i = 1; i < input.length(); i++){

            String tmp = input.charAt(i - 1) + String.valueOf(input.charAt(i));

            switch (tmp) {
                case "IV" -> {
                    wert = wert + 4;
                    cutOut.append(i - 1).append(i);
                }
                case "IX" -> {
                    wert = wert + 9;
                    cutOut.append(i - 1).append(i);
                }
                case "XL" -> {
                    wert = wert + 40;
                    cutOut.append(i - 1).append(i);
                }
                case "XC" -> {
                    wert = wert + 90;
                    cutOut.append(i - 1).append(i);
                }
                case "CD" -> {
                    wert = wert + 400;
                    cutOut.append(i - 1).append(i);
                }
                case "CM" -> {
                    wert = wert + 900;
                    cutOut.append(i - 1).append(i);
                }
            }
        }

        String cutOutString = cutOut.toString();

        for(int i = cutOut.length()-1; i >= 0; i--){
            int tmpInt = Integer.valueOf(String.valueOf(cutOutString.charAt(i)));
            input.deleteCharAt(tmpInt);
        }

        for(int i = 0; i < input.length(); i++){
            String tmp = String.valueOf(input.charAt(i));

            switch (tmp){
                case "M" -> wert = wert + 1000;
                case "D" -> wert = wert + 500;
                case "C" -> wert = wert + 100;
                case "L" -> wert = wert + 50;
                case "X" -> wert = wert + 10;
                case "V" -> wert = wert + 5;
                case "I" -> wert = wert + 1;
            }
        }

        System.out.println("Der Wert der Zahl " + staticInput + " ist " + wert);
    }
}
