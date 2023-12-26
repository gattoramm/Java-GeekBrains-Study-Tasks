package com.geekbrains.lesson8.ex5;

import static com.geekbrains.lesson8.ex5.StreamMethods.*;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("\tsecondEx()");
        secondEx();
        System.out.println("\tthirdEx()");
        thirdEx();
        System.out.println("\tmatchEx()");
        matchEx();
        System.out.println("\tfindAnyEx()");
        findAnyEx();
        System.out.println("\tmappingEx()");
        mappingEx();
        System.out.println("\treduceEx()");
        reduceEx();
        System.out.println("\tintStreamEx()");
        intStreamEx();
        System.out.println("\tstreamFromFileEx()");
        streamFromFileEx("src/main/java/resources/123.txt");
        System.out.println("\tsimpleStringEx()");
        simpleStringEx();
        System.out.println("\tfunction()");
        function("src/main/java/resources/text.txt");
    }
}
