package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {

    @Test
    public void test1() {
        final RotateArray solution = new RotateArray();
        final int[] input = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(input, 3);

        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, input);
    }

    @Test
    public void test2() {
        final RotateArray solution = new RotateArray();
        final int[] input = {-1, -100, 3, 99};
        solution.rotate(input, 2);

        Assert.assertArrayEquals(new int[]{3, 99, -1, -100}, input);
    }

    @Test
    public void test3() {
        final RotateArray solution = new RotateArray();
        final int[] input = {-1};
        solution.rotate(input, 2);

        Assert.assertArrayEquals(new int[]{-1}, input);
    }

    @Test
    public void test4() {
        final RotateArray solution = new RotateArray();
        final int[] input = {1, 2};
        solution.rotate(input, 3);

        Assert.assertArrayEquals(new int[]{2, 1}, input);
    }
}
