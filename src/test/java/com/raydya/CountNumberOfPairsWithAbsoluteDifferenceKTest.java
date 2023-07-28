package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountNumberOfPairsWithAbsoluteDifferenceKTest {

    @Test
    public void test1() {
        final CountNumberOfPairsWithAbsoluteDifferenceK solution = new CountNumberOfPairsWithAbsoluteDifferenceK();
        final int output = solution.countKDifference(new int[]{1, 2, 2, 1}, 1);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final CountNumberOfPairsWithAbsoluteDifferenceK solution = new CountNumberOfPairsWithAbsoluteDifferenceK();
        final int output = solution.countKDifference(new int[]{1, 3}, 3);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final CountNumberOfPairsWithAbsoluteDifferenceK solution = new CountNumberOfPairsWithAbsoluteDifferenceK();
        final int output = solution.countKDifference(new int[]{3, 2, 1, 5, 4}, 2);

        Assert.assertEquals(3, output);
    }
}
