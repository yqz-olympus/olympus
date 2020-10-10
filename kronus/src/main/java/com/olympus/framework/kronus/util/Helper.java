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

        /***
         * 数组基本有序的情况下，效率很高
         * @param array 待排序数组
         * @param <T> 组成数组的类型
         * @return 返回排序后数组与array是同一个数组
         */
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
