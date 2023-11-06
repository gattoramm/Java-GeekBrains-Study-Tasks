package com.geekbrains.lesson3.exceptions.ex3;

/** несколько исключений
 */

public class MainApp {
    public static void main(String[] args) {
        try {
            System.out.println("in try before exception");
            int x = 10/0;
            System.out.println("in try after exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch (ArithmeticException e) {
            System.out.println("in catch");
        }
        System.out.println("after catch");
    }
}
