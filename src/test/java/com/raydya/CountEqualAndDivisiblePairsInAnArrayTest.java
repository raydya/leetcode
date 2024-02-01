package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountEqualAndDivisiblePairsInAnArrayTest {

    @Test
    public void test1() {
        final CountEqualAndDivisiblePairsInAnArray solution = new CountEqualAndDivisiblePairsInAnArray();
        final int output = solution.countPairs(new int[]{3, 1, 2, 2, 2, 1, 3}, 2);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final CountEqualAndDivisiblePairsInAnArray solution = new CountEqualAndDivisiblePairsInAnArray();
        final int output = solution.countPairs(new int[]{1, 2, 3, 4}, 1);

        Assert.assertEquals(0, output);
    }
}
