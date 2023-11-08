package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheLongestBalancedSubstringOfABinaryStringTest {

    @Test
    public void test1() {
        final FindTheLongestBalancedSubstringOfABinaryString solution = new FindTheLongestBalancedSubstringOfABinaryString();
        final int output = solution.findTheLongestBalancedSubstring("01000111");

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final FindTheLongestBalancedSubstringOfABinaryString solution = new FindTheLongestBalancedSubstringOfABinaryString();
        final int output = solution.findTheLongestBalancedSubstring("00111");

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        final FindTheLongestBalancedSubstringOfABinaryString solution = new FindTheLongestBalancedSubstringOfABinaryString();
        final int output = solution.findTheLongestBalancedSubstring("111");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final FindTheLongestBalancedSubstringOfABinaryString solution = new FindTheLongestBalancedSubstringOfABinaryString();
        final int output = solution.findTheLongestBalancedSubstring("1001");

        Assert.assertEquals(2, output);
    }
}
