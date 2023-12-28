package com.geekbrains.lesson4.lists.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("ZZ", "A", "B", "C", "D", "B", "B", "B", "F", "B"));
        System.out.println(arrayList.get(1));

        while (arrayList.remove("B"));
        System.out.println(arrayList);

//        Collections.sort(arrayList);
        arrayList.sort((o1, o2) -> o1.length() - o2.length());
        System.out.println(arrayList);
    }
}
