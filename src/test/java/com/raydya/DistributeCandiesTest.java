package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DistributeCandiesTest {
    @Test
    public void test1() {
        final DistributeCandies solution = new DistributeCandies();
        final int output = solution.distributeCandies(new int[]{1, 1, 2, 2, 3, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final DistributeCandies solution = new DistributeCandies();
        final int output = solution.distributeCandies(new int[]{1, 1, 2, 3});

        Assert.assertEquals(2, output);
    }
}
