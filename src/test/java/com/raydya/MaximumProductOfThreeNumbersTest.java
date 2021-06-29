package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductOfThreeNumbersTest {
    @Test
    public void test1() {
        final MaximumProductOfThreeNumbers solution = new MaximumProductOfThreeNumbers();
        final int output = solution.maximumProduct(new int[]{1, 2, 3});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final MaximumProductOfThreeNumbers solution = new MaximumProductOfThreeNumbers();
        final int output = solution.maximumProduct(new int[]{1, 2, 3, 4});

        Assert.assertEquals(24, output);
    }

    @Test
    public void test3() {
        final MaximumProductOfThreeNumbers solution = new MaximumProductOfThreeNumbers();
        final int output = solution.maximumProduct(new int[]{-1, -2, -3});

        Assert.assertEquals(-6, output);
    }

    @Test
    public void test4() {
        final MaximumProductOfThreeNumbers solution = new MaximumProductOfThreeNumbers();
        final int output = solution.maximumProduct(new int[]{-4, -2, 1, 2, 3});

        Assert.assertEquals(24, output);
    }
}
