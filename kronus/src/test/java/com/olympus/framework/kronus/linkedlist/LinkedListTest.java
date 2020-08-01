package com.olympus.framework.kronus.linkedlist;

import com.olympus.framework.kronus.linkedlist.impl.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void insertFromTheHead() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        list.insertFromTheHead(0);
        list.insertFromTheHead(1);
        list.insertFromTheHead(2);
        list.insertFromTheHead(3);
        list.insertFromTheHead(5);
        assertEquals(0, list.getTail());
        assertEquals(5, list.getHead());

        assertFalse(list.isEmpty());
        assertEquals(list.size(), 5);
        int r0 = list.deleteFromTheHead();
        assertEquals(r0, 5);
        int r1 = list.deleteFromTheHead();
        assertEquals(r1, 3);
        int r2 = list.deleteFromTheHead();
        assertEquals(r2, 2);
        int r3 = list.deleteFromTheHead();
        assertEquals(r3, 1);
        int r5 = list.deleteFromTheHead();
        assertEquals(r5, 0);
        assertEquals(list.size(), 0);
        assertTrue(list.isEmpty());


        list.insertFromTheHead(0);
        list.insertFromTheHead(1);
        list.insertFromTheHead(2);
        list.insertFromTheHead(3);
        list.insertFromTheHead(5);
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 5);
        r0 = list.deleteFromTheTail();
        assertEquals(r0, 0);
        r1 = list.deleteFromTheTail();
        assertEquals(r1, 1);
        r2 = list.deleteFromTheTail();
        assertEquals(r2, 2);
        r3 = list.deleteFromTheTail();
        assertEquals(r3, 3);
        r5 = list.deleteFromTheTail();
        assertEquals(r5, 5);
        assertTrue(list.isEmpty());
        assertEquals(list.size(), 0);
    }

    @Test
    void insertFromTheTail() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
        assertEquals(list.size(), 0);

        list.insertFromTheTail(0);
        list.insertFromTheTail(1);
        list.insertFromTheTail(2);
        list.insertFromTheTail(3);
        list.insertFromTheTail(5);
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 5);

        assertEquals(5, list.deleteFromTheTail());
        assertEquals(3, list.deleteFromTheTail());
        assertEquals(2, list.deleteFromTheTail());
        assertEquals(1, list.deleteFromTheTail());
        assertEquals(0, list.deleteFromTheTail());
        assertEquals(list.size(), 0);
        assertTrue(list.isEmpty());


        list.insertFromTheTail(0);
        list.insertFromTheTail(1);
        list.insertFromTheTail(2);
        list.insertFromTheTail(3);
        list.insertFromTheTail(5);
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 5);

        assertEquals(0, list.deleteFromTheHead());
        assertEquals(1, list.deleteFromTheHead());
        assertEquals(2, list.deleteFromTheHead());
        assertEquals(3, list.deleteFromTheHead());
        assertEquals(5, list.deleteFromTheHead());
        assertEquals(list.size(), 0);
        assertTrue(list.isEmpty());
    }
}