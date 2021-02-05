package de.dhbw.programmieren.java.exercise.kontrollstrukturen;

public class ShoeSize {

    public static void main(String[] args){

        double uGrenze, oGrenze;

        System.out.println("Zentimeter     |  Größe");
        System.out.println("---------------+--------");

        for(int groesse = 30; groesse < 50; groesse++){

            oGrenze = groesse / 1.5d;
            oGrenze = Math.round(100.0 * oGrenze) / 100.0d;
            uGrenze = (groesse - 1) / 1.5d;
            uGrenze = Math.round(100.0 * uGrenze) / 100.0d;
            System.out.printf( "%1.2f - %1.2f  |  " + groesse + "\n" , uGrenze, oGrenze);

        }

    }

}
