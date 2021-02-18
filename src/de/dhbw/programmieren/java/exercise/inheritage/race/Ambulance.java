package de.dhbw.programmieren.java.exercise.inheritage.race;

public class Ambulance extends Car{

    public boolean isBlaulicht() {
        return blaulicht;
    }

    public void setBlaulicht(boolean blaulicht) {
        this.blaulicht = blaulicht;
    }

    boolean blaulicht;

    public Ambulance(double speed, boolean blaulicht){
        super(speed);

        setSpeed(speed);
        this.blaulicht = blaulicht;

    }
}
