package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumTimeVisitingAllPointsTest {

    @Test
    public void test1() {
        final MinimumTimeVisitingAllPoints solution = new MinimumTimeVisitingAllPoints();
        final int output = solution.minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}});

        Assert.assertEquals(7, output);
    }

    @Test
    public void test2() {
        final MinimumTimeVisitingAllPoints solution = new MinimumTimeVisitingAllPoints();
        final int output = solution.minTimeToVisitAllPoints(new int[][]{{3, 2}, {-2, 2}});

        Assert.assertEquals(5, output);
    }
}
