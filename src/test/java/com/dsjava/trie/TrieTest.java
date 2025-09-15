package com.dsjava.trie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrieTest {
    @Test
    void testInsertSearch() {
        Trie t = new Trie();
        t.insert("hello"); assertTrue(t.search("hello"));
        assertTrue(t.startsWith("he"));
        assertFalse(t.search("hell"));
    }
}
