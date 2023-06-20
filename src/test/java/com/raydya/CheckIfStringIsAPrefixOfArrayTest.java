package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfStringIsAPrefixOfArrayTest {

    @Test
    public void test1() {
        final CheckIfStringIsAPrefixOfArray solution = new CheckIfStringIsAPrefixOfArray();
        final boolean output = solution.isPrefixString(
            "iloveleetcode",
            new String[]{"i", "love", "leetcode", "apples"}
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfStringIsAPrefixOfArray solution = new CheckIfStringIsAPrefixOfArray();
        final boolean output = solution.isPrefixString(
            "iloveleetcode",
            new String[]{"apples", "i", "love", "leetcode"}
        );

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfStringIsAPrefixOfArray solution = new CheckIfStringIsAPrefixOfArray();
        final boolean output = solution.isPrefixString(
            "a",
            new String[]{"aa", "aaaa", "banana"}
        );

        Assert.assertFalse(output);
    }
}
