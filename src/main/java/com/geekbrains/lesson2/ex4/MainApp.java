package com.geekbrains.lesson2.ex4;

public class MainApp {
    static class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
//            System.out.println(outerValue);
            System.out.println(innerValue);
//            outerMethod();
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        System.out.println(innerValue);
//        innerMethod();
        Inner innner = new Inner(10);
    }

    public static void main(String[] args) {
        Inner innner = new Inner(10);

        class Point {
            int x;

            public Point(int x) {
                this.x = x;
            }

            public void info() {
                System.out.println(x);
            }
        }

        Point point = new Point(10);
    }
}
