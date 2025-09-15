package com.dsjava.tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    @Test
    void testInsertSearch() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50); bst.insert(30); bst.insert(70);
        assertTrue(bst.search(30));
        assertFalse(bst.search(90));
    }
}
