package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CombinationSumIVTest {

    @Test
    public void test1() {
        final CombinationSumIV solution = new CombinationSumIV();
        final int output = solution.combinationSum4(new int[]{1, 2, 3}, 4);

        Assert.assertEquals(7, output);
    }

    @Test
    public void test2() {
        final CombinationSumIV solution = new CombinationSumIV();
        final int output = solution.combinationSum4(new int[]{9}, 3);

        Assert.assertEquals(0, output);
    }
}
