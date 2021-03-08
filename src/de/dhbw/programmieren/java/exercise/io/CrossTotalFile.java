package de.dhbw.programmieren.java.exercise.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class CrossTotalFile {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Zahl für Quersumme eingeben: ");
        String input = scanner.next();

        int quersumme = 0;

        String[] array = new String[input.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(input.charAt(i));
        }

        for (int i = 0; i < array.length; i++) {
            quersumme = quersumme + Integer.valueOf(array[i]);
        }

        System.out.println("Die Quersumme von " + input + " ist " + quersumme);

        //Output-Stream

        try (Writer writer = new FileWriter("src/de/dhbw/programmieren/java/exercise/io/output.txt", true)) {
            writer.write("Quersumme von " + input + " ist " + quersumme + System.lineSeparator());
        }


    }

}
