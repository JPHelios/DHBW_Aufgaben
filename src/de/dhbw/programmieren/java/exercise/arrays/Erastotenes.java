package de.dhbw.programmieren.java.exercise.arrays;

import java.util.Scanner;

public class Erastotenes {
    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Grenze n ein");
        int grenze = scanner.nextInt();
        int prime = 0;
        int min;

        boolean sieve[] = new boolean[grenze+1];
        boolean primes[] = new boolean[grenze+1];

        for(int i = 0; i < sieve.length; i++){

            sieve[i] = true;
            primes[i] = false;

        }

        for(int i = 2; i < sieve.length; i++){

            if(sieve[i] == true ){

                min = i;
                primes[min] = true;

                for(int j = i; j < sieve.length; j++){

                    if(j*i < sieve.length) {
                        sieve[j * i] = false;
                    }

                }

            }

        }


        for(int i = 0; i < primes.length; i++){

            if(primes[i]) {
                System.out.println(i);
            }
        }


    }

}
