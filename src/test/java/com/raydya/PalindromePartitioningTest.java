package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PalindromePartitioningTest {
    @Test
    public void test1() {
        final PalindromePartitioning solution = new PalindromePartitioning();
        final List<List<String>> output = solution.partition("aab");

        Assert.assertEquals(2, output.size());
        Assert.assertArrayEquals(new String[]{"a", "a", "b"}, output.get(0).toArray());
        Assert.assertArrayEquals(new String[]{"aa", "b"}, output.get(1).toArray());
    }

    @Test
    public void test2() {
        final PalindromePartitioning solution = new PalindromePartitioning();
        final List<List<String>> output = solution.partition("a");

        Assert.assertEquals(1, output.size());
        Assert.assertArrayEquals(new String[]{"a"}, output.get(0).toArray());
    }

    @Test
    public void test3() {
        final PalindromePartitioning solution = new PalindromePartitioning();
        final List<List<String>> output = solution.partition("ab");

        Assert.assertEquals(1, output.size());
        Assert.assertArrayEquals(new String[]{"a", "b"}, output.get(0).toArray());
    }

    @Test
    public void test4() {
        final PalindromePartitioning solution = new PalindromePartitioning();
        final List<List<String>> output = solution.partition("aabbc");

        Assert.assertEquals(4, output.size());
        Assert.assertArrayEquals(new String[]{"a", "a", "b", "b", "c"}, output.get(0).toArray());
        Assert.assertArrayEquals(new String[]{"a", "a", "bb", "c"}, output.get(1).toArray());
        Assert.assertArrayEquals(new String[]{"aa", "b", "b", "c"}, output.get(2).toArray());
        Assert.assertArrayEquals(new String[]{"aa", "bb", "c"}, output.get(3).toArray());
    }
}
