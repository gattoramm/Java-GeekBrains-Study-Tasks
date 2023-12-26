package com.geekbrains.lesson8.homework.hw1;

/**
 * Создайте массив с набором слов, и с помощью Stream API найдите наиболее часто
 * встречающееся;
 **/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "BB", "C", "BB", "A", "A", "BBB", "C", "BB", "BB");

        String result =
        list
                .stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println(result);
    }
}
