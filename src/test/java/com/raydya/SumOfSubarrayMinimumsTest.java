package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SumOfSubarrayMinimumsTest {

    @Test
    public void test1() {
        final SumOfSubarrayMinimums solution = new SumOfSubarrayMinimums();
        final int output = solution.sumSubarrayMins(new int[]{3, 1, 2, 4});

        Assert.assertEquals(17, output);
    }

    @Test
    public void test2() {
        final SumOfSubarrayMinimums solution = new SumOfSubarrayMinimums();
        final int output = solution.sumSubarrayMins(new int[]{11, 81, 94, 43, 3});

        Assert.assertEquals(444, output);
    }

}
