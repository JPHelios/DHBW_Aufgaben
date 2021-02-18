package de.dhbw.programmieren.java.exercise.inheritage.race;

public class Bicycle extends Vehicle{

        public Bicycle(double speed){

            this.wheels = 2;
            this.maxSpeed = 30;

            setSpeed(speed);

        }

}
