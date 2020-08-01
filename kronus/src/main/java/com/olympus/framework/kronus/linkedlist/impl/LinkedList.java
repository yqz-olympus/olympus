package com.olympus.framework.kronus.linkedlist.impl;

import com.olympus.framework.kronus.linkedlist.List;

public class LinkedList<E> implements List<E> {

    private static class Node<E> {
        private E e;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e) {
            this(e, null, null);
        }

        public Node(E e, Node<E> prev, Node<E> next) {
            this.e = e;
            this.prev = prev;
            this.next = next;
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

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getHead() throws Exception {
        if (head == null) {
            throw new Exception("The linked list is empty");
        }
        return head.e;
    }

    @Override
    public E getTail() throws Exception {
        if (tail == null) {
            throw new Exception("The linked list is empty");
        }
        return tail.e;
    }

    @Override
    public void insertFromTheHead(E e) {
        if (head != null) {
            Node<E> node = new Node<E>(e, null, head);
            head = head.prev = node;
        } else {
            head = tail = new Node<E>(e, null, null);
        }
        size++;
    }

    @Override
    public void insertFromTheTail(E e) {
        if (!isEmpty()) {
            Node<E> node = new Node<E>(e, tail, null);
            tail = tail.next = node;
        } else {
            tail = head = new Node<E>(e, null, null);
        }
        size++;
    }

    @Override
    public E deleteFromTheTail() throws Exception {
        if (!isEmpty()) {
            Node<E> node = tail;
            tail = tail.prev;
            node.prev = node.next = null;
            size--;
            return node.e;
        } else {
            throw new Exception("The linked list is empty");
        }
    }

    @Override
    public E deleteFromTheHead() throws Exception {
        if (isEmpty()) {
            throw new Exception("The linked list is empty");
        } else {
            Node<E> node = head;
            head = head.next;
            node.next = node.prev = null;
            size--;
            return node.e;
        }
    }

}
