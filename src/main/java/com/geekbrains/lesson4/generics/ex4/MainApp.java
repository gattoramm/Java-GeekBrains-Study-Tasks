package com.geekbrains.lesson4.generics.ex4;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

    }

    public static <T> T getFirstElement(List<T> list) {
        return list.get(0);
    }
}
