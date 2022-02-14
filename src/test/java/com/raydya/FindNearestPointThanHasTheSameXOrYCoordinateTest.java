package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindNearestPointThanHasTheSameXOrYCoordinateTest {
    @Test
    public void test1() {
        final FindNearestPointThatHasTheSameXOrYCoordinate solution = new FindNearestPointThatHasTheSameXOrYCoordinate();
        final int output = solution.nearestValidPoint(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindNearestPointThatHasTheSameXOrYCoordinate solution = new FindNearestPointThatHasTheSameXOrYCoordinate();
        final int output = solution.nearestValidPoint(3, 4, new int[][]{{3, 4}});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final FindNearestPointThatHasTheSameXOrYCoordinate solution = new FindNearestPointThatHasTheSameXOrYCoordinate();
        final int output = solution.nearestValidPoint(3, 4, new int[][]{{2, 3}});

        Assert.assertEquals(-1, output);
    }
}
