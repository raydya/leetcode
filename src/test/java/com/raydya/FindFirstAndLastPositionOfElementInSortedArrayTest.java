package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {
    @Test
    public void test1() {
        final FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        final int[] searchRange = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);

        Assert.assertArrayEquals(new int[]{3, 4}, searchRange);
    }

    @Test
    public void test2() {
        final FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        final int[] searchRange = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);

        Assert.assertArrayEquals(new int[]{-1, -1}, searchRange);
    }

    @Test
    public void test3() {
        final FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        final int[] searchRange = solution.searchRange(new int[]{}, 0);

        Assert.assertArrayEquals(new int[]{-1, -1}, searchRange);
    }

    @Test
    public void test4() {
        final FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        final int[] searchRange = solution.searchRange(new int[]{1}, 1);

        Assert.assertArrayEquals(new int[]{0, 0}, searchRange);
    }

    @Test
    public void test5() {
        final FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        final int[] searchRange = solution.searchRange(new int[]{2, 2}, 2);

        Assert.assertArrayEquals(new int[]{0, 1}, searchRange);
    }

    @Test
    public void test6() {
        final FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        final int[] searchRange = solution.searchRange(new int[]{1, 2, 3}, 3);

        Assert.assertArrayEquals(new int[]{2, 2}, searchRange);
    }

    @Test
    public void test7() {
        final FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        final int[] searchRange = solution.searchRange(new int[]{0, 0, 2, 3, 4, 4, 4, 5}, 5);

        Assert.assertArrayEquals(new int[]{7, 7}, searchRange);
    }

    @Test
    public void test8() {
        final FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        final int[] searchRange = solution.searchRange(new int[]{0, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 4}, 3);

        Assert.assertArrayEquals(new int[]{12, 12}, searchRange);
    }
}
