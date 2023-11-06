package com.geekbrains.lesson3.exceptions.ex13;

public class MainApp {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    if (arr[i][j] == 7 || arr[i][j] == 12) {
                        throw new MyLibMatrixProcessingException(i, j, arr);
                    }
                } catch (MyLibMatrixProcessingException e) {
                    arr[i][j] = -1;
                }
            }
        }
    }
}
