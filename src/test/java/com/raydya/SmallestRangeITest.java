package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SmallestRangeITest {
    @Test
    public void test1() {
        final SmallestRangeI solution = new SmallestRangeI();
        final int output = solution.smallestRangeI(new int[]{1}, 0);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test2() {
        final SmallestRangeI solution = new SmallestRangeI();
        final int output = solution.smallestRangeI(new int[]{0, 10}, 2);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final SmallestRangeI solution = new SmallestRangeI();
        final int output = solution.smallestRangeI(new int[]{1, 3, 6}, 3);

        Assert.assertEquals(0, output);
    }
}
