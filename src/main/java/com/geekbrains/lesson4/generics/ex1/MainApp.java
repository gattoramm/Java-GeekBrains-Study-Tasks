package com.geekbrains.lesson4.generics.ex1;

public class MainApp {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);

        intBox1.setObj("Java");

        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
            System.out.println("sum: " + sum);
        } else {
            System.out.println("Error");
        }
    }
}
