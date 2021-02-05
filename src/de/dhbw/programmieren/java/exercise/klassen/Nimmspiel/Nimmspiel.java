package de.dhbw.programmieren.java.exercise.klassen.Nimmspiel;

import java.util.Random;
import java.util.Scanner;

public class Nimmspiel {


    public Nimmspiel(String nameOne, String nameTwo){

        int anzahlKugeln = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Spieler playerOne = new Spieler(nameOne, 1);
        Spieler playerTwo = new Spieler(nameTwo, 2);

        playerOne.setAmZug(true);
        playerTwo.setAmZug(false);

        Haufen haufenOne = new Haufen(random.nextInt(10) + 1, 1);
        Haufen haufenTwo = new Haufen(random.nextInt(10) + 1, 2);

        while(haufenOne.getAnzahl() + haufenTwo.getAnzahl() != 0) {

            System.out.println();
            System.out.println("Spieler: " + playerOne.getPlayerName() + " und " + playerTwo.getPlayerName() + " Haufen 1: "
                    + haufenOne.getAnzahl() + " Kugel(n), Haufen 2: " + haufenTwo.getAnzahl() + " Kugel(n)");

            if (playerOne.amZug){
                playerOne.setAmZug(false);
                playerTwo.setAmZug(true);

                System.out.println("Spieler: " + playerOne.getPlayerName() + ": Von welchem Haufen ziehen Sie Kugeln?");
                int haufenIndex = scanner.nextInt();

                if(haufenIndex == haufenOne.getIndex()){

                    do {
                        anzahlKugeln = task(haufenOne,playerOne, anzahlKugeln);
                    } while (anzahlKugeln == 0);

                } else {

                    do {
                        anzahlKugeln = task(haufenTwo, playerOne, anzahlKugeln);
                    } while (anzahlKugeln == 0 );
                }

            } else {
                playerOne.setAmZug(true);
                playerTwo.setAmZug(false);

                System.out.println("Spieler: " + playerTwo.getPlayerName() + ": Von welchem Haufen ziehen Sie Kugeln?");
                int haufenIndex = scanner.nextInt();

                if(haufenIndex == haufenOne.getIndex()){

                    do {
                        anzahlKugeln = task(haufenOne, playerTwo, anzahlKugeln);
                    } while (anzahlKugeln == 0 );

                } else {

                    do {
                        anzahlKugeln = task(haufenTwo, playerTwo, anzahlKugeln);
                    } while (anzahlKugeln == 0 );
                }
            }
        }

        if(haufenOne.getAnzahl() + haufenTwo.getAnzahl() == 0){
            System.out.println("Herzlichen Glückwunsch");

            if(!playerOne.getAmZug()){
                System.out.println(playerOne.getPlayerName() + " hat gewonnen");
            } else {
                System.out.println(playerTwo.getPlayerName() + " hat gewonnen");
            }
        }
    }

    public static int task(Haufen aktuellerHaufen, Spieler aktuellerSpieler, int anzahlKugeln){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Spieler: " + aktuellerSpieler.getPlayerName() + ": Wieviele Kugeln ziehen Sie?");

        anzahlKugeln = scanner.nextInt();

        if (aktuellerHaufen.getAnzahl() - anzahlKugeln >= 0) {
            aktuellerHaufen.setAnzahl(aktuellerHaufen.getAnzahl() - anzahlKugeln);
        } else anzahlKugeln = 0;

        return anzahlKugeln;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Herzlich Willkommen zum Nimmspiel der Extra-Klasse");
        System.out.println("Bitte geben Sie den Namen des ersten Spielers ein:");
        String nameOne = scanner.next();
        System.out.println("Bitte geben Sie den Namen des zweiten Spielers ein:");
        String nameTwo = scanner.next();
        System.out.println("Los geht's!");
        System.out.println();

        new Nimmspiel(nameOne, nameTwo);

    }
}
