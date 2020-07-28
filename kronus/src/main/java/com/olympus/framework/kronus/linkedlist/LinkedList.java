package com.olympus.framework.kronus.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<E extends Comparable<E>> {

    private class Node<E> {
        private E e;
        private Node<E> next;
        private Node<E> prev;

        public Node(E e, Node<E> next, Node<E> prev) {
            this.e = e;
            this.next = next;
            this.prev = prev;
        }

        public Node(E e) {
            this.e = e;
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

    public void insertFromTheHead(E e) {

    }

    public void insertFromTheTail(E e) {

    }

    public E deleteFromTheTail() {
        return null;
    }

    public E deleteFromTheHead() {
        return null;
    }
}
