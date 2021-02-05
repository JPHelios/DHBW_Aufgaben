package de.dhbw.programmieren.java.exercise.klassen;

import java.util.Random;
import java.util.Scanner;

public class Horner {

    Random random = new Random();
    int grad;
    double[] horner;


    public Horner(int grad){

        horner = new double[grad+1];

        for(int i = 0; i < horner.length; i++){
            //double tmp = (random.nextDouble()* 100);
            double tmp = (double) random.nextInt(6);
            horner[i] = Math.round(tmp);
            System.out.println(horner[i]);
        }
    }

    public double getValue(double x){

        double erg = 0;
        // double erg = horner[horner.length-1];

        for(int i = this.horner.length-1; i >=  0; i--){

            //erg = horner[i] + x * erg;
            if(i != 0) erg = x * horner[i] + x * erg;
            else erg = erg + horner[i];
        }

        return erg;

    }

    @Override
    public String toString(){

        StringBuilder string = new StringBuilder();

        for(int i = this.horner.length-1; i >= 0; i--){
            string.append(" +").append(this.horner[i]).append("*x^").append(i);
        }
        return string.toString();
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Grad des Polynoms ein:");
        int grad = scanner.nextInt();

        Horner polynom = new Horner(grad);

        System.out.println(polynom);
        System.out.println("f(1.5) = " + polynom.getValue(1.5));

    }
}
