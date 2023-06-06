package com.geekbrains.lesson2.hw;

public class Wall implements Obstacle{
    @Override
    public boolean contest(Action action) {
        return false;
    }
}
