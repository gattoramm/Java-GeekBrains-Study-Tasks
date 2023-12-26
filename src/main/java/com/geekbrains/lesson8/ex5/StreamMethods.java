package com.geekbrains.lesson8.ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {
    public static void secondEx() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> out = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(out);
    }

    public static void thirdEx() {
        Arrays.asList(1, 2, 3, 4, 4, 3, 2, 3, 2, 1).stream().distinct().forEach(System.out::println);
    }

    public static void matchEx() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        boolean result = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 10) {
                result = false;
                break;
            }
        }

        System.out.println(list.stream().allMatch(n -> n < 10));
        System.out.println(list.stream().anyMatch(n -> n == 4));
        System.out.println(list.stream().noneMatch(n -> n == 2));
    }

    public static void findAnyEx() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.stream().filter(n -> n > 10).findAny().ifPresent(System.out::println);
        Optional<Integer> opt = list.stream().filter(n -> n > 10).findAny();
        if (opt.isPresent())
            System.out.println(opt.get());
    }

    public static void mappingEx() {
        Function<String, Integer> _strToLen = String::length;
        Function<String, Integer> strToLen = s -> s.length();
        Predicate<Integer> evenNumberFilter = n -> n % 2 == 0;
        Function<Integer, Integer> cube = n -> n * n * n;
        Stream.of(1, 2, 3).map(n -> Math.pow(n, 3));
        Stream.of(1, 2, 3).map(cube);

        List<String> list = Arrays.asList("A", "BB", "C", "DDD", "EE", "FFFF");
        List<Integer> wordsLength = list.stream().map(strToLen).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(wordsLength);

        list.stream().map(strToLen).forEach(n -> System.out.println(n));
        list.stream().map(strToLen).forEach(System.out::println);
    }

    public static void reduceEx() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (Integer o : list) {
            sum += o;
        }
        int streamSum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum + " " + streamSum);
    }

    public static void intStreamEx() {
        IntStream intStream = IntStream.of(10, 20, 30, 40);
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream().mapToInt(v -> v).sum();
//        list.stream().skip()

        IntStream.rangeClosed(2, 10).filter(n -> n % 2 == 0).forEach(System.out::println);
    }

    public static void streamCreationEx() {
        Arrays.asList("A", "B", "C").stream().forEach(System.out::println);
        Stream.of(1, 2, 3, 4).forEach(System.out::println);
        Arrays.stream(new int[]{4, 3, 2, 1}).forEach(System.out::println);
    }

    public static void streamFromFileEx(String path) {
        try {
            Files.lines(Paths.get(path)).map(String::length).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void simpleStringEx() {
        System.out.println(Arrays.stream("A B CC B C AA A A B CC C".split("\\s")).distinct().count());
    }

    public static void function(String path) {
        try {
            Files.lines(Paths.get(path))
                    .map(line -> line.split("\\s"))
                    .distinct()
                    .forEach(arr -> System.out.println(Arrays.toString(arr)));
            System.out.println("--------------------");

            Files.lines(Paths.get(path))
                    .map(line -> line.split("\\s"))
                    .map(Arrays::stream)
                    .distinct()
                    .forEach(System.out::println);
            System.out.println("--------------------");

            System.out.println(Files.lines(Paths.get(path))
                    .map(line -> line.split("\\s"))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .collect(Collectors.joining(", ", "Уникальные слова : ", ".")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean myOperation(int n, int k) {
        try {
            return n / k < 10;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void tryCatch() {
        int k = 0;
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).filter(n -> myOperation(n, 0)).collect(Collectors.toList());
    }
}
