package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistanceTest {

    @Test
    public void test1() {
        final FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance solution = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance();
        final int output = solution.findTheCity(4, new int[][]{
            {0, 1, 3},
            {1, 2, 1},
            {1, 3, 4},
            {2, 3, 1}
        }, 4);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance solution = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance();
        final int output = solution.findTheCity(5, new int[][]{
            {0, 1, 2},
            {0, 4, 8},
            {1, 2, 3},
            {1, 4, 2},
            {2, 3, 1},
            {3, 4, 1}
        }, 2);

        Assert.assertEquals(0, output);
    }
}
