package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckWhetherTwoStringsAreAlmostEquivalentTest {

    @Test
    public void test1() {
        final CheckWhetherTwoStringsAreAlmostEquivalent solution = new CheckWhetherTwoStringsAreAlmostEquivalent();
        final boolean output = solution.checkAlmostEquivalent("aaaa", "bccb");

        Assert.assertFalse(output);
    }

    @Test
    public void test2() {
        final CheckWhetherTwoStringsAreAlmostEquivalent solution = new CheckWhetherTwoStringsAreAlmostEquivalent();
        final boolean output = solution.checkAlmostEquivalent("abcdeef", "abaaacc");

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final CheckWhetherTwoStringsAreAlmostEquivalent solution = new CheckWhetherTwoStringsAreAlmostEquivalent();
        final boolean output = solution.checkAlmostEquivalent("cccddabba", "babababab");

        Assert.assertTrue(output);
    }
}
