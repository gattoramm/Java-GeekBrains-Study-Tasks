package com.geekbrains.lesson8.ex4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        // Создание стрима
        Stream.of("AA", "BBB", "C", "DDDD").map(s -> s.length()).forEach(System.out::println);
        Stream.of(1, 2, 3, 4).map(s -> s * 10).forEach(System.out::println);

        Stream.of("AAA", "VVV", "QQQQQQ").map(String::length).collect(Collectors.toList());
        Stream.of("AAA", "VVV", "QQQQQQ").map(s -> s.length()).collect(Collectors.toList());

        class User {
            String name;

            public User(String name) {
                this.name = name;
            }
        }
        Stream.of("Bob", "Max", "John").map(User::new).collect(Collectors.toList());
        Stream.of("Bob", "Max", "John").map(s -> new User(s)).collect(Collectors.toList());
    }
}
