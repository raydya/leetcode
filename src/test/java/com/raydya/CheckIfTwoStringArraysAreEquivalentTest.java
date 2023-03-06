package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfTwoStringArraysAreEquivalentTest {

    @Test
    public void test1() {
        final CheckIfTwoStringArraysAreEquivalent solution = new CheckIfTwoStringArraysAreEquivalent();
        final boolean output = solution.arrayStringsAreEqual(
            new String[]{"ab", "c"},
            new String[]{"a", "bc"}
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfTwoStringArraysAreEquivalent solution = new CheckIfTwoStringArraysAreEquivalent();
        final boolean output = solution.arrayStringsAreEqual(
            new String[]{"a", "cb"},
            new String[]{"ab", "c"}
        );

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfTwoStringArraysAreEquivalent solution = new CheckIfTwoStringArraysAreEquivalent();
        final boolean output = solution.arrayStringsAreEqual(
            new String[]{"abc", "d", "defg"},
            new String[]{"abcddefg"}
        );

        Assert.assertTrue(output);
    }
}
