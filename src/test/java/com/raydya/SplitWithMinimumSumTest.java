package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SplitWithMinimumSumTest {

    @Test
    public void test1() {
        final SplitWithMinimumSum solution = new SplitWithMinimumSum();
        final int output = solution.splitNum(4325);

        Assert.assertEquals(59, output);
    }

    @Test
    public void test2() {
        final SplitWithMinimumSum solution = new SplitWithMinimumSum();
        final int output = solution.splitNum(687);

        Assert.assertEquals(75, output);
    }
}
