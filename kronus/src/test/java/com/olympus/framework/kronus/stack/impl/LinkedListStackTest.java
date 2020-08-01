package com.olympus.framework.kronus.stack.impl;

import com.olympus.framework.kronus.stack.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListStackTest {

    @Test
    void stack() throws Exception {
        Stack<Integer> stack = new LinkedListStack<>();
        assertEquals(stack.size(), 0);
        assertTrue(stack.isEmpty());
        int size = 100;

        for (int i = 0; i < size; i++) {
            stack.push(i);
        }

        assertEquals(stack.size(), 100);
        assertFalse(stack.isEmpty());

        int i = size - 1;
        while (!stack.isEmpty()) {
            int peek = stack.peek();
            int pop = stack.pop();
            assertEquals(peek, pop);
            assertEquals(pop, i--);
        }

        assertEquals(stack.size(), 0);
        assertTrue(stack.isEmpty());
    }
}