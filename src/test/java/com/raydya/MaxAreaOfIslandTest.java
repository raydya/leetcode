package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaxAreaOfIslandTest {

    @Test
    public void test1() {
        final int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        final MaxAreaOfIsland solution = new MaxAreaOfIsland();
        final int output = solution.maxAreaOfIsland(grid);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final int[][] grid = {{0, 0, 0, 0, 0, 0, 0, 0}};

        final MaxAreaOfIsland solution = new MaxAreaOfIsland();
        final int output = solution.maxAreaOfIsland(grid);

        Assert.assertEquals(0, output);
    }

}
