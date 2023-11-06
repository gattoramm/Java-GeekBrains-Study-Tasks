package com.geekbrains.lesson3.exceptions.ex12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * try with resources
 * */

public class MainApp {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("2.txt");
             FileInputStream fileInputStream = new FileInputStream("2.txt")) {

        } catch (IOException e) {

        }
    }
}
