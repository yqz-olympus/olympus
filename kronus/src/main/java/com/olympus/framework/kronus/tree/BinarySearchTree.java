package com.olympus.framework.kronus.tree;

public class BinarySearchTree<E extends Comparable<E>> {

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

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
