package com.dsjava.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    @Test
    void testQuickSort() {
        int[] a = {5,3,8,1,2};
        QuickSort.sort(a,0,a.length-1);
        assertArrayEquals(new int[]{1,2,3,5,8}, a);
    }

    @Test
    void testMergeSort() {
        int[] a = {4,2,6,1};
        MergeSort.sort(a);
        assertArrayEquals(new int[]{1,2,4,6}, a);
    }
}
