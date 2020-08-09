package com.olympus.framework.nyx;

public class Demo01 {
    public static void main(String[] args) {
        int[] array = new int[60 * 1024 * 1024];
        long l01 = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            array[i] *= 3;
        }

        long l02 = System.currentTimeMillis();

        for (int i = 0; i < array.length; i += 16) {
            array[i] *= 3;
        }

        long l03 = System.currentTimeMillis();

        System.out.println(l02 - l01);
        System.out.println(l03 - l02);

    }
}
