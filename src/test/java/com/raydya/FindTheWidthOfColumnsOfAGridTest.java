package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheWidthOfColumnsOfAGridTest {

    @Test
    public void test1() {
        final FindTheWidthOfColumnsOfAGrid solution = new FindTheWidthOfColumnsOfAGrid();
        final int[] output = solution.findColumnWidth(new int[][]{
            {1},
            {22},
            {333}
        });

        Assert.assertArrayEquals(new int[]{3}, output);
    }

    @Test
    public void test2() {
        final FindTheWidthOfColumnsOfAGrid solution = new FindTheWidthOfColumnsOfAGrid();
        final int[] output = solution.findColumnWidth(new int[][]{
            {-15, 1, 3},
            {15, 7, 12},
            {5, 6, -2}
        });

        Assert.assertArrayEquals(new int[]{3, 1, 2}, output);
    }
}
