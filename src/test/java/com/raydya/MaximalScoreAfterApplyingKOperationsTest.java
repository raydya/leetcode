package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximalScoreAfterApplyingKOperationsTest {

    @Test
    public void test1() {
        final MaximalScoreAfterApplyingKOperations solution = new MaximalScoreAfterApplyingKOperations();
        final long output = solution.maxKelements(new int[]{10, 10, 10, 10, 10}, 5);

        Assert.assertEquals(50, output);
    }

    @Test
    public void test2() {
        final MaximalScoreAfterApplyingKOperations solution = new MaximalScoreAfterApplyingKOperations();
        final long output = solution.maxKelements(new int[]{1, 10, 3, 3, 3}, 3);

        Assert.assertEquals(17, output);
    }

    @Test
    public void test3() {
        final MaximalScoreAfterApplyingKOperations solution = new MaximalScoreAfterApplyingKOperations();
        final long output = solution.maxKelements(new int[]{672579538, 806947365, 854095676, 815137524}, 3);

        Assert.assertEquals(2476180565L, output);
    }
}
