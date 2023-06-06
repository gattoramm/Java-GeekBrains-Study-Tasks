package com.geekbrains.lesson1.hw.animals;

public class HouseCat extends Cat{
    public static int count;

    public HouseCat(String name, int maxRunDistance) {
        super("Домашний кот", name, maxRunDistance, 0);
        couny++;
    }
}
