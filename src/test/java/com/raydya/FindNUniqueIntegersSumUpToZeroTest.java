package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindNUniqueIntegersSumUpToZeroTest {

    @Test
    public void test1() {
        final FindNUniqueIntegersSumUpToZero solution = new FindNUniqueIntegersSumUpToZero();
        final int[] output = solution.sumZero(5);

        Assert.assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, output);
    }

    @Test
    public void test2() {
        final FindNUniqueIntegersSumUpToZero solution = new FindNUniqueIntegersSumUpToZero();
        final int[] output = solution.sumZero(3);

        Assert.assertArrayEquals(new int[]{-1, 0, 1}, output);
    }

    @Test
    public void test3() {
        final FindNUniqueIntegersSumUpToZero solution = new FindNUniqueIntegersSumUpToZero();
        final int[] output = solution.sumZero(1);

        Assert.assertArrayEquals(new int[]{0}, output);
    }

    @Test
    public void test4() {
        final FindNUniqueIntegersSumUpToZero solution = new FindNUniqueIntegersSumUpToZero();
        final int[] output = solution.sumZero(2);

        Assert.assertArrayEquals(new int[]{-1, 1}, output);
    }
}
