package com.geekbrains.lesson3.exceptions.homework;

public class MainApp {
    public static void main(String[] args) {
        String[][] arr1 = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        String[][] arr2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "A", "8"},
                {"9", "10", "C", "12"},
                {"18", "777", "-78", "0"}
        };

        String[][] arr3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"18", "777", "-78", "0"}
        };

        print(arr2);
    }

    public static void print(String[][] arr) {
        if (arr.length != 4 && arr[0].length != 4) {
            throw new MyArraySizeException();
        }
        System.out.println(printSumArray(arr));
    }

    public static int printSumArray(String[][] arr) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].matches("\\d+"))
                    res += Integer.parseInt(arr[i][j]);
                else
                    throw new MyArrayDataException(i, j, arr);
            }
        }
        return res;
    }
}
