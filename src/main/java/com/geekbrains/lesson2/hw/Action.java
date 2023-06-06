package com.geekbrains.lesson2.hw;

public abstract class Action {
    private int maxRunDistance;
    private int maxJumpDistance;

    public boolean run(int distance) {
        return distance <= maxRunDistance;
    }

    public boolean jump(int distance) {
        return distance <= maxJumpDistance;
    }
}
