package com.geekbrains.lesson3.exceptions.ex2;

public class MainApp {
    public static void main(String[] args) {
        try {
            System.out.println("in try before exception");
            int x = 10/0;
            System.out.println("in try after exception");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("in catch");
        }
        System.out.println("after catch");
    }
}
