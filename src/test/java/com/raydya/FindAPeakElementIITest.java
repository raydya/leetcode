package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindAPeakElementIITest {

    @Test
    public void test1() {
        final FindAPeakElementII solution = new FindAPeakElementII();
        final int[] output = solution.findPeakGrid(new int[][]{
            {1, 4},
            {3, 2}
        });

        Assert.assertArrayEquals(new int[]{1, 0}, output);
    }

    @Test
    public void test2() {
        final FindAPeakElementII solution = new FindAPeakElementII();
        final int[] output = solution.findPeakGrid(new int[][]{
            {10, 20, 15},
            {21, 30, 14},
            {7, 16, 32}
        });

        Assert.assertArrayEquals(new int[]{1, 1}, output);
    }
}
