package com.geekbrains.lesson8.stream.ex5;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("\tsecondEx()");
        StreamMethods.secondEx();
        System.out.println("\tthirdEx()");
        StreamMethods.thirdEx();
        System.out.println("\tmatchEx()");
        StreamMethods.matchEx();
        System.out.println("\tfindAnyEx()");
        StreamMethods.findAnyEx();
        System.out.println("\tmappingEx()");
        StreamMethods.mappingEx();
        System.out.println("\treduceEx()");
        StreamMethods.reduceEx();
        System.out.println("\tintStreamEx()");
        StreamMethods.intStreamEx();
        System.out.println("\tstreamFromFileEx()");
        StreamMethods.streamFromFileEx("src/main/java/resources/123.txt");
        System.out.println("\tsimpleStringEx()");
        StreamMethods.simpleStringEx();
        System.out.println("\tfunction()");
        StreamMethods.function("src/main/java/resources/text.txt");
    }
}
