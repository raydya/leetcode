package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SortEvenAndOddIndicesIndependentlyTest {

    @Test
    public void test1() {
        final SortEvenAndOddIndicesIndependently solution = new SortEvenAndOddIndicesIndependently();
        final int[] output = solution.sortEvenOdd(new int[]{4, 1, 2, 3});

        Assert.assertArrayEquals(new int[]{2, 3, 4, 1}, output);
    }

    @Test
    public void test2() {
        final SortEvenAndOddIndicesIndependently solution = new SortEvenAndOddIndicesIndependently();
        final int[] output = solution.sortEvenOdd(new int[]{2, 1});

        Assert.assertArrayEquals(new int[]{2, 1}, output);
    }

    @Test
    public void test3() {
        final SortEvenAndOddIndicesIndependently solution = new SortEvenAndOddIndicesIndependently();
        final int[] output = solution.sortEvenOdd(
            new int[]{36, 45, 32, 31, 15, 41, 9, 46, 36, 6, 15, 16, 33, 26, 27, 31, 44, 34});

        Assert.assertArrayEquals(new int[]{9, 46, 15, 45, 15, 41, 27, 34, 32, 31, 33, 31, 36, 26, 36, 16, 44, 6},
            output);
    }

    @Test
    public void test4() {
        final SortEvenAndOddIndicesIndependently solution = new SortEvenAndOddIndicesIndependently();
        final int[] output = solution.sortEvenOdd(
            new int[]{5, 39, 33, 5, 12, 27, 20, 45, 14, 25, 32, 33, 30, 30, 9, 14, 44, 15, 21});

        Assert.assertArrayEquals(new int[]{5, 45, 9, 39, 12, 33, 14, 30, 20, 27, 21, 25, 30, 15, 32, 14, 33, 5, 44},
            output);
    }
}
