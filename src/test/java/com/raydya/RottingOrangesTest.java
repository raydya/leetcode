package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RottingOrangesTest {

    @Test
    public void test1() {
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        RottingOranges solution = new RottingOranges();
        int output = solution.orangesRotting(grid);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        int[][] grid = {
            {2, 1, 1},
            {0, 1, 1},
            {1, 0, 1}
        };

        RottingOranges solution = new RottingOranges();
        int output = solution.orangesRotting(grid);

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        int[][] grid = {
            {0, 2}
        };

        RottingOranges solution = new RottingOranges();
        int output = solution.orangesRotting(grid);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        int[][] grid = {
            {0}
        };

        RottingOranges solution = new RottingOranges();
        int output = solution.orangesRotting(grid);

        Assert.assertEquals(0, output);
    }
}
