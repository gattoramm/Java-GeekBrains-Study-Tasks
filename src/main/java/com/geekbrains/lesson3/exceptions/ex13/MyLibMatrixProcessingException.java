package com.geekbrains.lesson3.exceptions.ex13;

public class MyLibMatrixProcessingException extends MyLibException{
    private int row;
    private int column;
    private Object value;

    public Object getValue() {
        return value;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public MyLibMatrixProcessingException(int column, int row, int[][] array) {
        super("Invalid data in [" + column + "; " + row + "]: " + array[column][row]);
        this.row = row;
        this.column = column;
        this.value = array[column][row];
    }
}
