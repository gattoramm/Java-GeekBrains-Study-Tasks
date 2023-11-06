package com.geekbrains.lesson3.exceptions.ex6;

import java.io.IOException;
import java.net.ServerSocket;

/** вложенные исключение
 */

public class MainApp {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8189);
        } catch (IOException e) {
            System.out.println("in ArithmeticException");
            try {
                serverSocket.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
