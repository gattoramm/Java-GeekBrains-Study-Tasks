package com.geekbrains.lesson3.exceptions.ex5;

/** вложенные исключение
 */

public class MainApp {
    public static void main(String[] args) {
        try {
            try {

            } catch (Exception ex) {

            }
            int x = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("in ArithmeticException");
            try {

            } catch (Exception exc) {

            }
        }
    }
}
