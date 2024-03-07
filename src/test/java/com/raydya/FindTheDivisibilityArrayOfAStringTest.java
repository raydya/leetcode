package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDivisibilityArrayOfAStringTest {

    @Test
    public void test1() {
        final FindTheDivisibilityArrayOfAString solution = new FindTheDivisibilityArrayOfAString();
        final int[] output = solution.divisibilityArray("998244353", 3);

        Assert.assertArrayEquals(new int[]{
            1, 1, 0, 0, 0, 1, 1, 0, 0
        }, output);
    }

    @Test
    public void test2() {
        final FindTheDivisibilityArrayOfAString solution = new FindTheDivisibilityArrayOfAString();
        final int[] output = solution.divisibilityArray("1010", 10);

        Assert.assertArrayEquals(new int[]{
            0, 1, 0, 1
        }, output);
    }
}
