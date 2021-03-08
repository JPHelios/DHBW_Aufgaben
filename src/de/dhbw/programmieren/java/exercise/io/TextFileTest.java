package de.dhbw.programmieren.java.exercise.io;

import java.io.IOException;


public class TextFileTest {

    public static void main(String[]args) throws IOException,
            LineNumberOutOfBoundsException {
        TextFile a = new TextFile("src/de/dhbw/programmieren/java/exercise/io/input.txt");
        // Anzahl der Zeilen
        System.out.println("Test");
        System.out.println("Anzahl der Zeilen: "+a.availableLines());
        // Erste Zeile
        System.out.println("Zeile 1: " + a.getLine(1));
        // F�nfte Zeile
        System.out.println("Zeile 5: " + a.getLine(5));
        // Alle Zeilen
        System.out.println("Alle Zeilen: ");
        for(String line : a.getLines())
            System.out.println(line);
        // Ersetzen von "meine" durch "unsre"
        a.replaceAll("meine", "unsre");
        // Datei schreiben
        // a.write();
        System.out.println("Alle Zeilen nach dem Ersetzen: ");
        for(String line : a.getLines())
            System.out.println(line);
        a.close();
    }

}

