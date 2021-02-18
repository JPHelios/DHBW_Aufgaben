package de.dhbw.programmieren.java.exercise.inheritage.race;

public class Car extends Vehicle{

    public Car(double speed){

        this.wheels = 4;
        this.maxSpeed = 140;

        setSpeed(speed);

    }
}
