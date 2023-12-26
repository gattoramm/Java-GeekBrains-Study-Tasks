package com.geekbrains.lesson8.stream.ex6;

import java.util.concurrent.ForkJoinPool;

import static com.geekbrains.lesson8.stream.ex6.ParallelStreams.forkEx;


public class MainApp {
    public static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool.getParallelism());

        forkEx();
    }
}
