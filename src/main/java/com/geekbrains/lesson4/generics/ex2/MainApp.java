package com.geekbrains.lesson4.generics.ex2;

public class MainApp {
    public static void main(String[] args) {
        BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(1, 2, 3, 4);
        System.out.println(intBox.average());
        BoxWithNumbers<Float> floatBox = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println(floatBox.average());
        System.out.println(intBox.compareAverage(floatBox));
    }
}
