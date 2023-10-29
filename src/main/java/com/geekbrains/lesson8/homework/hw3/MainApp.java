package com.geekbrains.lesson8.homework.hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Напишите метод, способный найти в массиве сотрудников из п. 2 найдите N самых старших
 * сотрудников и отпечатает в консоль сообщение вида
 * “N самых старших сотрудников зовут:
 * имя1, имя2, имяN;”
 * */

public class MainApp {
    static class Person {
        String name;
        int age;
        int salary;

        public Person(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    static void FindAgeOfNPersons(int n) {
        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person("Bob", 20, 1000),
                        new Person("Steve", 45, 2000),
                        new Person("Ted", 32, 3500),
                        new Person("Mike", 42, 5000),
                        new Person("John", 21, 4500),
                        new Person("Anna", 25, 1500),
                        new Person("Kate", 50, 2500),
                        new Person("Rick", 33, 3100)
                )
        );

        persons
                .stream()
                .mapToInt(Person::getAge)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(n)
                .toList();
                //.collect();
    }

    public static void main(String[] args) {
        FindAgeOfNPersons(3);
    }
}
