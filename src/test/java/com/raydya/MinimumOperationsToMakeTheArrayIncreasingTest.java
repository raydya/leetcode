package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumOperationsToMakeTheArrayIncreasingTest {

    @Test
    public void test1() {
        final MinimumOperationsToMakeTheArrayIncreasing solution = new MinimumOperationsToMakeTheArrayIncreasing();
        final int output = solution.minOperations(new int[]{1, 1, 1});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MinimumOperationsToMakeTheArrayIncreasing solution = new MinimumOperationsToMakeTheArrayIncreasing();
        final int output = solution.minOperations(new int[]{1, 5, 2, 4, 1});

        Assert.assertEquals(14, output);
    }

    @Test
    public void test3() {
        final MinimumOperationsToMakeTheArrayIncreasing solution = new MinimumOperationsToMakeTheArrayIncreasing();
        final int output = solution.minOperations(new int[]{8});

        Assert.assertEquals(0, output);
    }
}
