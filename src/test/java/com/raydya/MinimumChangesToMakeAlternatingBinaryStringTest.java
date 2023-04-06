package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumChangesToMakeAlternatingBinaryStringTest {

    @Test
    public void test1() {
        final MinimumChangesToMakeAlternatingBinaryString solution = new MinimumChangesToMakeAlternatingBinaryString();
        final int output = solution.minOperations("0100");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MinimumChangesToMakeAlternatingBinaryString solution = new MinimumChangesToMakeAlternatingBinaryString();
        final int output = solution.minOperations("10");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final MinimumChangesToMakeAlternatingBinaryString solution = new MinimumChangesToMakeAlternatingBinaryString();
        final int output = solution.minOperations("1111");

        Assert.assertEquals(2, output);
    }
}
