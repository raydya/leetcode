package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class IntersectionOfMultipleArraysTest {

    @Test
    public void test1() {
        final IntersectionOfMultipleArrays solution = new IntersectionOfMultipleArrays();
        final List<Integer> output = solution.intersection(
            new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}});

        Assert.assertArrayEquals(new Integer[]{3, 4}, output.toArray());
    }

    @Test
    public void test2() {
        final IntersectionOfMultipleArrays solution = new IntersectionOfMultipleArrays();
        final List<Integer> output = solution.intersection(
            new int[][]{
                {1, 2, 3},
                {4, 5, 6}
            }
        );

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }
}
