package com.olympus.framework.kronus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DynamicArray {

    private static final Logger logger = LogManager.getLogger(DynamicArray.class);
    private int[] data;
    private int size;

    /***
     * @param capacity 设置数组初始容量
     */
    public DynamicArray(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /***
     * 默认属猪初始容量10
     */
    public DynamicArray() {
        this(10);
    }

    /**
     * 获取数组中原数个数
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 获取数组容量
     *
     * @return
     */
    public int capacity() {
        return data == null ? 0 : data.length;
    }

    /***
     * 判断数组是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int e) {
        insert(size, e);
    }

    /**
     * @param index 插入数据索引位置
     * @param e     插入值
     */
    public void insert(int index, int e) {

        if (data == null || size == data.length) {
            throw new IllegalArgumentException("add failed, array is full");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed, index require index >= 0 && index <= size");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");

        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        logger.info("logger test");

        res.append("]");
        return res.toString();
    }
}
