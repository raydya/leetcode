package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleStringTest {

    @Test
    public void test1() {
        final ShuffleString solution = new ShuffleString();
        final String output = solution.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 1, 2, 3});

        Assert.assertEquals("leetcode", output);
    }

    @Test
    public void test2() {
        final ShuffleString solution = new ShuffleString();
        final String output = solution.restoreString("abc", new int[]{0, 1, 2});

        Assert.assertEquals("abc", output);
    }

    @Test
    public void test3() {
        final ShuffleString solution = new ShuffleString();
        final String output = solution.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});

        Assert.assertEquals("leetcode", output);
    }
}
