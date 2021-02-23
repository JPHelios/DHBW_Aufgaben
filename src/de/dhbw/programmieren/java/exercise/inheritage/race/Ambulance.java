package de.dhbw.programmieren.java.exercise.inheritage.race;

public class Ambulance extends Car{

    boolean blaulicht;

    public Ambulance(double speed, boolean blaulicht){
        super(speed);

        this.blaulicht = blaulicht;
    }
}
