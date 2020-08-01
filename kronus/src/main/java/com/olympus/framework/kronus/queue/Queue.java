package com.olympus.framework.kronus.queue;

public interface Queue<E> {
    public int size();

    public boolean isEmpty();

    public void enqueue(E e);

    public E dequeue() throws Exception;

    public E front() throws Exception;
}
