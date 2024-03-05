package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWaysToArriveAtDestinationTest {

    @Test
    public void test1() {
        final NumberOfWaysToArriveAtDestination solution = new NumberOfWaysToArriveAtDestination();
        final int output = solution.countPaths(7,
            new int[][]{
                {0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, {3, 5, 1}, {6, 5, 1}, {2, 5, 1},
                {0, 4, 5}, {4, 6, 2}
            }
        );

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final NumberOfWaysToArriveAtDestination solution = new NumberOfWaysToArriveAtDestination();
        final int output = solution.countPaths(2, new int[][]{{1, 0, 10}});

        Assert.assertEquals(1, output);
    }
}
