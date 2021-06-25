package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CanPlaceFlowersTest {
    @Test
    public void test1() {
        final CanPlaceFlowers solution = new CanPlaceFlowers();
        final boolean output = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CanPlaceFlowers solution = new CanPlaceFlowers();
        final boolean output = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CanPlaceFlowers solution = new CanPlaceFlowers();
        final boolean output = solution.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1);

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final CanPlaceFlowers solution = new CanPlaceFlowers();
        final boolean output = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2);

        Assert.assertFalse(output);
    }
}
