package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class IslandPerimeterTest {
    @Test
    public void test1() {
        final int[][] grid = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        final IslandPerimeter solution = new IslandPerimeter();
        final int output = solution.islandPerimeter(grid);

        Assert.assertEquals(16, output);
    }

    @Test
    public void test2() {
        final IslandPerimeter solution = new IslandPerimeter();
        final int output = solution.islandPerimeter(new int[][]{{1}});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        final IslandPerimeter solution = new IslandPerimeter();
        final int output = solution.islandPerimeter(new int[][]{{1, 0}});

        Assert.assertEquals(4, output);
    }
}
