package com.geekbrains.lesson1.hw.animals;

public abstract class Animal {
    public static int animalCount ;
    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        animalCount++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance)
            System.out.println(type + " " + name + " успешно пробежал");
        else
            System.out.println(type + " " + name + " не смог пробежать");
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            return;
        }
        if (distance <= maxSwimDistance)
            System.out.println(type + " " + name + " успешно проплыл");
        else
            System.out.println(type + " " + name + " не смог поплыть");
    }
}
