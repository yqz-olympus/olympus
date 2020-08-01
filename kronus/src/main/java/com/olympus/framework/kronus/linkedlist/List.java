package com.olympus.framework.kronus.linkedlist;

public interface List<E> {
    public boolean isEmpty();

    public int size();

    public E getHead() throws Exception;

    public E getTail() throws Exception;

    public void insertFromTheHead(E e);

    public void insertFromTheTail(E e);

    public E deleteFromTheTail() throws Exception;

    public E deleteFromTheHead() throws Exception;
}
