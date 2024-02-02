package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class StoneGameVITest {

    @Test
    public void test1() {
        final StoneGameVI solution = new StoneGameVI();
        final int output = solution.stoneGameVI(new int[]{1, 3}, new int[]{2, 1});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final StoneGameVI solution = new StoneGameVI();
        final int output = solution.stoneGameVI(new int[]{1, 2}, new int[]{3, 1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final StoneGameVI solution = new StoneGameVI();
        final int output = solution.stoneGameVI(new int[]{2, 4, 3}, new int[]{1, 6, 7});

        Assert.assertEquals(-1, output);
    }
}
