package de.dhbw.programmieren.java.exercise.klassen.mindgame;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Yannik Schiebelhut
 * @editor Johannes Peters # 05.02.2021
 *
 */
public class InputHelper {


    public static double getDoubleInput() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid value of type double.");
            } catch (Exception a) {
                System.out.println("different error");
            }
        }
    }

    public static int getIntegerInput() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid value of type int.");
            }
        }
    }

    /**
     * @return
     */
    public static String getStringInput() {

        Scanner sc = new Scanner(System.in);

        while(true) {

            String input = sc.next();
            input = input.toUpperCase(Locale.ROOT);

            if(input.length() == 5) return input;
            else System.out.println("Bitte geben Sie eine Zeichenkette mit einer gültigen Länge ein");
        }
    }

}