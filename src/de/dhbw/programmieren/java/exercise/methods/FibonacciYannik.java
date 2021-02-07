package de.dhbw.programmieren.java.exercise.methods;

import de.dhbw.programmieren.java.exercise.klassen.mindgame.InputHelper;

public class FibonacciYannik {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Wie viele Fibonacci-Zahlen berechnen? ");
        int n = InputHelper.getIntegerInput();
        if (n < 1) {
            System.out.println("cannot calculate values for negative n");
        } else {

            long timeStart = System.currentTimeMillis();
            for (int i = 1; i <= n; i++) {
                System.out.printf("F(%d) = %d\n", i, fibonacci(i));
            }
            long timeEnd = System.currentTimeMillis();

            System.out.println("Zeitaufwand:" + (timeEnd - timeStart));
        }
    }

    public static int fibonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

}