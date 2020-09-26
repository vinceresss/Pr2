package ru.mirea.ivbo9;

import java.util.ArrayList;

public class DogsKennel {
    ArrayList<String> dogs = new ArrayList<>();

    public void addDog(int age, String name) {
        Dog dog = new Dog(age, name);
        dogs.add(dog.toString());
    }
}
