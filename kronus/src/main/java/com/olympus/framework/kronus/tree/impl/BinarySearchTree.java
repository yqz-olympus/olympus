package com.olympus.framework.kronus.tree.impl;

import com.olympus.framework.kronus.linkedlist.List;
import com.olympus.framework.kronus.linkedlist.impl.LinkedList;
import com.olympus.framework.kronus.queue.Queue;
import com.olympus.framework.kronus.queue.impl.LinkedListQueue;
import com.olympus.framework.kronus.tree.ITree;

/**
 * BST
 *
 * @param <E>
 */
public class BinarySearchTree<E extends Comparable<E>> implements ITree<E> {
    private class Node<E> {
        private E e;
        private Node<E> left;
        private Node<E> right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node<E> root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void insert(E e) {

        if (e == null) {
            throw new NullPointerException("bst insert function param e is null");
        }

        root = insert(root, e);
    }

    private Node<E> insert(Node<E> node, E e) {

        if (node == null) {
            size++;
            return new Node<E>(e);
        }

        if (node.e.compareTo(e) < 0) {
            node.right = insert(node.right, e);
        } else if (node.e.compareTo(e) > 0) {
            node.left = insert(node.left, e);
        }

        return node;
    }

    @Override
    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node<E> node, E e) {

        if (node == null) {
            return false;
        }

        if (node.e.compareTo(e) == 0) {
            return true;
        } else if (node.e.compareTo(e) < 0) {
            return contains(node.right, e);
        } else {
            return contains(node.left, e);
        }
    }

    @Override
    public E delete(E e) {
        return null;
    }

    @Override
    public Queue<E> preOrder() {
        Queue<E> queue = new LinkedListQueue<>();
        preOrder(root, queue);
        return queue;
    }

    private void preOrder(Node<E> node, Queue<E> queue) {
        if (node == null) {
            return;
        }

        queue.enqueue(node.e);
        preOrder(node.left, queue);
        preOrder(node.right, queue);
    }

    @Override
    public Queue<E> inOrder() {
        Queue<E> queue = new LinkedListQueue<>();
        inOrder(root, queue);
        return queue;
    }

    private void inOrder(Node<E> node, Queue<E> queue) {
        if (node == null) {
            return;
        }

        inOrder(node.left, queue);
        queue.enqueue(node.e);
        inOrder(node.right, queue);
    }

    @Override
    public Queue<E> postOrder() {
        Queue<E> queue = new LinkedListQueue<>();
        postOrder(root, queue);
        return queue;
    }

    private void postOrder(Node<E> node, Queue<E> queue) {
        if (node == null) {
            return;
        }

        postOrder(node.left, queue);
        postOrder(node.right, queue);
        queue.enqueue(node.e);
    }
}
