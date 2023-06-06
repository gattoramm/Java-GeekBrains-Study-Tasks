package com.geekbrains.lesson2.ex1;

public class MainApp {
    public static void main(String[] args) {
        Flyable[] flyables = {
                new Duck(),
                new Airplane()
        };

        for (Flyable flyable : flyables) {
            flyable.fly();
        }
    }
}
