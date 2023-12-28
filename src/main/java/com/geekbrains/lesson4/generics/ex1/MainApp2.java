package com.geekbrains.lesson4.generics.ex1;

public class MainApp2 {
    public static void main(String[] args) {
        GenBox<String> strBox = new GenBox<>("Java");
        GenBox<Integer> intBox1 = new GenBox<>(10);
        GenBox<Integer> intBox2 = new GenBox<>(20);

        int sum = intBox1.getObj() + intBox2.getObj();
        System.out.println(sum  );
    }
}
