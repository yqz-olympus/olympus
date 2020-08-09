package com.olympus.framework.nyx;

public class Demo02 {
    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    private static volatile int COUNTER = 0;

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int threadValue = COUNTER;
            while (threadValue < 5) {
                if (threadValue != COUNTER) {
                    System.out.println("Got Change for COUNTER : " + COUNTER);
                    threadValue = COUNTER;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run() {
            int threadValue = COUNTER;
            while (COUNTER < 5) {
                System.out.println("Incrementing COUNT to : " + (threadValue + 1) + "");
                COUNTER = ++threadValue;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
