package com.olympus.framework.kronus.tree;

public interface ITree<E> {
    public int getSize();

    public boolean isEmpty();

    public void insert(E e);

    public E search(E e);

    public E delete(E e);
}
