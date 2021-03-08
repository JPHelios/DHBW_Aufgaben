package de.dhbw.programmieren.java.exercise.io;

import java.io.*;
import java.util.Scanner;

public class PalindromeFile {

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

        boolean dublicate = false;

        try (Writer writer = new FileWriter("src/de/dhbw/programmieren/java/exercise/io/palindrome.txt", true)){

            try(BufferedReader reader = new BufferedReader(new FileReader("src/de/dhbw/programmieren/java/exercise/io/palindrome.txt"))) {
                while(reader.ready()){
                    String line = reader.readLine();

                    if(line.equalsIgnoreCase(normalInput)) {
                        dublicate = true;
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (!dublicate) writer.write(normalInput);
            else System.out.println("Das Palindrome wurde bereits entdeckt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nEs wurden bis jetzt folgende Palindrome gefunden");
        try(BufferedReader reader = new BufferedReader(new FileReader("src/de/dhbw/programmieren/java/exercise/io/palindrome.txt"))) {
            while(reader.ready()){
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
