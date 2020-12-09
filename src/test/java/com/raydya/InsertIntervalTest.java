package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class InsertIntervalTest {
    @Test
    public void test1() {
        final int[][] intervals = {
            {1, 3}, {6, 9}
        };

        final int[] newInterval = {2, 5};

        final InsertInterval solution = new InsertInterval();
        final int[][] output = solution.insert(intervals, newInterval);

        Assert.assertArrayEquals(
            new int[][]{{1, 5}, {6, 9}},
            output
        );
    }

    @Test
    public void test2() {
        final int[][] intervals = {
            {1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16},
        };

        final int[] newInterval = {4, 8};

        final InsertInterval solution = new InsertInterval();
        final int[][] output = solution.insert(intervals, newInterval);

        Assert.assertArrayEquals(
            new int[][]{{1, 2}, {3, 10}, {12, 16}},
            output
        );
    }

    @Test
    public void test3() {
        final int[][] intervals = {};

        final int[] newInterval = {5, 7};

        final InsertInterval solution = new InsertInterval();
        final int[][] output = solution.insert(intervals, newInterval);

        Assert.assertArrayEquals(
            new int[][]{{5, 7}},
            output
        );
    }

    @Test
    public void test4() {
        final int[][] intervals = {{1, 5}};

        final int[] newInterval = {2, 3};

        final InsertInterval solution = new InsertInterval();
        final int[][] output = solution.insert(intervals, newInterval);

        Assert.assertArrayEquals(
            new int[][]{{1, 5}},
            output
        );
    }

    @Test
    public void test5() {
        final int[][] intervals = {{1, 5}};

        final int[] newInterval = {2, 7};

        final InsertInterval solution = new InsertInterval();
        final int[][] output = solution.insert(intervals, newInterval);

        Assert.assertArrayEquals(
            new int[][]{{1, 7}},
            output
        );
    }
}
