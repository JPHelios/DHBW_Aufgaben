package de.dhbw.programmieren.java.exercise.klassen;

import java.util.Random;

public class Complex {

    double real;
    double imag;

    private Complex(double real, double imag){
        this.real = real;
        this.imag = imag;

    }



    @Override
    public String toString(){
        return "Complex " + this.real + " + " + this.imag +"i";
    }

    public double getReal(){
        return this.real;
    }

    public double getImag(){
        return this.imag;
    }

    private Complex add(Complex complex){

        double real, imag;

        real = this.real + complex.real;
        imag = this.imag + complex.imag;

        return new Complex(real, imag);

    }

    private Complex sub(Complex complex){

        double real, imag;

        real = this.real - complex.real;
        imag = this.imag - complex.imag;

        return new Complex(real, imag);

    }

    private Complex mult(Complex complex){

        double real, imag;

        real = this.real * complex.real;
        imag = this.imag * complex.imag;

        return new Complex(real, imag);

    }

    private Complex div(Complex complex){

        double real, imag;

        real = this.real / complex.real;
        imag = this.imag / complex.imag;

        return new Complex(real, imag);

    }

    private boolean isGroesser(Complex complex){
        return this.real > complex.real;
    }

    private double getMagnitude(){
        double magitude;
        magitude = Math.sqrt(this.getReal()* this.getReal() + this.getImag() * this.getImag());
        return Math.round(1000 * magitude) / 1000.0d;
    }



    public static void main(String[] args){

        Complex c1 = new Complex(1.0, 2.0);
        System.out.println("C1:\t\t\t" + c1);
        Complex c2= new Complex(2.0, 1.0);
        System.out.println("C2:\t\t\t" + c2);

        Complex c3 = c1.add(c2);
        System.out.println("C1 + C2:\t" + c3);

        Complex c4 = c1.div(c2);
        System.out.println("C1 - C2:\t" + c4);

        Complex c5 = c1.mult(c2);
        System.out.println("C1 * C2:\t" + c5);

        Complex c6 = c1.div(c2);
        System.out.println("C1 / C2:\t" + c6);

        boolean groesser = c1.isGroesser(c2);
        System.out.println("C1<C2?: \t" + groesser);

        System.out.println("Unsortiert:");

        Complex[] complexArray = new Complex[10];
        Random random = new Random();

        for (int i = 0; i < complexArray.length; i++) {

            double real, imag;

            real = random.nextDouble() * 10;
            real = Math.round(1000 * real) / 1000d;
            imag = random.nextDouble() * 10;
            imag = Math.round(1000 * imag) / 1000d;

            complexArray[i] = new Complex(real,imag);
        }

        for (Complex complex : complexArray) {
            System.out.println(complex + "\t Betrag: " + complex.getMagnitude());
        }

        System.out.println("Sortiert:");

        Complex tmp;

        for(int i = 0; i < complexArray.length; i++){
            for(int j = 1; j < (complexArray.length-i); j++){

                if(complexArray[j-1].getMagnitude() > complexArray[j].getMagnitude()){

                    tmp = complexArray[j-1];
                    complexArray[j-1] = complexArray[j];
                    complexArray[j] = tmp;

                }
            }
        }

        for (Complex complex : complexArray) {
            System.out.println(complex + "\t Betrag: " + complex.getMagnitude());
        }
    }
}