package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalsTest {

    @Test
    public void test1() {
        final int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        final MergeIntervals solution = new MergeIntervals();
        final int[][] merge = solution.merge(intervals);

        Assert.assertArrayEquals(
            new int[][]{{1, 6}, {8, 10}, {15, 18}}, merge
        );
    }

    @Test
    public void test2() {
        final int[][] intervals = {{1, 4}, {4, 5}};

        final MergeIntervals solution = new MergeIntervals();
        final int[][] merge = solution.merge(intervals);

        Assert.assertArrayEquals(
            new int[][]{{1, 5}}, merge
        );
    }

    @Test
    public void test3() {
        final int[][] intervals = {{1, 4}, {0, 4}};

        final MergeIntervals solution = new MergeIntervals();
        final int[][] merge = solution.merge(intervals);

        Assert.assertArrayEquals(
            new int[][]{{0, 4}}, merge
        );
    }

    @Test
    public void test4() {
        final int[][] intervals = {{1, 4}, {0, 0}};

        final MergeIntervals solution = new MergeIntervals();
        final int[][] merge = solution.merge(intervals);

        Assert.assertArrayEquals(
            new int[][]{{0, 0}, {1, 4}}, merge
        );
    }

    @Test
    public void test5() {
        final int[][] intervals = {{1, 4}, {2, 3}};

        final MergeIntervals solution = new MergeIntervals();
        final int[][] merge = solution.merge(intervals);

        Assert.assertArrayEquals(
            new int[][]{{1, 4}}, merge
        );
    }

    @Test
    public void test6() {
        final int[][] intervals = {{1, 4}, {0, 2}, {3, 5}};

        final MergeIntervals solution = new MergeIntervals();
        final int[][] merge = solution.merge(intervals);

        Assert.assertArrayEquals(
            new int[][]{{0, 5}}, merge
        );
    }

    @Test
    public void test7() {
        final int[][] intervals = {{2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {2, 2}, {4, 6}};

        final MergeIntervals solution = new MergeIntervals();
        final int[][] merge = solution.merge(intervals);

        Assert.assertArrayEquals(
            new int[][]{{1, 3}, {4, 7}}, merge
        );
    }

    @Test
    public void test8() {
        final int[][] intervals = {{4, 5}, {2, 4}, {4, 6}, {3, 4}, {0, 0}, {1, 1}, {3, 5}, {2, 2}};

        final MergeIntervals solution = new MergeIntervals();
        final int[][] merge = solution.merge(intervals);

        Assert.assertArrayEquals(
            new int[][]{{0, 0}, {1, 1}, {2, 6}}, merge
        );
    }
}
