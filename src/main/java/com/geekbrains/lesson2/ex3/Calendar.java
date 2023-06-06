package com.geekbrains.lesson2.ex3;

public class Calendar {
    Month month = Month.SEPTEMBER;

    public static final int MONTH_AUGUST = 8;

    public void currentDateInfo() {
        Month.valueOf("AUGUST");
        System.out.println(month.getNumber() + " " );
    }
}
