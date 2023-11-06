package com.geekbrains.lesson3.exceptions.ex4;

/** супер исключение
 */

public class MainApp {
    public static void main(String[] args) {
        try {
            int x = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("in ArithmeticException");
        }
        catch (RuntimeException e) {
            System.out.println("in RuntimeException");
        }
//        catch (ArithmeticException e) {
//            System.out.println("in ArithmeticException");
//        }
    }
}
