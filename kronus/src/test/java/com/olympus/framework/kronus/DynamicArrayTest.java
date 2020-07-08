package com.olympus.framework.kronus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    private static final Logger LOGGER = LogManager.getLogger(DynamicArray.class);

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void capacity() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void add() {


    }

    @org.junit.jupiter.api.Test
    void insert() {
        DynamicArray dy = new DynamicArray(20);

        for (int i = 0; i < 10; i++) {
            dy.add(i);
        }

        assertEquals(dy.size(), 10);
        dy.insert(1, 100);
        assertEquals(dy.size(), 11);
        assertEquals(dy.capacity(), 20);
        dy.insert(6, 600);
        assertEquals(dy.size(), 12);
        assertEquals(dy.capacity(), 20);

        LOGGER.info(dy.toString());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        DynamicArray dy = new DynamicArray(20);

        for (int i = 0; i < 10; i++) {
            dy.add(i);
        }

        assertEquals(dy.size(), 10);
        assertEquals(dy.capacity(), 20);
        assertEquals(dy.toString(), "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
        LOGGER.info(dy.toString());
    }
}
