package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SumOfValuesAtIndicesWithKSetBitsTest {

    @Test
    public void test1() {
        final SumOfValuesAtIndicesWithKSetBits solution = new SumOfValuesAtIndicesWithKSetBits();
        final int output = solution.sumIndicesWithKSetBits(Arrays.asList(5, 10, 1, 5, 2), 1);

        Assert.assertEquals(13, output);
    }

    @Test
    public void test2() {
        final SumOfValuesAtIndicesWithKSetBits solution = new SumOfValuesAtIndicesWithKSetBits();
        final int output = solution.sumIndicesWithKSetBits(Arrays.asList(4, 3, 2, 1), 2);

        Assert.assertEquals(1, output);
    }
}
