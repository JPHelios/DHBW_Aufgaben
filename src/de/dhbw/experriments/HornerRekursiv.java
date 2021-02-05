package de.dhbw.experriments;

import java.util.Random;
import java.util.Scanner;

public class HornerRekursiv {

    Random random = new Random();
    int grad;
    double[] horner;


    public HornerRekursiv(int grad){

        horner = new double[grad+1];

        for(int i = 0; i < horner.length; i++){
            //double tmp = (random.nextDouble()* 100);
            /*double tmp = (double) random.nextInt(6);
            horner[i] = Math.round(tmp);
            System.out.println(horner[i]);*/

            horner[i] = (double) i+1;
            System.out.println(horner[i]);
        }
    }

    public double getValueNormal(double x){

        double erg = 0;
        // double erg = horner[horner.length-1];

        for(int i = this.horner.length-1; i >=  0; i--){

            //erg = horner[i] + x * erg;
            if(i != 0) erg = x * horner[i] + x * erg;
            else erg = erg + horner[i];
        }

        return erg;

    }

    public double getValue(double x){
        return horner[0] + x * getValue(x, 1);
    }

    public  double getValue(double x, int i){

        if(i == horner.length){
            return 0;
        } else {
            return horner[i] + x * getValue(x, i + 1);
        }
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

        HornerRekursiv polynom = new HornerRekursiv(grad);

        System.out.println(polynom);
        System.out.println("f(1.5) = " + polynom.getValue(1.5));
        System.out.println("f(1.5) Normal = " + polynom.getValueNormal(1.5));


    }
}

