package com.geekbrains.lesson3.exceptions.ex7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/** перехватываемые/неперехватываемые исключения
 */

public class MainApp {
    public static void main(String[] args) {
        //неперехватываемое
        int x = 10/0;

        //перехватываемое
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("1.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
