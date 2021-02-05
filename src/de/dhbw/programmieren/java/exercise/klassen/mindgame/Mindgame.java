package de.dhbw.programmieren.java.exercise.klassen.mindgame;

import java.util.Random;

public class Mindgame {

    String[] solution;
    boolean running;
    int numberOfTries;

    public Mindgame() {

        running = true;
        solution = new String[5];
        solution = creatSolution(solution);
        loop();

    }

    public static void main(String[] args) {

        Mindgame mindgame = new Mindgame();
    }

    public String[] creatSolution(String[] solution) {

        Random random = new Random();

        for (int i = 0; i < solution.length; i++) {
            int buchstabenIndex = random.nextInt(8);

            switch (buchstabenIndex) {
                case 0 -> solution[i] = "A";
                case 1 -> solution[i] = "B";
                case 2 -> solution[i] = "C";
                case 3 -> solution[i] = "D";
                case 4 -> solution[i] = "E";
                case 5 -> solution[i] = "F";
                case 6 -> solution[i] = "G";
                case 7 -> solution[i] = "H";
            }

            System.out.println(solution[i]);
        }

        return solution;

    }

    public void loop() {

        String[] inputTries = new String[20];
        String input;
        numberOfTries = 0;
        int x = 0;

        while (this.running) {

            numberOfTries++;

            System.out.println("Geben Sie ihren Tipp ab:");
            input = InputHelper.getStringInput();

            System.out.println(numberOfTries + " bisherige Versuche:");

            inputTries[numberOfTries - 1] = checkInput(input);

            for (int i = 0; i < inputTries.length; i++) {
                if (inputTries[i] != null) System.out.println(inputTries[i]);
            }
            System.out.println();

        }

    }

    public String checkInput(String input) {

        int richtigeBuchstabenAnRichtigerStelle = 0, richtigeBuchstabenAnFalscherStelle = 0;
        String[] cloneInput = new String[5];
        String[] cloneSolution = new String[5];

        for (int i = 0; i < input.length(); i++) {
            cloneInput[i] = String.valueOf(input.charAt(i));
        }

        cloneSolution = solution.clone();

        String[] arrayRichtigeBuchstabenAnFalscherStelle = new String[]{"F", "F", "F", "F", "F"};

        for (int i = 0; i < this.solution.length; i++) {

            String aktuellerBuchstabe = String.valueOf(input.charAt(i));

            if (aktuellerBuchstabe.equals(solution[i])) {
                richtigeBuchstabenAnRichtigerStelle++;
                arrayRichtigeBuchstabenAnFalscherStelle[i] = "R";
            }
        }

        if (richtigeBuchstabenAnRichtigerStelle == 5) gewonnen();

        for (int i = 0; i < solution.length; i++) {
            if (arrayRichtigeBuchstabenAnFalscherStelle[i].equals("R")) {
                cloneInput[i] = "";
                cloneSolution[i] = "";

            }
        }

        for (int i = 0; i < cloneSolution.length; i++) {
            if (cloneSolution[i] != "") {

                for (int j = 0; j < solution.length; j++) {

                    if (!(cloneInput[j].equals("")) & cloneSolution[i].equals(cloneInput[j])) {
                        richtigeBuchstabenAnFalscherStelle++;
                        cloneInput[j] = "";
                        cloneSolution[i] = "";
                        continue;
                    }
                }
            }
        }

        return input + " " + richtigeBuchstabenAnRichtigerStelle + " " + richtigeBuchstabenAnFalscherStelle;
    }

    public void gewonnen() {
        System.out.println("Mit " + numberOfTries + "Versuchen gewonnen!");
        System.exit(1);
    }
}