package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MergeStringsAlternatelyTest {

    @Test
    public void test1() {
        final MergeStringsAlternately solution = new MergeStringsAlternately();
        final String output = solution.mergeAlternately("abc", "pqr");

        Assert.assertEquals("apbqcr", output);
    }

    @Test
    public void test2() {
        final MergeStringsAlternately solution = new MergeStringsAlternately();
        final String output = solution.mergeAlternately("ab", "pqrs");

        Assert.assertEquals("apbqrs", output);
    }

    @Test
    public void test3() {
        final MergeStringsAlternately solution = new MergeStringsAlternately();
        final String output = solution.mergeAlternately("abcd", "pq");

        Assert.assertEquals("apbqcd", output);
    }
}
