package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberOfOccurrencesTest {
    @Test
    public void test1() {
        final UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();
        final boolean output = solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();
        final boolean output = solution.uniqueOccurrences(new int[]{1, 2});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();
        final boolean output = solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0});

        Assert.assertTrue(output);
    }
}
