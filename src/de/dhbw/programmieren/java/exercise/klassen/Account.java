package de.dhbw.programmieren.java.exercise.klassen;

public class Account {

    private int kontonummer;
    private String name;
    private double kontostand;
    private int limit;



    public static void main(String[] args) {
        Account account = new Account(4711, "Donald Duck", 500, 1000);
        System.out.println(account);
        account.processDeposit(200);
        System.out.println(account);
        account.processPayment(400);
        System.out.println(account);
        account.processPayment(2000);
        System.out.println(account);

    }



    public Account(int kontonummer, String name, double kontostand, int limit){
        super();

        this.kontonummer = kontonummer;
        this.name = name;
        this.kontostand = kontostand;
        this.limit = limit;

    }

    public String toString(){
        return "Konto Nr. " + kontonummer + " (" + name +"), Stand: " + kontostand + " ct, Limit " + limit + " ct";

    }

    public void processDeposit(double input){
        if(input >= 0){
            this.kontostand = kontostand + input;
        }
    }


    public void processPayment(double output){
        if(!(kontostand - output < -1000)) {
            this.kontostand = kontostand - output;
        } else {
            System.out.println("\033[31mDeckung nicht ausreichend!\033[0m.");



        }
    }
}
