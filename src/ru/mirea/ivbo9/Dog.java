package ru.mirea.ivbo9;

import java.util.Scanner;

public class Dog {
    public void setAge() {
        this.age = age;
    }

    public void setName() {
        this.name = name;
    }

    public void toHumanAge() {
        humanAge = age * 7;
    }

    public String toString() {
        return "Dog{"
                + " Age: " + age
                + " Name: " + name
                + " human age: " + humanAge
                + '}';

    }

    private int humanAge;
    private int age;
    private String name;

    Dog(int a, String n) {
        name = n;
        age = a;

    }

}
