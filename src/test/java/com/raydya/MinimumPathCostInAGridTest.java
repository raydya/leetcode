package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumPathCostInAGridTest {

    @Test
    public void test1() {
        final MinimumPathCostInAGrid solution = new MinimumPathCostInAGrid();
        final int output = solution.minPathCost(
            new int[][]{
                {5, 3},
                {4, 0},
                {2, 1}
            },
            new int[][]{
                {9, 8},
                {1, 5},
                {10, 12},
                {18, 6},
                {2, 4},
                {14, 3}
            }
        );

        Assert.assertEquals(17, output);
    }

    @Test
    public void test2() {
        final MinimumPathCostInAGrid solution = new MinimumPathCostInAGrid();
        final int output = solution.minPathCost(
            new int[][]{
                {5, 1, 2},
                {4, 0, 3}
            },
            new int[][]{
                {12, 10, 15},
                {20, 23, 8},
                {21, 7, 1},
                {8, 1, 13},
                {9, 10, 25},
                {5, 3, 2}
            }
        );

        Assert.assertEquals(6, output);
    }
}
