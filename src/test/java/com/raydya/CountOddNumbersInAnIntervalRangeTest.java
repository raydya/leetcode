package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountOddNumbersInAnIntervalRangeTest {
    @Test
    public void test1() {
        final CountOddNumbersInAnIntervalRange solution = new CountOddNumbersInAnIntervalRange();
        final int output = solution.countOdds(3, 7);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final CountOddNumbersInAnIntervalRange solution = new CountOddNumbersInAnIntervalRange();
        final int output = solution.countOdds(8, 10);

        Assert.assertEquals(1, output);
    }
}
