package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestLocalValuesInAMatrixTest {

    @Test
    public void test1() {
        final LargestLocalValuesInAMatrix solution = new LargestLocalValuesInAMatrix();
        final int[][] output = solution.largestLocal(new int[][]{
            {9, 9, 8, 1},
            {5, 6, 2, 6},
            {8, 2, 6, 4},
            {6, 2, 2, 2}
        });

        Assert.assertArrayEquals(new int[][]{{9, 9}, {8, 6}}, output);
    }

    @Test
    public void test2() {
        final LargestLocalValuesInAMatrix solution = new LargestLocalValuesInAMatrix();
        final int[][] output = solution.largestLocal(new int[][]{
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 2, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
        });

        Assert.assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}}, output);
    }
}
