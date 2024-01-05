package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPointsTest {

    @Test
    public void test1() {
        final WidestVerticalAreaBetweenTwoPointsContainingNoPoints solution = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();
        final int output = solution.maxWidthOfVerticalArea(new int[][]{
            {8, 7},
            {9, 9},
            {7, 4},
            {9, 7}
        });

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final WidestVerticalAreaBetweenTwoPointsContainingNoPoints solution = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();
        final int output = solution.maxWidthOfVerticalArea(new int[][]{
            {3, 1},
            {9, 0},
            {1, 0},
            {1, 4},
            {5, 3},
            {8, 8}
        });

        Assert.assertEquals(3, output);
    }
}
