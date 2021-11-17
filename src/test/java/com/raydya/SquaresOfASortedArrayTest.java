package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SquaresOfASortedArrayTest {
    @Test
    public void test1() {
        final SquaresOfASortedArray solution = new SquaresOfASortedArray();
        final int[] output = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});

        Assert.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, output);
    }

    @Test
    public void test2() {
        final SquaresOfASortedArray solution = new SquaresOfASortedArray();
        final int[] output = solution.sortedSquares(new int[]{-7, -3, 2, 3, 11});

        Assert.assertArrayEquals(new int[]{4, 9, 9, 49, 121}, output);
    }
}
