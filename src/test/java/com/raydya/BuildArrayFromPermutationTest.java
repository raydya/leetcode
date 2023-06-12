package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BuildArrayFromPermutationTest {

    @Test
    public void test1() {
        final BuildArrayFromPermutation solution = new BuildArrayFromPermutation();
        final int[] output = solution.buildArray(new int[]{0, 2, 1, 5, 3, 4});

        Assert.assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, output);
    }

    @Test
    public void test2() {
        final BuildArrayFromPermutation solution = new BuildArrayFromPermutation();
        final int[] output = solution.buildArray(new int[]{5, 0, 1, 2, 3, 4});

        Assert.assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, output);
    }
}
