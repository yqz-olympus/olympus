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

/*        Queue<Integer> pre = bst.preOrder();
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
        assertEquals(8, in.dequeue());*/
    }
}