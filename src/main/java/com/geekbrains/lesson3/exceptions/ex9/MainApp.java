package com.geekbrains.lesson3.exceptions.ex9;

/**
 * throws перехват
 * */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainApp {
    public static void main(String[] args) throws Exception{
        fun();
    }

    public static void fun() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("1.txt");
    }
}
