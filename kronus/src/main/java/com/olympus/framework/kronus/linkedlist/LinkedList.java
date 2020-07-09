package com.olympus.framework.kronus.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.olympus.framework.kronus.linkedlist.Node;

public class LinkedList<E extends Comparable<E>> {
    private static final Logger LOGGER = LogManager.getLogger(LinkedList.class);

    private int size;
    private Node<E> tail;
    private Node<E> head;

    public LinkedList() {
        this.size = 0;
        this.tail = null;
        this.head = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void insert(E e) {
        if (head == null) {
            head = tail = new Node<E>(e);
        } else {
            Node<E> node = new Node<E>(e);
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
    }

    public Node<E> pop() {
        return null;
    }

    public Node<E> delete() {
        return null;
    }
}
