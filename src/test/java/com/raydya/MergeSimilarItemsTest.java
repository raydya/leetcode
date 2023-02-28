package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MergeSimilarItemsTest {

    @Test
    public void test1() {
        final MergeSimilarItems solution = new MergeSimilarItems();
        final List<List<Integer>> output = solution.mergeSimilarItems(
            new int[][]{{1, 1}, {4, 5}, {3, 8}},
            new int[][]{{3, 1}, {1, 5}}
        );

        Assert.assertArrayEquals(new Integer[]{1, 6}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{3, 9}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{4, 5}, output.get(2).toArray());
    }

    @Test
    public void test2() {
        final MergeSimilarItems solution = new MergeSimilarItems();
        final List<List<Integer>> output = solution.mergeSimilarItems(
            new int[][]{{1, 1}, {3, 2}, {2, 3}},
            new int[][]{{2, 1}, {3, 2}, {1, 3}}
        );

        Assert.assertArrayEquals(new Integer[]{1, 4}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{2, 4}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{3, 4}, output.get(2).toArray());
    }

    @Test
    public void test3() {
        final MergeSimilarItems solution = new MergeSimilarItems();
        final List<List<Integer>> output = solution.mergeSimilarItems(
            new int[][]{{1, 3}, {2, 2}},
            new int[][]{{7, 1}, {2, 2}, {1, 4}}
        );

        Assert.assertArrayEquals(new Integer[]{1, 7}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{2, 4}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{7, 1}, output.get(2).toArray());
    }
}
