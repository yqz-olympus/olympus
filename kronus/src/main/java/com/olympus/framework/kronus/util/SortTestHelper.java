package com.olympus.framework.kronus.util;

import java.lang.reflect.Array;
import java.util.Random;

public class SortTestHelper {

    public static Integer[] generateRandomArray(Integer length, Integer rangeL, Integer rangeR) {
        Integer[] array = new Integer[length];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(rangeR - rangeL + 1) + rangeL;
        }
        return array;
    }

    public static void printf(Integer[] array) {
        StringBuffer buffer = new StringBuffer();

        buffer.append("[ ");
        for (int i = 0; i < array.length; i++) {
            buffer.append(array[i]);

            if (i != array.length - 1) {
                buffer.append(", ");
            }
        }

        buffer.append(" ]");

        System.out.println(buffer);

    }

/*
    @SuppressWarnIntegers({"unchecked", "hidInteger"})
    public static <T extends Comparable<T>> T[] generateRandomArray(Class<T> clazz, Integer length, Integer rangeL, Integer rangeR) {
        T[] array = (T[]) Array.newInstance(clazz, length);
        Random random = new Random()
        for (Integer i = 0; i < length; i++) {
        }
        return null;
    }
*/
}
