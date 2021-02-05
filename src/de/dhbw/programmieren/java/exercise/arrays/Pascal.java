package de.dhbw.programmieren.java.exercise.arrays;

public class Pascal {

    public static void main(String[] args) {

        int num = 9;
        int matrix[] = new int[num+1];
        matrix[0] = 1;

        String ausgabe = "";

        for(int i = 0; i < num; i++) {

            for (int j = i + 1; j > 0; j--) {
                matrix[j] += matrix[j - 1];
            }

            for(int j = 0; j <= i; j++){
                ausgabe += matrix[j] + " ";
            }

            System.out.println(ausgabe);
            ausgabe = "";
        }
    }
}
