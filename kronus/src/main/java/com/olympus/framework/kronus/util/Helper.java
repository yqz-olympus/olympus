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
                T temp = array[i];
                int j = i;
                for (; j > 0; j--) {
                    if (temp.compareTo(array[j - 1]) < 0) {
                        array[j] = array[j - 1];
                    } else {
                        break;
                    }
                }

                if (j != i)
                    array[j] = temp;
            }
            return array;
        }
    }
}
