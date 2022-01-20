package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Shift2DGridTest {
    @Test
    public void test1() {
        final Shift2DGrid solution = new Shift2DGrid();
        final List<List<Integer>> output = solution.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1);

        Assert.assertArrayEquals(new Integer[]{9, 1, 2}, output.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{3, 4, 5}, output.get(1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{6, 7, 8}, output.get(2).toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        final Shift2DGrid solution = new Shift2DGrid();
        final List<List<Integer>> output = solution.shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4);

        Assert.assertArrayEquals(new Integer[]{12, 0, 21, 13}, output.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{3, 8, 1, 9}, output.get(1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{19, 7, 2, 5}, output.get(2).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{4, 6, 11, 10}, output.get(3).toArray(new Integer[]{}));
    }

    @Test
    public void test3() {
        final Shift2DGrid solution = new Shift2DGrid();
        final List<List<Integer>> output = solution.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9);

        Assert.assertArrayEquals(new Integer[]{1, 2, 3}, output.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{4, 5, 6}, output.get(1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{7, 8, 9}, output.get(2).toArray(new Integer[]{}));
    }

    @Test
    public void test4() {
        final Shift2DGrid solution = new Shift2DGrid();
        final List<List<Integer>> output = solution.shiftGrid(new int[][]{{1}, {2}, {3}, {4}, {7}, {6}, {5}}, 23);

        Assert.assertArrayEquals(new Integer[]{6}, output.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{5}, output.get(1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{1}, output.get(2).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{2}, output.get(3).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{3}, output.get(4).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{4}, output.get(5).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{7}, output.get(6).toArray(new Integer[]{}));
    }
}
