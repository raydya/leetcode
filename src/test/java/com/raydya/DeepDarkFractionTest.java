package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DeepDarkFractionTest {
    @Test
    public void test1() {
        final DeepDarkFraction solution = new DeepDarkFraction();
        final int[] output = solution.fraction(new int[]{3, 2, 0, 2});

        Assert.assertArrayEquals(new int[]{13, 4}, output);
    }

    @Test
    public void test2() {
        final DeepDarkFraction solution = new DeepDarkFraction();
        final int[] output = solution.fraction(new int[]{0, 0, 3});

        Assert.assertArrayEquals(new int[]{3, 1}, output);
    }
}
