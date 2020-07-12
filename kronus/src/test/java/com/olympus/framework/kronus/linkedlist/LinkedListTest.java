package com.olympus.framework.kronus.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private static final Logger LOGGER = LogManager.getLogger(LinkedListTest.class);

    @Test
    void simulationQueueTest() {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(list.size(), 0);
        assertTrue(list.isEmpty());

        for (int i = 0; i < 20; i++) {
            list.insert(i);
        }

        assertEquals(list.size(), 20);
        assertFalse(list.isEmpty());

        int x = 0;
        while (!list.isEmpty()) {
            int n = list.dequeue();
            LOGGER.info(n);
            assertEquals(n, x++);
        }

    }

    @Test
    void simulationStackTest() {

        LinkedList<Integer> stack = new LinkedList<>();
        assertEquals(stack.size(), 0);
        assertTrue(stack.isEmpty());
        int n = 10;
        for (int i = 0; i < n; i++) {
            stack.insert(i);
        }

        assertEquals(stack.size(), 10);
        assertFalse(stack.isEmpty());

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            LOGGER.info(temp);
            assertEquals(temp, --n);
        }

    }
}