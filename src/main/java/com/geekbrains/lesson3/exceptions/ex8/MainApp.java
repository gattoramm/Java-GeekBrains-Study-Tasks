package com.geekbrains.lesson3.exceptions.ex8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/** throw - вызов исключений
 */

public class MainApp {
    public static void main(String[] args) {
        int coef = 0;
        try {
            coef = fun(-1);
        } catch (ArithmeticException e) {
            coef = 7;
        }

        try {

        } catch (RuntimeException e) {
            throw new ArithmeticException();
        }

        System.out.println(coef);
    }

    public static int fun(int n) {
        if (n < 0)
            throw new ArithmeticException("n < 0");
        return n /2 ;
    }
}
