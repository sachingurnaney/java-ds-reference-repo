package com.dsjava.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    @Test
    void testAddReverse() {
        SinglyLinkedList<Integer> l = new SinglyLinkedList<>();
        l.addLast(1); l.addLast(2); l.addLast(3);
        l.reverse();
        Object[] arr = l.toArray();
        assertArrayEquals(new Object[]{3,2,1}, arr);
    }
}
