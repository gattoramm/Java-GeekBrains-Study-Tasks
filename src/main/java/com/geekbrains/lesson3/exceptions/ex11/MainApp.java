package com.geekbrains.lesson3.exceptions.ex11;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * finally
 * */

public class MainApp {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("1.txt");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            System.out.println("finally");
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
