package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {

    @Test
    public void test1() {
        final ReorderRoutesToMakeAllPathsLeadToTheCityZero solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        final int output = solution.minReorder(6, new int[][]{
            {0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}
        });

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final ReorderRoutesToMakeAllPathsLeadToTheCityZero solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        final int output = solution.minReorder(5, new int[][]{
            {1, 0}, {1, 2}, {3, 2}, {3, 4}
        });

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final ReorderRoutesToMakeAllPathsLeadToTheCityZero solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        final int output = solution.minReorder(3, new int[][]{
            {1, 0}, {2, 0}
        });

        Assert.assertEquals(0, output);
    }

}
