package de.dhbw.programmieren.java.exercise.common.zoo;

public class Predator extends ZooAnimal{



    public Predator(String name, String kind) {
        super(kind, name);

        this.setFavoriteFood("flesh");

    }
}
