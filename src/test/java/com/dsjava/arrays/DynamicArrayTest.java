package com.dsjava.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {
    @Test
    void testAddGetRemove() {
        DynamicArray<Integer> da = new DynamicArray<>(2);
        da.add(10); da.add(20); da.add(30);
        assertEquals(3, da.size());
        assertEquals(20, da.get(1));
        assertEquals(30, da.removeLast());
        assertEquals(2, da.size());
    }
}
