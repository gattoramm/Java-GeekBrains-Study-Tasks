package com.geekbrains.lesson3.exceptions.ex13;

public class MyLibException extends RuntimeException{
    public MyLibException() {
    }

    public MyLibException(String message) {
        super(message);
    }
}
