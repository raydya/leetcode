package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PalindromicSubstringsTest {
    @Test
    public void test1() {
        final PalindromicSubstrings solution = new PalindromicSubstrings();
        final int output = solution.countSubstrings("abc");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final PalindromicSubstrings solution = new PalindromicSubstrings();
        final int output = solution.countSubstrings("aaa");

        Assert.assertEquals(6, output);
    }
}
