package com.dsjava.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void testPushPop() {
        StackUsingArray<Integer> s = new StackUsingArray<>(3);
        s.push(5); s.push(6);
        assertEquals(6, s.pop());
        assertEquals(5, s.pop());
        assertNull(s.pop());
    }
}
