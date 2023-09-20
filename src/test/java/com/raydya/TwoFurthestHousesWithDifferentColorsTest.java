package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TwoFurthestHousesWithDifferentColorsTest {

    @Test
    public void test1() {
        final TwoFurthestHousesWithDifferentColors solution = new TwoFurthestHousesWithDifferentColors();
        final int output = solution.maxDistance(new int[]{1, 1, 1, 6, 1, 1, 1});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final TwoFurthestHousesWithDifferentColors solution = new TwoFurthestHousesWithDifferentColors();
        final int output = solution.maxDistance(new int[]{1, 8, 3, 8, 3});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        final TwoFurthestHousesWithDifferentColors solution = new TwoFurthestHousesWithDifferentColors();
        final int output = solution.maxDistance(new int[]{0, 1});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final TwoFurthestHousesWithDifferentColors solution = new TwoFurthestHousesWithDifferentColors();
        final int output = solution.maxDistance(new int[]{4, 4, 4, 11, 4, 4, 11, 4, 4, 4, 4, 4});

        Assert.assertEquals(8, output);
    }
}
