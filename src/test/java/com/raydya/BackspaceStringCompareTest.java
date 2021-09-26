package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BackspaceStringCompareTest {
    @Test
    public void test1() {
        final BackspaceStringCompare solution = new BackspaceStringCompare();
        final boolean output = solution.backspaceCompare("ab#c", "ad#c");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final BackspaceStringCompare solution = new BackspaceStringCompare();
        final boolean output = solution.backspaceCompare("ab##", "c#d#");

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final BackspaceStringCompare solution = new BackspaceStringCompare();
        final boolean output = solution.backspaceCompare("a##c", "#a#c");

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final BackspaceStringCompare solution = new BackspaceStringCompare();
        final boolean output = solution.backspaceCompare("a#c", "b");

        Assert.assertFalse(output);
    }
}
