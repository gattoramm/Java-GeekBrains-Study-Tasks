package com.geekbrains.lesson4.generics.ex1;

public class GenBox<T> {
    private T obj;

    public GenBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
