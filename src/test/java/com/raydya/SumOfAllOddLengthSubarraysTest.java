package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SumOfAllOddLengthSubarraysTest {

    @Test
    public void test1() {
        final SumOfAllOddLengthSubarrays solution = new SumOfAllOddLengthSubarrays();
        final int output = solution.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3});

        Assert.assertEquals(58, output);
    }

    @Test
    public void test2() {
        final SumOfAllOddLengthSubarrays solution = new SumOfAllOddLengthSubarrays();
        final int output = solution.sumOddLengthSubarrays(new int[]{1, 2});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final SumOfAllOddLengthSubarrays solution = new SumOfAllOddLengthSubarrays();
        final int output = solution.sumOddLengthSubarrays(new int[]{10, 11, 12});

        Assert.assertEquals(66, output);
    }
}
