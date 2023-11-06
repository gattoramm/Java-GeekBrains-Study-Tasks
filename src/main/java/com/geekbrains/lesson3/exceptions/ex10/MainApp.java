package com.geekbrains.lesson3.exceptions.ex10;

/**
 * finally
 * */

public class MainApp {
    public static void main(String[] args) {
        try {
            int x = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("finally");
        }
    }
}
