package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfRectanglesThatCanFormTheLargestSquareTest {

    @Test
    public void test1() {
        final NumberOfRectanglesThatCanFormTheLargestSquare solution = new NumberOfRectanglesThatCanFormTheLargestSquare();
        final int output = solution.countGoodRectangles(new int[][]{
            {5, 8},
            {3, 9},
            {5, 12},
            {16, 5}
        });

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final NumberOfRectanglesThatCanFormTheLargestSquare solution = new NumberOfRectanglesThatCanFormTheLargestSquare();
        final int output = solution.countGoodRectangles(new int[][]{
            {2, 3},
            {3, 7},
            {4, 3},
            {3, 7}
        });

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final NumberOfRectanglesThatCanFormTheLargestSquare solution = new NumberOfRectanglesThatCanFormTheLargestSquare();
        final int output = solution.countGoodRectangles(new int[][]{
            {5, 8},
            {3, 9},
            {3, 12}
        });

        Assert.assertEquals(1, output);
    }
}
