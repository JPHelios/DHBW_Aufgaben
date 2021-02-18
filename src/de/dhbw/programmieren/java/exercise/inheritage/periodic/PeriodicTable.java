package de.dhbw.programmieren.java.exercise.inheritage.periodic;

public class PeriodicTable {

    public static void main(String[] args) {

        Metal Tellur = new Metal("Tellur", "Te", 52, '0',1,true, true, 0.005);
        Element Wasserstoff = new Element("Wasserstoff", "H", 1, 'K', 3, true);

        System.out.println(Tellur);
        System.out.println(Wasserstoff);
    }

}
