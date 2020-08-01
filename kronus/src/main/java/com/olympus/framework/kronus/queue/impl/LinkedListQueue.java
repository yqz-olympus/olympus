package com.olympus.framework.kronus.queue.impl;

import com.olympus.framework.kronus.linkedlist.List;
import com.olympus.framework.kronus.linkedlist.impl.LinkedList;
import com.olympus.framework.kronus.queue.Queue;

public class LinkedListQueue<E> implements Queue<E> {

    private final List<E> list = new LinkedList<E>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        list.insertFromTheHead(e);
    }

    @Override
    public E dequeue() throws Exception {
        return list.deleteFromTheTail();
    }

    @Override
    public E front() throws Exception {
        return list.getTail();
    }
}
