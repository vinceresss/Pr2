package ru.mirea.ivbo9;

import java.util.ArrayList;

public class DogsKennel {
    ArrayList<Dog> dogs = new ArrayList<>();

    public void addDog(int age, String name) {
        Dog dog = new Dog(age, name);
        dogs.add(dog);
    }

    public void getDogs() {
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }
    }

}
