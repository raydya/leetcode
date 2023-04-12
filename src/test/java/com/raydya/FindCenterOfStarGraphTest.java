package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindCenterOfStarGraphTest {

    @Test
    public void test1() {
        final FindCenterOfStarGraph solution = new FindCenterOfStarGraph();
        final int output = solution.findCenter(new int[][]{
            {1, 2},
            {2, 3},
            {4, 2}
        });

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindCenterOfStarGraph solution = new FindCenterOfStarGraph();
        final int output = solution.findCenter(new int[][]{
            {1, 2},
            {5, 1},
            {1, 3},
            {1, 4},
        });

        Assert.assertEquals(1, output);
    }
}
