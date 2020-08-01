package com.olympus.framework.kronus.stack.impl;


import com.olympus.framework.kronus.linkedlist.List;
import com.olympus.framework.kronus.linkedlist.impl.LinkedList;
import com.olympus.framework.kronus.stack.Stack;

public class LinkedListStack<E> implements Stack<E> {

    private List<E> list = new LinkedList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.insertFromTheHead(e);
    }

    @Override
    public E pop() throws Exception {
        return list.deleteFromTheHead();
    }

    @Override
    public E peek() throws Exception {
        return list.getHead();
    }
}
