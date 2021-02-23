package de.dhbw.programmieren.java.exercise.inheritage.race;

public class Vehicle {

    int wheels;
    double maxSpeed;
    double speed;
    double position;

    public Vehicle(){

        this.wheels = 0;
        this.maxSpeed = 0;
        this.position = 0;

    }

    public void setSpeed(double speed) {

        if(speed <= maxSpeed) this.speed = speed;
        else this.speed = maxSpeed;

        if(speed < 0) this.speed = 0;
    }

    public void drive(double minutes){

        this.position = this.position + minutes * (this.speed/60);

    }

    @Override
    public String toString(){

        return this.getClass().getSimpleName() + " at position " + position + " km with " + wheels + " at speed " + speed + " km/h of max. " + maxSpeed + " km/h.";
    }



}
