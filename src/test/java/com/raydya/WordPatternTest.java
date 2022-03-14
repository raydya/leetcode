package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class WordPatternTest {

    @Test
    public void test1() {
        final WordPattern solution = new WordPattern();
        final boolean wordPattern = solution.wordPattern("abba", "dog cat cat dog");

        Assert.assertTrue(wordPattern);
    }

    @Test
    public void test2() {
        final WordPattern solution = new WordPattern();
        final boolean wordPattern = solution.wordPattern("abba", "dog cat cat fish");

        Assert.assertFalse(wordPattern);
    }

    @Test
    public void test3() {
        final WordPattern solution = new WordPattern();
        final boolean wordPattern = solution.wordPattern("aaaa", "dog cat cat dog");

        Assert.assertFalse(wordPattern);
    }

    @Test
    public void test4() {
        final WordPattern solution = new WordPattern();
        final boolean wordPattern = solution.wordPattern("abba", "dog dog dog dog");

        Assert.assertFalse(wordPattern);
    }

    @Test
    public void test5() {
        final WordPattern solution = new WordPattern();
        final boolean wordPattern = solution.wordPattern("abc", "b c a");

        Assert.assertTrue(wordPattern);
    }

    @Test
    public void test6() {
        final WordPattern solution = new WordPattern();
        final boolean wordPattern = solution.wordPattern("aaa", "aa aa aa aa");

        Assert.assertFalse(wordPattern);
    }
}
