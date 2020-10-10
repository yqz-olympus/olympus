package com.olympus.framework.kronus.tree;

import com.olympus.framework.kronus.linkedlist.List;
import com.olympus.framework.kronus.queue.Queue;

public interface ITree<E> {
    public int getSize();

    public boolean isEmpty();

    public void insert(E e);

    public boolean contains(E e);

    public E delete(E e);

    public Queue<E> preOrder();

    public Queue<E> inOrder();

    public Queue<E> postOrder();
}
