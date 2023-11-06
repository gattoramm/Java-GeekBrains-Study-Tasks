package com.geekbrains.lesson3.exceptions.homework;

public class MyArraySizeException extends MyException{
    public MyArraySizeException() {
        super("Размер входного массива не 4x4");
    }
}
