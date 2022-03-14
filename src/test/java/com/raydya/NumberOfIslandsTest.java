package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandsTest {

    @Test
    public void test1() {
        final char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        final NumberOfIslands solution = new NumberOfIslands();
        final int output = solution.numIslands(grid);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        final NumberOfIslands solution = new NumberOfIslands();
        final int output = solution.numIslands(grid);

        Assert.assertEquals(3, output);
    }
}
