package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TrieTest {

    @Test
    public void test1() {
        final Trie trie = new Trie();

        trie.insert("apple");
        Assert.assertTrue(trie.search("apple"));
        Assert.assertFalse(trie.search("app"));
        Assert.assertTrue(trie.startsWith("app"));
        trie.insert("app");
        Assert.assertTrue(trie.search("app"));
    }

    @Test
    public void test2() {
        final Trie trie = new Trie();

        trie.insert("");
        Assert.assertFalse(trie.startsWith("a"));
    }
}
