package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReshapeTheMatrixTest {
    @Test
    public void test1() {
        final ReshapeTheMatrix solution = new ReshapeTheMatrix();
        final int[][] output = solution.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);

        Assert.assertArrayEquals(new int[][]{{1, 2, 3, 4}}, output);
    }

    @Test
    public void test2() {
        final ReshapeTheMatrix solution = new ReshapeTheMatrix();
        final int[][] output = solution.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4);

        Assert.assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, output);
    }
}
