package de.dhbw.programmieren.java.exercise.inheritage.race;

public class RacingCar extends Car{

    public RacingCar(double speed){
        super(speed);

        this.maxSpeed = 220;

        setSpeed(speed);

    }
}
