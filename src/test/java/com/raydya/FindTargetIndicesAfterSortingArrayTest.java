package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindTargetIndicesAfterSortingArrayTest {

    @Test
    public void test1() {
        final FindTargetIndicesAfterSortingArray solution = new FindTargetIndicesAfterSortingArray();
        final List<Integer> output = solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 2);

        Assert.assertArrayEquals(new Integer[]{1, 2}, output.toArray());
    }

    @Test
    public void test2() {
        final FindTargetIndicesAfterSortingArray solution = new FindTargetIndicesAfterSortingArray();
        final List<Integer> output = solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 3);

        Assert.assertArrayEquals(new Integer[]{3}, output.toArray());
    }

    @Test
    public void test3() {
        final FindTargetIndicesAfterSortingArray solution = new FindTargetIndicesAfterSortingArray();
        final List<Integer> output = solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 5);

        Assert.assertArrayEquals(new Integer[]{4}, output.toArray());
    }

    @Test
    public void test4() {
        final FindTargetIndicesAfterSortingArray solution = new FindTargetIndicesAfterSortingArray();
        final List<Integer> output = solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 4);

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }
}
