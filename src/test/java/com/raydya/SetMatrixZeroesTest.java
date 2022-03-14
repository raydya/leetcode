package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SetMatrixZeroesTest {

    @Test
    public void test1() {
        final int[][] input = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        final SetMatrixZeroes solution = new SetMatrixZeroes();
        solution.setZeroes(input);

        Assert.assertArrayEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, input);
    }

    @Test
    public void test2() {
        final int[][] input = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        final SetMatrixZeroes solution = new SetMatrixZeroes();
        solution.setZeroes(input);

        Assert.assertArrayEquals(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}}, input);
    }
}
