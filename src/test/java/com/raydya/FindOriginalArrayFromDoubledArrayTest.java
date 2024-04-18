package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindOriginalArrayFromDoubledArrayTest {

    @Test
    public void test1() {
        final FindOriginalArrayFromDoubledArray solution = new FindOriginalArrayFromDoubledArray();
        final int[] output = solution.findOriginalArray(new int[]{1, 3, 4, 2, 6, 8});

        Assert.assertArrayEquals(new int[]{1, 3, 4}, output);
    }

    @Test
    public void test2() {
        final FindOriginalArrayFromDoubledArray solution = new FindOriginalArrayFromDoubledArray();
        final int[] output = solution.findOriginalArray(new int[]{6, 3, 0, 1});

        Assert.assertArrayEquals(new int[]{}, output);
    }

    @Test
    public void test3() {
        final FindOriginalArrayFromDoubledArray solution = new FindOriginalArrayFromDoubledArray();
        final int[] output = solution.findOriginalArray(new int[]{1});

        Assert.assertArrayEquals(new int[]{}, output);
    }

    @Test
    public void test4() {
        final FindOriginalArrayFromDoubledArray solution = new FindOriginalArrayFromDoubledArray();
        final int[] output = solution.findOriginalArray(new int[]{0, 1, 0, 0});

        Assert.assertArrayEquals(new int[]{}, output);
    }

    @Test
    public void test5() {
        final FindOriginalArrayFromDoubledArray solution = new FindOriginalArrayFromDoubledArray();
        final int[] output = solution.findOriginalArray(new int[]{0, 0, 0, 0});

        Assert.assertArrayEquals(new int[]{0, 0}, output);
    }

    @Test
    public void test6() {
        final FindOriginalArrayFromDoubledArray solution = new FindOriginalArrayFromDoubledArray();
        final int[] output = solution.findOriginalArray(new int[]{2, 1, 2, 4, 2, 4});

        Assert.assertArrayEquals(new int[]{1, 2, 2}, output);
    }

    @Test
    public void test7() {
        final FindOriginalArrayFromDoubledArray solution = new FindOriginalArrayFromDoubledArray();
        final int[] output = solution.findOriginalArray(new int[]{5, 8, 7, 8, 16, 5, 16, 14, 10, 10});

        Assert.assertArrayEquals(new int[]{5, 5, 7, 8, 8}, output);
    }

    @Test
    public void test8() {
        final FindOriginalArrayFromDoubledArray solution = new FindOriginalArrayFromDoubledArray();
        final int[] output = solution.findOriginalArray(new int[]{16, 32, 8, 64});

        Assert.assertArrayEquals(new int[]{8, 32}, output);
    }
}
