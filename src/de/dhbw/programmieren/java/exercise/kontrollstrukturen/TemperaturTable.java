package de.dhbw.programmieren.java.exercise.kontrollstrukturen;

public class TemperaturTable {

    public static void main(String[] args){

        float c;




        for(int f=0; f<301; f++){

            c = ((float) 5/9)*(f-32);
            c = Math.round(100.0 * c) / 100.0f;
            System.out.println(f + "      |   " + c + "     ");

        }


    }
}
