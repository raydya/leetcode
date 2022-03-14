package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {

    @Test
    public void test1() {
        final UniquePaths solution = new UniquePaths();
        final int uniquePaths = solution.uniquePaths(3, 7);

        Assert.assertEquals(28, uniquePaths);
    }

    @Test
    public void test2() {
        final UniquePaths solution = new UniquePaths();
        final int uniquePaths = solution.uniquePaths(3, 2);

        Assert.assertEquals(3, uniquePaths);
    }

    @Test
    public void test3() {
        final UniquePaths solution = new UniquePaths();
        final int uniquePaths = solution.uniquePaths(7, 3);

        Assert.assertEquals(28, uniquePaths);
    }

    @Test
    public void test4() {
        final UniquePaths solution = new UniquePaths();
        final int uniquePaths = solution.uniquePaths(3, 3);

        Assert.assertEquals(6, uniquePaths);
    }

    @Test
    public void test5() {
        final UniquePaths solution = new UniquePaths();
        final int uniquePaths = solution.uniquePaths(23, 12);

        Assert.assertEquals(193536720, uniquePaths);
    }
}
