package com.geekbrains.lesson2.hw;

public class MainApp {
    public static void main(String[] args) {
        Action[] objects1 = new Action[]{new Human(), new Cat(), new Robot()};

        Obstacle[] objects2 = new Obstacle[]{new Treadmill(), new Wall()};

        for (Action o : objects1) {
            for (Obstacle o1 : objects2) {
                if (!o1.contest(o)) break;
            }
        }
    }
}
