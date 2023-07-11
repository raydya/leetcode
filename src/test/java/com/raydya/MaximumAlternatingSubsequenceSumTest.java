package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAlternatingSubsequenceSumTest {

    @Test
    public void test1() {
        final MaximumAlternatingSubsequenceSum solution = new MaximumAlternatingSubsequenceSum();
        final long output = solution.maxAlternatingSum(new int[]{4, 2, 5, 3});

        Assert.assertEquals(7, output);
    }

    @Test
    public void test2() {
        final MaximumAlternatingSubsequenceSum solution = new MaximumAlternatingSubsequenceSum();
        final long output = solution.maxAlternatingSum(new int[]{5, 6, 7, 8});

        Assert.assertEquals(8, output);
    }

    @Test
    public void test3() {
        final MaximumAlternatingSubsequenceSum solution = new MaximumAlternatingSubsequenceSum();
        final long output = solution.maxAlternatingSum(new int[]{6, 2, 1, 2, 4, 5});

        Assert.assertEquals(10, output);
    }
}
