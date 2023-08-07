package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class Convert1DArrayInto2DArrayTest {

    @Test
    public void test1() {
        final Convert1DArrayInto2DArray solution = new Convert1DArrayInto2DArray();
        final int[][] output = solution.construct2DArray(new int[]{1, 2, 3, 4}, 2, 2);

        Assert.assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, output);
    }

    @Test
    public void test2() {
        final Convert1DArrayInto2DArray solution = new Convert1DArrayInto2DArray();
        final int[][] output = solution.construct2DArray(new int[]{1, 2, 3}, 1, 3);

        Assert.assertArrayEquals(new int[][]{{1, 2, 3}}, output);
    }

    @Test
    public void test3() {
        final Convert1DArrayInto2DArray solution = new Convert1DArrayInto2DArray();
        final int[][] output = solution.construct2DArray(new int[]{1, 2}, 1, 1);

        Assert.assertArrayEquals(new int[][]{}, output);
    }

    @Test
    public void test4() {
        final Convert1DArrayInto2DArray solution = new Convert1DArrayInto2DArray();
        final int[][] output = solution.construct2DArray(new int[]{3}, 1, 2);

        Assert.assertArrayEquals(new int[][]{}, output);
    }
}
