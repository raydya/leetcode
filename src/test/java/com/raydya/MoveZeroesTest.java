package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {
    @Test
    public void test1() {
        final int[] input = {0, 1, 0, 3, 12};
        final MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(input);

        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, input);
    }

    @Test
    public void test2() {
        final int[] input = {0, 1, 0, 0, 3, 12};
        final MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(input);

        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0, 0}, input);
    }

    @Test
    public void test3() {
        final int[] input = {2, 1};
        final MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(input);

        Assert.assertArrayEquals(new int[]{2, 1}, input);
    }

    @Test
    public void test4() {
        final int[] input = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        final MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(input);

        Assert.assertArrayEquals(new int[]{4, 2, 4, 3, 5, 1, 0, 0, 0, 0}, input);
    }
}
