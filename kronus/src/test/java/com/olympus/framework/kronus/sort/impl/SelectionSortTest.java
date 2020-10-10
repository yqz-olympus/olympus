package com.olympus.framework.kronus.sort.impl;

import com.olympus.framework.kronus.util.Helper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    public void sort() {
        Integer[] array = new Integer[10];
        array[0] = 78;
        array[1] = 81;
        array[2] = 83;
        array[3] = 76;
        array[4] = 71;
        array[5] = 51;
        array[6] = 82;
        array[7] = 69;
        array[8] = 90;
        array[9] = 66;

        Integer[] test = Helper.sort.selection(array);

        assertEquals(test[0], 51);
        assertEquals(test[1], 66);
        assertEquals(test[2], 69);
        assertEquals(test[3], 71);
        assertEquals(test[4], 76);
        assertEquals(test[5], 78);
        assertEquals(test[6], 81);
        assertEquals(test[7], 82);
        assertEquals(test[8], 83);
        assertEquals(test[9], 90);

    }

}