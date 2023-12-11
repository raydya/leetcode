package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PathWithMinimumEffortTest {

    @Test
    public void test1() {
        final PathWithMinimumEffort solution = new PathWithMinimumEffort();
        final int output = solution.minimumEffortPath(new int[][]{
            {1, 2, 2},
            {3, 8, 2},
            {5, 3, 5}
        });

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final PathWithMinimumEffort solution = new PathWithMinimumEffort();
        final int output = solution.minimumEffortPath(new int[][]{
            {1, 2, 3},
            {3, 8, 4},
            {5, 3, 5}
        });

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final PathWithMinimumEffort solution = new PathWithMinimumEffort();
        final int output = solution.minimumEffortPath(new int[][]{
            {1, 2, 1, 1, 1},
            {1, 2, 1, 2, 1},
            {1, 2, 1, 2, 1},
            {1, 2, 1, 2, 1},
            {1, 1, 1, 2, 1}
        });

        Assert.assertEquals(0, output);
    }
}
