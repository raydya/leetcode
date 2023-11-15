package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSumWithExactlyKElementsTest {

    @Test
    public void test1() {
        final MaximumSumWithExactlyKElements solution = new MaximumSumWithExactlyKElements();
        final int output = solution.maximizeSum(new int[]{1, 2, 3, 4, 5}, 3);

        Assert.assertEquals(18, output);
    }

    @Test
    public void test2() {
        final MaximumSumWithExactlyKElements solution = new MaximumSumWithExactlyKElements();
        final int output = solution.maximizeSum(new int[]{5, 5, 5}, 2);

        Assert.assertEquals(11, output);
    }
}
