package de.dhbw.programmieren.java.exercise.klassen;

public class Point {

    double x;
    double y;


    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point pointA = new Point(4.0, 2.0);
        System.out.println("A: " + pointA);
        Point pointB = new Point(-1.0, -1.0);
        System.out.println("B: " + pointB);
        System.out.println("Abstand A-B: " + pointA.getDistance(pointB));
        pointA = pointA.mirrorOrigin();
        System.out.println("A': " + pointA);
        System.out.println("Abstand A’-B: " + pointA.getDistance(pointB));
    }


    @Override
    public String toString(){
        return this.x + " / " + this.y;
    }

    private double getDistance(Point point) {
        return Math.sqrt((this.x - point.x) * (this.x - point.x)+(this.y - point.y) * (this.y - point.y));
    }

    private double getDistanceToOrigin(){
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    private Point mirrorX(){
        double y;

        if(this.y > 0) y = -this.y;
        else if(this.y < 0) y = Math.abs(this.y);
        else y = this.y;

        return new Point(this.x, y);
    }

    private Point mirrorY(){
        double x;

        if(this.x > 0) x = -this.x;
        else if(this.x < 0) x = Math.abs(this.x);
        else x = this.x;

        return new Point(x, this.y);
    }

    private Point mirrorOrigin() {

        double x;
        double y;

        if(this.x > 0) x = -this.x;
        else if(this.x < 0) x = Math.abs(this.x);
        else x = this.x;

        if(this.y > 0) y = -this.y;
        else if(this.y < 0)y = Math.abs(this.y);
        else y = this.y;

        return new Point(x, y);
    }


}
