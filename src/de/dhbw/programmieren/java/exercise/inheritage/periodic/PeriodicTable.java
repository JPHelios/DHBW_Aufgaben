package de.dhbw.programmieren.java.exercise.inheritage.periodic;

import java.util.Arrays;

public class PeriodicTable {

    Element[] periodicTable = new Element[119];

    public void addElement(Element e){
        if(periodicTable[e.getOrdinal()] == null){
            periodicTable[e.getOrdinal()] = e;
        }

    }

    public boolean hasElement(int o){
        if(periodicTable[o] != null) return true;
        else return false;
    }

    public Element getElement(int o){

        if(periodicTable[o] != null) return periodicTable[o];
        else return null;
    }

    public Element[] getMetals(){

        int metals = 0;
        for(int i = 0; i < periodicTable.length; i++) {

            if (periodicTable[i] != null) {
                if (periodicTable[i].getClass().getSimpleName().equals("Metal")) metals++;
            }
        }

        Metal[] metalArray = new Metal[metals];
        metals = 0;

        for(int i = 0; i < periodicTable.length; i++){
            if (periodicTable[i] != null) {
                if (periodicTable[i].getClass().getSimpleName().equals("Metal")) {
                    metalArray[metals] = (Metal) periodicTable[i];
                    metals++;
                }
            }
        }
        return metalArray;
    }


    public static void main(String[] args) {

        PeriodicTable pt = new PeriodicTable();

        Metal Tellur = new Metal("Tellur", "Te", 52, '0',1,true, true, 0.005);
        Element Wasserstoff = new Element("Wasserstoff", "H", 1, 'K', 3, true);

        pt.addElement(Wasserstoff);
        pt.addElement(Tellur);
        //pt.addElement(new Metal("Tellur", "Te", 52, '0',1,true, true, 0.005));

        pt.getMetals();

        System.out.println(Arrays.toString(pt.getMetals()));
    }
}
