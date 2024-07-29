package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestPositiveIntegerThatExistsWithItsNegativeTest {

    @Test
    public void test1() {
        final LargestPositiveIntegerThatExistsWithItsNegative solution = new LargestPositiveIntegerThatExistsWithItsNegative();
        final int output = solution.findMaxK(new int[]{-1, 2, -3, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final LargestPositiveIntegerThatExistsWithItsNegative solution = new LargestPositiveIntegerThatExistsWithItsNegative();
        final int output = solution.findMaxK(new int[]{-1, 10, 6, 7, -7, 1});

        Assert.assertEquals(7, output);
    }

    @Test
    public void test3() {
        final LargestPositiveIntegerThatExistsWithItsNegative solution = new LargestPositiveIntegerThatExistsWithItsNegative();
        final int output = solution.findMaxK(new int[]{-10, 8, 6, 7, -2, -3});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final LargestPositiveIntegerThatExistsWithItsNegative solution = new LargestPositiveIntegerThatExistsWithItsNegative();
        final int output = solution.findMaxK(new int[]{14, 33, 40, -33, 8, -24, -42, 30, -18, -34});

        Assert.assertEquals(33, output);
    }

    @Test
    public void test5() {
        final LargestPositiveIntegerThatExistsWithItsNegative solution = new LargestPositiveIntegerThatExistsWithItsNegative();
        final int output = solution.findMaxK(new int[]{648, 674, 610});

        Assert.assertEquals(-1, output);
    }
}
