package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PartitionEqualSubsetSumTest {
    @Test
    public void test1() {
        final PartitionEqualSubsetSum solution = new PartitionEqualSubsetSum();
        final boolean output = solution.canPartition(new int[]{1, 5, 11, 5});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final PartitionEqualSubsetSum solution = new PartitionEqualSubsetSum();
        final boolean output = solution.canPartition(new int[]{1, 2, 3, 5});

        Assert.assertFalse(output);
    }
}
