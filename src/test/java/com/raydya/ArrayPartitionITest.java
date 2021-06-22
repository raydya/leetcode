package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartitionITest {
    @Test
    public void test1() {
        final ArrayPartitionI solution = new ArrayPartitionI();
        final int output = solution.arrayPairSum(new int[]{1, 4, 3, 2});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final ArrayPartitionI solution = new ArrayPartitionI();
        final int output = solution.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2});

        Assert.assertEquals(9, output);
    }
}
