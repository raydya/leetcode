package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestWordInDictionaryTest {
    @Test
    public void test1() {
        final LongestWordInDictionary solution = new LongestWordInDictionary();
        final String output = solution.longestWord(new String[]{"w", "wo", "wor", "worl", "world"});

        Assert.assertEquals("world", output);
    }

    @Test
    public void test2() {
        final LongestWordInDictionary solution = new LongestWordInDictionary();
        final String output = solution.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"});

        Assert.assertEquals("apple", output);
    }

    @Test
    public void test3() {
        final LongestWordInDictionary solution = new LongestWordInDictionary();
        final String output = solution.longestWord(new String[]{"m", "mo", "moc", "moch", "mocha", "l", "la", "lat", "latt", "latte", "c", "ca", "cat"});

        Assert.assertEquals("latte", output);
    }

    @Test
    public void test4() {
        final LongestWordInDictionary solution = new LongestWordInDictionary();
        final String output = solution.longestWord(new String[]{"k", "lg", "it", "oidd", "oid", "oiddm", "kfk", "y", "mw", "kf", "l", "o", "mwaqz", "oi", "ych", "m", "mwa"});

        Assert.assertEquals("oiddm", output);
    }
}
