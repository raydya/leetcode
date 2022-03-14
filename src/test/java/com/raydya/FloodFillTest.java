package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FloodFillTest {

    @Test
    public void test1() {
        final int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        final FloodFill solution = new FloodFill();
        final int[][] output = solution.floodFill(image, 1, 1, 2);

        Assert.assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, output);
    }
}
