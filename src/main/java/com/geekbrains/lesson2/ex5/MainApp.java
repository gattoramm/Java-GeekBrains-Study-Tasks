package com.geekbrains.lesson2.ex5;

import com.geekbrains.lesson2.ex1.Flyable;

public class MainApp {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {

            }
        };

        System.out.println(flyable.getClass().getName());
    }
}

