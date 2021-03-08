package de.dhbw.programmieren.java.exercise.common.zoo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Zoo {

    public ZooAnimal[] getWholeZoo() {
        return wholeZoo;
    }

    private ZooAnimal[] wholeZoo;

    public Zoo(){
        wholeZoo = new ZooAnimal[5];
    }

    public Zoo(int i){
        wholeZoo = new ZooAnimal[i];
    }

    public void addAnimal(ZooAnimal animal) throws ZooCapacityExeption{
        boolean empty = false;
        int index = 0;

        while(!empty){
            if(index < wholeZoo.length) {

                if (wholeZoo[index] != null) {
                    index++;
                } else {
                    empty = true;
                }
            } else {
                index++;
                break;
            }
        }

        try {
            if (index > wholeZoo.length) {
                throw new ZooCapacityExeption("Error: zoo capacity exceeded!");
            } else {
                this.wholeZoo[index] = animal;
                System.out.println(animal.toString() + " added to zoo");
            }
        } catch (ZooCapacityExeption e){
            e.printStackTrace();
        }
    }

    public ZooAnimal[] getAnimals(){

        int tmp = 0;

        for (ZooAnimal animal : wholeZoo) {
            if (animal != null) tmp++;

        }

        ZooAnimal[] animals = new ZooAnimal[tmp];
        tmp = 0;

        for (ZooAnimal zooAnimal : wholeZoo) {
            if (zooAnimal != null) {
                animals[tmp] = zooAnimal;
                tmp++;
            }
        }

        return animals;
    }

    public boolean existsAnimal(String name){
        boolean tmp = false;

        System.out.println("Is " + name + " in the zoo? ");
        for (ZooAnimal zooAnimal : wholeZoo) {
            if (zooAnimal.getName().equals(name)) {
                tmp = true;
                break;
            }
        }

        return tmp;
    }

    public void feed(String fodder){
        for (int i = 0; i < wholeZoo.length; i++) {
            wholeZoo[i].feed(fodder);
        }
    }

    public void saveToFile(String filename){
        try(Writer writer = new FileWriter(filename)) {

            StringBuilder s = new StringBuilder();
            for(int i=0; i < wholeZoo.length; i++){
                s.append(wholeZoo[i].getKind()).append(";").append(wholeZoo[i].getName()).append(";").append(wholeZoo[i].getClass().getSimpleName()).append("\n");
            }

            writer.write(s.toString());

            System.out.println("Saved animals to file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ZooCapacityExeption {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Predator("Tiger", "Fred"));
        zoo.addAnimal(new Predator ("Tiger", "Lisa"));
        zoo.addAnimal(new Predator ("Lion", "Simba"));
        zoo.addAnimal(new Songbird("Nuthatch", "Hansi"));
        zoo.addAnimal(new Songbird ("Backbird", "Sina"));
        zoo.addAnimal(new Songbird ("Wren", "Henry"));

        System.out.println();
        zoo.saveToFile("src/de/dhbw/programmieren/java/exercise/common/zoo/zoo.txt");
        System.out.println();

        zoo.feed("grains");
        System.out.println();

        System.out.println(((zoo.existsAnimal("Fred") ? "yes":"no")));
        System.out.println(((zoo.existsAnimal("Kimba") ? "yes":"no")));
        System.out.println(((zoo.existsAnimal("Henry") ? "yes":"no")));
        System.out.println(((zoo.existsAnimal("Lotte") ? "yes":"no")));
    }
}
