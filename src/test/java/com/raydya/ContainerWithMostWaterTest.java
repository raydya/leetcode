package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void test1() {
        final ContainerWithMostWater solution = new ContainerWithMostWater();
        final int maxArea = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        Assert.assertEquals(49, maxArea);
    }

    @Test
    public void test2() {
        final ContainerWithMostWater solution = new ContainerWithMostWater();
        final int maxArea = solution.maxArea(new int[]{1, 1});

        Assert.assertEquals(1, maxArea);
    }

    @Test
    public void test3() {
        final ContainerWithMostWater solution = new ContainerWithMostWater();
        final int maxArea = solution.maxArea(new int[]{4, 3, 2, 1, 4});

        Assert.assertEquals(16, maxArea);
    }

    @Test
    public void test4() {
        final ContainerWithMostWater solution = new ContainerWithMostWater();
        final int maxArea = solution.maxArea(new int[]{1, 2, 1});

        Assert.assertEquals(2, maxArea);
    }
}
