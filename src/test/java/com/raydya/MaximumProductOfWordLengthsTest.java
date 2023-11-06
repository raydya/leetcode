package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductOfWordLengthsTest {

    @Test
    public void test1() {
        final MaximumProductOfWordLengths solution = new MaximumProductOfWordLengths();
        final int output = solution.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"});

        Assert.assertEquals(16, output);
    }

    @Test
    public void test2() {
        final MaximumProductOfWordLengths solution = new MaximumProductOfWordLengths();
        final int output = solution.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        final MaximumProductOfWordLengths solution = new MaximumProductOfWordLengths();
        final int output = solution.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"});

        Assert.assertEquals(0, output);
    }
}
