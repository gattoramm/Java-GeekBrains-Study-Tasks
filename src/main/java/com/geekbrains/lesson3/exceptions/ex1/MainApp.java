package com.geekbrains.lesson3.exceptions.ex1;

public class MainApp {
    public static void main(String[] args) {
        a();
    }
    public static void a() {
        b();
    }

    public static void b() {
        int x = 20 / 0;
    }
}
