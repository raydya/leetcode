package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemovePalindromicSubsequencesTest {

    @Test
    public void test1() {
        final RemovePalindromicSubsequences solution = new RemovePalindromicSubsequences();
        final int output = solution.removePalindromeSub("ababa");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final RemovePalindromicSubsequences solution = new RemovePalindromicSubsequences();
        final int output = solution.removePalindromeSub("abb");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final RemovePalindromicSubsequences solution = new RemovePalindromicSubsequences();
        final int output = solution.removePalindromeSub("baabb");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test4() {
        final RemovePalindromicSubsequences solution = new RemovePalindromicSubsequences();
        final int output = solution.removePalindromeSub("bbaabbaaaaa");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test5() {
        final RemovePalindromicSubsequences solution = new RemovePalindromicSubsequences();
        final int output = solution.removePalindromeSub("aabbbab");

        Assert.assertEquals(2, output);
    }
}
