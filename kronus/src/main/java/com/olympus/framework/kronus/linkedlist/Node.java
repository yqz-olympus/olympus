package com.olympus.framework.kronus.linkedlist;

public class Node<E> {
    private E e;
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

    public E getValue() {
        return e;
    }

    public void setValue(E e) {
        this.e = e;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
}
