package com.geekbrains.lesson1.hw.animals;

public class Dog extends Animal{
    public static int count;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super("Бобик", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
