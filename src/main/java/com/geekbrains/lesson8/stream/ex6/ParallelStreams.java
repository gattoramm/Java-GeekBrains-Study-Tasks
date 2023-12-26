package com.geekbrains.lesson8.stream.ex6;

import java.util.Arrays;

public class ParallelStreams {
    public static void forkEx() {
        Arrays.asList("a1", "a2", "a3", "b1", "c1", "c2")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.printf("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sorted: %s <> %s [%s]\n",
                            s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }
}
