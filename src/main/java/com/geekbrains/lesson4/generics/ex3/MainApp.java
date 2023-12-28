package com.geekbrains.lesson4.generics.ex3;

public class MainApp {
    public static void main(String[] args) {
        GenBox<Number> gbn = new GenBox<>(1);
        GenBox<Integer> gbi = new GenBox<>(1);
        doSomething1(gbn);
        doSomething2(gbn);
        doSomething3(gbn);

        doSomething1(gbi);
//        doSomething2(gbi);
//        doSomething3(gbi);
    }
    public static void doSomething1(GenBox<? extends Number> box) {

    }
    public static void doSomething2(GenBox<Number> box) {

    }
    public static void doSomething3(GenBox<? super Number> box) {

    }
}
