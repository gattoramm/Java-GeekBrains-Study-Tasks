package com.geekbrains.lesson8.homework.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создайте массив объектов типа Сотрудник (с полями Имя, Возраст, Зарплата) и вычислите
 * среднюю зарплату сотрудника
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

        public int getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
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

        System.out.println(persons
                .stream()
                .mapToDouble(Person::getSalary)
                .average());
    }
}
