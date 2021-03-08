package de.dhbw.programmieren.java.exercise.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextfileLines {

    public static void main(String[] args){

        int count = 1;
        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/de/dhbw/programmieren/java/exercise/io/input.txt"))) {
            while(reader.ready()) {

                String s = reader.readLine();
                if(count >= 2 && count <= 5){
                    System.out.println(s);
                    result.append(s);
                }

                count++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;

        String resultString = String.valueOf(result);
        resultString = resultString.replace(" ","");
        System.out.println("Zeile 2-5: " + resultString);

    }

}
