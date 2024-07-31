package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRectanglesToCoverPointsTest {

    @Test
    public void test1() {
        final MinimumRectanglesToCoverPoints solution = new MinimumRectanglesToCoverPoints();
        final int output = solution.minRectanglesToCoverPoints(
            new int[][]{
                {2, 1}, {1, 0}, {1, 4}, {1, 8}, {3, 5}, {4, 6}
            },
            1);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final MinimumRectanglesToCoverPoints solution = new MinimumRectanglesToCoverPoints();
        final int output = solution.minRectanglesToCoverPoints(
            new int[][]{
                {0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}
            },
            2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final MinimumRectanglesToCoverPoints solution = new MinimumRectanglesToCoverPoints();
        final int output = solution.minRectanglesToCoverPoints(
            new int[][]{
                {2, 3}, {1, 2}
            },
            0);

        Assert.assertEquals(2, output);
    }
}
