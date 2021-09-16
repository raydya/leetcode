package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FlippingAnImageTest {
    @Test
    public void test1() {
        final FlippingAnImage solution = new FlippingAnImage();
        final int[][] output = solution.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});

        Assert.assertArrayEquals(new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}}, output);
    }

    @Test
    public void test2() {
        final FlippingAnImage solution = new FlippingAnImage();
        final int[][] output = solution.flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}});

        Assert.assertArrayEquals(new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}}, output);
    }
}
