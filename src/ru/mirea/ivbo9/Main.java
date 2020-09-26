package ru.mirea.ivbo9;


public class Main  {

    public static void main(String[] args) {
        Dog dog=new Dog(5,"Jack");
        dog.setAge();
        dog.setName();
        dog.toHumanAge();
        System.out.println(dog);
        DogsKennel ken = new DogsKennel();
        ken.addDog(3,"Sara");

    }
}
