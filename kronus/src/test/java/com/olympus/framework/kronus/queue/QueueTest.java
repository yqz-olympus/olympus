package com.olympus.framework.kronus.queue;

import com.olympus.framework.kronus.queue.impl.LinkedListQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void queue() throws Exception {

        Queue<Integer> queue = new LinkedListQueue<>();
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());

        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);

        assertFalse(queue.isEmpty());
        assertEquals(5, queue.size());
        assertEquals(0, queue.front());

        assertEquals(0, queue.dequeue());
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(5, queue.dequeue());

        assertEquals(queue.size(), 0);
        assertTrue(queue.isEmpty());
    }

}