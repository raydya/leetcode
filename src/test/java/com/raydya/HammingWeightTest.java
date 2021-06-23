package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HammingWeightTest {
    @Test
    public void test1() {
        final int n = Integer.parseInt("00000000000000000000000000001011", 2);
        final HammingWeight solution = new HammingWeight();
        final int output = solution.hammingWeight(n);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final int n = Integer.parseInt("00000000000000000000000010000000", 2);
        final HammingWeight solution = new HammingWeight();
        final int output = solution.hammingWeight(n);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final long n = Long.parseLong("11111111111111111111111111111101", 2);
        final HammingWeight solution = new HammingWeight();
        final int output = solution.hammingWeight((int) n);

        Assert.assertEquals(31, output);
    }
}
