package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CountPairsWhoseSumIsLessThanTargetTest {

    @Test
    public void test1() {
        final CountPairsWhoseSumIsLessThanTarget solution = new CountPairsWhoseSumIsLessThanTarget();
        final int output = solution.countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final CountPairsWhoseSumIsLessThanTarget solution = new CountPairsWhoseSumIsLessThanTarget();
        final int output = solution.countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2);

        Assert.assertEquals(10, output);
    }
}
