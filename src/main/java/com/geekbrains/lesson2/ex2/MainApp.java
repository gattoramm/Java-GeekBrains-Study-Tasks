package com.geekbrains.lesson2.ex2;

public class MainApp {
    static class Human {
        private Transport currentTransport;

        public void stop() {
            if (currentTransport != null) {
                currentTransport.stop();
                currentTransport = null;
            }
        }

        public void drive(Transport transport) {
            transport.start();
            this.currentTransport = transport;
        }

        public void skateboardParkAction() {
            if (!(currentTransport instanceof Skateboard)) {
                System.out.println("111");
                return;
            }
            Skateboard skateboard = (Skateboard) currentTransport;
        }
    }

    static class Car implements Transport{
        @Override
        public void start() {
            System.out.println("Start on Car");
        }

        @Override
        public void stop() {
            System.out.println("Stop on Car");
        }
    }

    static class Skateboard implements Transport{
        @Override
        public void start() {
            System.out.println("Start on Skateboard");
        }

        @Override
        public void stop() {
            System.out.println("Stop on Skateboard");
        }
    }

    static class Bicycle implements Transport{
        @Override
        public void start() {
            System.out.println("Start on Bicycle");
        }

        @Override
        public void stop() {
            System.out.println("Stop on Bicycle");
        }
    }

    static class Moto implements Transport{
        @Override
        public void start() {
            System.out.println("Start on Moto");
        }

        @Override
        public void stop() {
            System.out.println("Stop on Moto");
        }
    }

    public static void main(String[] args) {
        Transport transport = new Car();
        Human human = new Human();
        human.stop();
        human.drive(transport);
        human.stop();
    }
}
