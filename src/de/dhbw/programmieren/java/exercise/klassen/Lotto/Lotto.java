package de.dhbw.programmieren.java.exercise.klassen.Lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

    int m, n;
    int[] lottozahlen;

    public Lotto(int m, int n){

        this.m = m;
        this.n = n;

        lottozahlen = new int[m];

    }

    public void ziehen(){

        Random random = new Random();
        boolean einfuegen;

        for(int i = 0; i < lottozahlen.length; i++){ //Einzelne Eingaben
            do { //Prüfung der Gültigkeit der Eingabe

                einfuegen = true;

                System.out.println("Geben Sie bitte Ihren Tipp für die " + (i + 1) + ". Zahl ein:");
                int zug = random.nextInt(49) + 1;

                for (int k : lottozahlen) {
                    if (k == zug) einfuegen = false;
                }

                if (einfuegen) lottozahlen[i] = zug;

            } while (!einfuegen);
        }
    }

    public int richtig(int[] tipp){

        int richtige = 0;

        for (int k : lottozahlen) {
            for (int i : tipp) {

                if (k == i) richtige++;

            }
        }

        return richtige;
    }

    @Override
    public String toString(){

        Arrays.sort(lottozahlen);
        return Arrays.toString(lottozahlen);
    }

    public static void main(String[] args){

        Lotto deutschesLotto = new Lotto(6, 49);
        Tipp meinTipp = new Tipp(deutschesLotto.m);

        deutschesLotto.ziehen();
        System.out.println(meinTipp);

        System.out.println();

        System.out.println(meinTipp);
        System.out.println(deutschesLotto);

        System.out.println();

        System.out.println("Richtige: " + deutschesLotto.richtig(meinTipp.tipp));
    }
}