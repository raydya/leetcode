package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfOneBitsTest {
    @Test
    public void test1() {
        final String binary = "00000000000000000000000000001011";
        final int input = Integer.parseInt(binary, 2);

        final NumberOfOneBits solution = new NumberOfOneBits();
        final int output = solution.hammingWeight(input);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final String binary = "00000000000000000000000010000000";
        final int input = Integer.parseInt(binary, 2);

        final NumberOfOneBits solution = new NumberOfOneBits();
        final int output = solution.hammingWeight(input);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final NumberOfOneBits solution = new NumberOfOneBits();
        final int output = solution.hammingWeight(-3);

        Assert.assertEquals(31, output);
    }
}
