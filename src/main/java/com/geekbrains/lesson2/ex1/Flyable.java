package com.geekbrains.lesson2.ex1;

public interface Flyable {
    default void fly() {
        System.out.println(1);
    }
    public final int x = 10;
}
