package com.olympus.framework.kronus.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private static final Logger LOGGER = LogManager.getLogger(LinkedListTest.class);

    @Test
    static void insert() {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.insert(i);
        }

        Node<Integer> head = list.getHead();
        while (head != null) {
            LOGGER.info(head.getValue());
            head = head.getNext();
        }

/*

        Node<Integer> tail = list.getTail();
        while (tail != null) {
            LOGGER.info(tail.getValue());
            tail = tail.getPrev();
        }

*/
    }
}