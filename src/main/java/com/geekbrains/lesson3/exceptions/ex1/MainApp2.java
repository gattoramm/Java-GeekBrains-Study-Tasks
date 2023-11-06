package com.geekbrains.lesson3.exceptions.ex1;

public class MainApp2 {
    public static void main(String[] args) {
        try {
            a();
        } catch (ArithmeticException e) {
            System.out.println("AE in main");
        }

    }
    public static void a() {
        b();
    }

    public static void b() {
        try {
            int x = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("AE in b");
        }
    }
}
