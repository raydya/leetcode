package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfThereIsAValidPartitionForTheArrayTest {

    @Test
    public void test1() {
        final CheckIfThereIsAValidPartitionForTheArray solution = new CheckIfThereIsAValidPartitionForTheArray();
        final boolean output = solution.validPartition(new int[]{4, 4, 4, 5, 6});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfThereIsAValidPartitionForTheArray solution = new CheckIfThereIsAValidPartitionForTheArray();
        final boolean output = solution.validPartition(new int[]{1, 1, 1, 2});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfThereIsAValidPartitionForTheArray solution = new CheckIfThereIsAValidPartitionForTheArray();
        final boolean output = solution.validPartition(new int[]{803201, 803201, 803201, 803201, 803202, 803203});

        Assert.assertTrue(output);
    }
}
