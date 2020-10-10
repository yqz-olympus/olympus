package com.olympus.framework.kronus.util;

public class Helper {
    public static class sort {

        public static <T extends Comparable<T>> T[] selection(T[] array) {
            for (int i = 0; i < array.length; i++) {
                int index = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j].compareTo(array[index]) < 0) {
                        index = j;
                    }
                }

                T temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }

            return array;
        }

        public static <T extends Comparable<T>> T[] insert(T[] array) {

            for (int i = 1; i < array.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (array[j].compareTo(array[j - 1]) < 0) {
                        T temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }

            return array;
        }
    }
}
