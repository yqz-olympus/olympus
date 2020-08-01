package com.olympus.framework.kronus.stack;

public interface Stack<E> {
    public int size();

    public boolean isEmpty();

    public void push(E e);

    public E pop() throws Exception;

    /***
     * 查看栈顶元素
     * @return 返回栈顶元素，但不删除
     */
    public E peek() throws Exception;
}
