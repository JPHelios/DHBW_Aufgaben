package de.dhbw.programmieren.java.exercise.arrays;

import java.util.Random;
import java.util.Scanner;

public class MatrixSubtraction {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Anzahl der Zeilen n eingeben: ");
        int n = scanner.nextInt();
        System.out.println("Bitte Anzahl der Spalten m eingeben: ");
        int m = scanner.nextInt();

        int[][] xMatrix = new int[n][m];
        int[][] yMatrix = new int[n][m];
        int[][] xyMatrix = new int[n][m];

        String xMatrixString = "", yMatrixString = "", xyMatrixString = "";

        Random random = new Random();

        for(int i = 0; i< xMatrix.length; i++){
            for(int j = 0; j < xMatrix[i].length; j++){
                xMatrix[i][j] = random.nextInt(100);
                yMatrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("X:");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){

                xMatrixString += xMatrix[i][j] + "\t";

            }
            System.out.println(xMatrixString);
            xMatrixString = "";
        }

        System.out.println();
        System.out.println("Y:");

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                yMatrixString += yMatrix[i][j] + "\t";
            }

            System.out.println(yMatrixString);
            yMatrixString = "";
        }

        System.out.println();
        System.out.println("X-Y");

        for(int i = 0; i< xyMatrix.length; i++){
            for(int j = 0; j < xyMatrix[i].length; j++){
                xyMatrix[i][j] = xMatrix[i][j] - yMatrix[i][j];
                xyMatrixString += xyMatrix[i][j] + "\t";
            }

            System.out.println(xyMatrixString);
            xyMatrixString = "";
        }
    }
}
