package de.dhbw.programmieren.java.exercise.hausaufgabeVorlesung1;

import java.util.Scanner;

public class Easter {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die gewünschte Jahreszahl ein: ");
        int jahr = scanner.nextInt();
        String ausgabe;

        int a = jahr % 19;
        int b = jahr % 4;
        int c = jahr % 7;
        int k = jahr / 100;
        int p = (8*k + 13) / 25;
        int q = k / 4;
        int m = (15 + k - p - q) % 30;
        int n = (4 + k - q) % 7;
        int d = (19*a + m) % 30;
        int e = (2*b + 4*c + 6*d + n) % 7;
        int ostern = (22 + d + e);

        System.out.println("Ostersonntag ist im Jahr " + jahr + " am " + (ostern>31?ostern-31:ostern) + "." + (ostern>31?" April":" März"));

        /*if(ostern > 31){
            ostern = ostern - 31;
            ausgabe = "Ostern ist in diesem Jahr am " + String.valueOf(ostern) + " April";
        } else {
            ausgabe = "Ostern ist in diesem Jahr am " + String.valueOf(ostern) + " März";
        }*/

    }

}


