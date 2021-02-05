package de.dhbw.programmieren.java.exercise.kontrollstrukturen;

public class MultiplicationTable {

    public static void main(String[] args){

        int x= 1, y = 1;
        String erg = "";


        for(int i= 1; i<=10; i++){

            erg = "";

            for(int j = 1; j <=10; j++){

                erg = erg + "\t" + i*j;

            }

            System.out.println(erg);
        }
    }
}
