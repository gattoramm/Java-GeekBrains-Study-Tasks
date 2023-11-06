package com.geekbrains.lesson3.exceptions.homework;

public class MyArrayDataException extends MyException {
    private int row;
    private int column;
    private Object value;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Object getValue() {
        return value;
    }

    public MyArrayDataException(int column, int row, String[][] array) {
        super("Invalid data in [" + column + "; " + row + "]: " + array[column][row]);
        this.row = row;
        this.column = column;
        this.value = array[column][row];
    }
}
