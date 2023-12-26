package com.geekbrains.lesson8.stream.ex1;

public class MainApp {
    public static void main(String[] args) {
        doSomething(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Java");
            }
        });

        doSomething(() -> System.out.println(100));
    }

    public static void doSomething(Runnable runnable) {
        runnable.run();
    }
}
