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
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        DynamicArray dy = new DynamicArray(20);

        for (int i = 0; i < 10; i++) {
            dy.add(i);
        }

        LOGGER.info(dy.toString());
    }
}
