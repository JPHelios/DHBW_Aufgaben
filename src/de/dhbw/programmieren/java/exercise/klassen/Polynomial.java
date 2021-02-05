package de.dhbw.programmieren.java.exercise.klassen;

public class Polynomial {

    double a;
    double b;
    double c;

    public Polynomial(double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public static void main(String[] args){
        Polynomial p1 = new Polynomial(2,0,0);
        Polynomial p2 = new Polynomial(0,-4,1);


        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);

        Polynomial p3 = Addition(p1, p2);
        System.out.println("P3 = P1 + P2: " + p3);

        Polynomial p4 = Multiplication(p3);
        System.out.println("P3 = 2.0 * P3: " + p4);

        Nullstellen(p4);
    }



    public String toString(){
        if(this.b >= 0) {
            return this.a + "x^2 +" + this.b + "x +" + this.c;
        } else {
            return this.a + "x^2 " + this.b + "x +" + this.c;
        }
    }

    private static Polynomial Addition(Polynomial poly1, Polynomial poly2){
        return new Polynomial(poly1.a  + poly2.a, poly1.b + poly2.b, poly1.c + poly2.c);
    }

    private static Polynomial Substraction(Polynomial poly1, Polynomial poly2){
        return new Polynomial(poly1.a  - poly2.a, poly1.b - poly2.b, poly1.c - poly2.c);
    }

    private static Polynomial Multiplication(Polynomial poly){
        return new Polynomial(2.0 * poly.a, 2.0 * poly.b, 2.0 * poly.c);
    }

    private static void Nullstellen(Polynomial polynomial) {

        double n1 = ((-polynomial.b) + Math.sqrt(polynomial.b * polynomial.b - 4 * polynomial.a * polynomial.c)) / (2 * polynomial.a);
        double n2 = ((-polynomial.b) - Math.sqrt(polynomial.b * polynomial.b - 4 * polynomial.a * polynomial.c)) / (2 * polynomial.a);

        System.out.println("Nullstellen von P3: " + polynomial + ":");
        System.out.println(n1 + " | " + n2);

    }
}
