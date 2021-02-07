package de.dhbw.programmieren.java.exercise.strings;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        StringBuilder input = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Wort eingeben:");
        input.append(scanner.next());

        String normalInput = input.toString();

        input.reverse();
        String reverseInput = input.toString();
        System.out.println("Umgekehrt: " + reverseInput);

        if(normalInput.equalsIgnoreCase(reverseInput)) System.out.println(normalInput + " ist ein Palindrom");
        else System.out.println(normalInput + " ist kein Palindrom");

    }

}
