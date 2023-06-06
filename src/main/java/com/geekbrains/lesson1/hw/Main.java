package com.geekbrains.lesson1.hw;

import com.geekbrains.lesson1.hw.animals.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new HouseCat("Barsik",200);
        Dog dog = new Dog("Bobik", 1000, 50);
        Tiger tiger = new Tiger("Тигра", 10000, 500);

        Animal[] animals = new Animal[]{cat, dog, tiger};


        for (Animal animal:animals) {
            System.out.println("--------RUN----------");
            animal.run(501);
            System.out.println("--------SWIM---------");
            animal.swim(11);
            System.out.println(" ");
        }
    }
}