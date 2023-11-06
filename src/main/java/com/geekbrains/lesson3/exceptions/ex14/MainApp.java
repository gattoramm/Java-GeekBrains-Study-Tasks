package com.geekbrains.lesson3.exceptions.ex14;

/**
 * ArrayIndexOutOfBoundsException
 * */

public class MainApp {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4};
        int index = 12;

        try {
            System.out.println(data[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
