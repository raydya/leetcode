package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindTheDifferenceOfTwoArraysTest {

    @Test
    public void test1() {
        final FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();
        final List<List<Integer>> output = solution.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});

        Assert.assertArrayEquals(new Integer[]{1, 3}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{4, 6}, output.get(1).toArray());
    }

    @Test
    public void test2() {
        final FindTheDifferenceOfTwoArrays solution = new FindTheDifferenceOfTwoArrays();
        final List<List<Integer>> output = solution.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});

        Assert.assertArrayEquals(new Integer[]{3}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{}, output.get(1).toArray());
    }
}
