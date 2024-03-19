package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindClosestNumberToZeroTest {

    @Test
    public void test1() {
        final FindClosestNumberToZero solution = new FindClosestNumberToZero();
        final int output = solution.findClosestNumber(new int[]{-4, -2, 1, 4, 8});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final FindClosestNumberToZero solution = new FindClosestNumberToZero();
        final int output = solution.findClosestNumber(new int[]{2, -1, 1});

        Assert.assertEquals(1, output);
    }
}
