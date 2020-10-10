package com.olympus.framework.kronus.tree;

import com.olympus.framework.kronus.queue.Queue;
import com.olympus.framework.kronus.tree.impl.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void bst() throws Exception {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] array = new int[]{5, 3, 6, 8, 4, 2};
        assertEquals(0, bst.getSize());
        assertTrue(bst.isEmpty());

        for (int j : array) {
            bst.insert(j);
        }
        assertEquals(6, bst.getSize());
        assertFalse(bst.isEmpty());

        bst.preOrder();

        boolean b01 = bst.contains(5);
        boolean b02 = bst.contains(3);
        boolean b03 = bst.contains(6);
        boolean b05 = bst.contains(8);
        boolean b06 = bst.contains(4);
        boolean b07 = bst.contains(2);

        assertTrue(b01);
        assertTrue(b02);
        assertTrue(b03);
        assertTrue(b05);
        assertTrue(b06);
        assertTrue(b07);

        boolean b08 = bst.contains(9);
        assertFalse(b08);


        Queue<Integer> pre = bst.preOrder();
        assertEquals(5, pre.dequeue());
        assertEquals(3, pre.dequeue());
        assertEquals(2, pre.dequeue());
        assertEquals(4, pre.dequeue());
        assertEquals(6, pre.dequeue());
        assertEquals(8, pre.dequeue());


        Queue<Integer> in = bst.inOrder();
        assertEquals(2, in.dequeue());
        assertEquals(3, in.dequeue());
        assertEquals(4, in.dequeue());
        assertEquals(5, in.dequeue());
        assertEquals(6, in.dequeue());
        assertEquals(8, in.dequeue());

        Queue<Integer> post = bst.postOrder();
        assertEquals(2, post.dequeue());
        assertEquals(4, post.dequeue());
        assertEquals(3, post.dequeue());
        assertEquals(8, post.dequeue());
        assertEquals(6, post.dequeue());
        assertEquals(5, post.dequeue());
    }
}