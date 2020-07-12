package com.olympus.framework.kronus.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<E extends Comparable<E>> {
    private static final Logger LOGGER = LogManager.getLogger(LinkedList.class);

    private static class Node<E> {
        private final E e;
        private Node<E> next;
        private Node<E> prev;

        public Node(E e, Node<E> next, Node<E> prev) {
            this.e = e;
            this.next = next;
            this.prev = prev;
        }

        public Node(E e) {
            this(e, null, null);
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /***
     * insert elements from the end for the linked list
     * @param e the element to be inserted
     */
    public void insert(E e) {

        Node<E> node = new Node<E>(e);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        size++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("cannot stack from an empty queue");
        }

        Node<E> temp = tail;
        tail = tail.prev;
        temp.prev = null;

        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }

        size--;

        return temp.e;
    }

    /***
     * remove from the beginning of the link list
     * @return returns the deleted element
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("cannot dequeue from an empty queue");
        }

        Node<E> temp = head;
        head = head.next;
        temp.next = null;

        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }

        size--;

        return temp.e;
    }

    public E getHead() {
        if (isEmpty()) {
            throw new IllegalArgumentException("cannot dequeue from an empty queue");
        }

        return head.e;
    }

    public E getTail(){
        if (isEmpty()) {
            throw new IllegalArgumentException("cannot stack from an empty queue");
        }

        return tail.e;
    }
}

