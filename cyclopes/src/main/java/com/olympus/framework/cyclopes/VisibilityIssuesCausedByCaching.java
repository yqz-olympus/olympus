package com.olympus.framework.cyclopes;

public class VisibilityIssuesCausedByCaching {

    private long count = 0;

    private void add10k() {
        int index = 0;
        while (index++ < 10000000) {
            count += 1;
        }
    }

    public static long calc() throws InterruptedException {
        final VisibilityIssuesCausedByCaching test = new VisibilityIssuesCausedByCaching();

        Thread t01 = new Thread(new Runnable() {
            public void run() {
                test.add10k();
            }
        });

        Thread t02 = new Thread(new Runnable() {
            public void run() {
                test.add10k();
            }
        });

        t01.start();
        t02.start();
        t01.join();
        t02.join();
        return test.count;
    }

    public static void main(String[] args) throws InterruptedException {
        long result = calc();
        System.out.println(result);
    }
}
