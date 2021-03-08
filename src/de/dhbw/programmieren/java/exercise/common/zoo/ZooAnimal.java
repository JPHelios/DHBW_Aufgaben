package de.dhbw.programmieren.java.exercise.common.zoo;

public class ZooAnimal {

    private String name;

    public String getKind() {
        return kind;
    }

    private String kind;

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    private String favoriteFood;

    public ZooAnimal(String name, String kind) {
        this.name = name;
        this.kind = kind;
        this.favoriteFood = null;

    }

    public void feed(String fodder){

        if(fodder.equalsIgnoreCase(favoriteFood)) System.out.println(this.toString() + " eats " + fodder);
        else System.out.println(this.toString() + " despises " + fodder);
    }

    @Override
    public String toString(){
        return name + " (" + kind + ") ";
    }
}
