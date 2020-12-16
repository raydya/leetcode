package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsIITest {
    @Test
    public void test1() {
        final UniquePathsII solution = new UniquePathsII();
        final int paths = solution.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}});

        Assert.assertEquals(2, paths);
    }

    @Test
    public void test2() {
        final UniquePathsII solution = new UniquePathsII();
        final int paths = solution.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}});

        Assert.assertEquals(1, paths);
    }

    @Test
    public void test3() {
        final UniquePathsII solution = new UniquePathsII();
        final int paths = solution.uniquePathsWithObstacles(new int[][]{{1, 0}});

        Assert.assertEquals(0, paths);
    }

    @Test
    public void test4() {
        final UniquePathsII solution = new UniquePathsII();
        final int paths = solution.uniquePathsWithObstacles(new int[][]{{0, 0}, {1, 1}, {0, 0}});

        Assert.assertEquals(0, paths);
    }
}
