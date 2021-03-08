package de.dhbw.programmieren.java.exercise.io;


import java.io.*;

public class Files {

    public static void main(String[] args){

        File dir = new File("src/de/dhbw/programmieren/java/exercise/io/test");
        dir.mkdir();

        File file1 = new File(dir,"foo1");
        File file2 = new File(dir,"foo2");
        File file3 = new File(dir,"foo3");

        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(dir.getAbsolutePath());
        for(File element : dir.listFiles()){
            System.out.println(element.getAbsolutePath());
        }

        System.out.println();

        for (File root: dir.listRoots()){
            System.out.println(root.getAbsolutePath());
        }

        for(File element : dir.listFiles()){
            element.delete();
        }
        dir.delete();

    }
}
