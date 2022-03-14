package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NextPermutationTest {

    @Test
    public void test1() {
        final int[] input = {1, 2, 3};

        final NextPermutation solution = new NextPermutation();
        solution.nextPermutation(input);

        Assert.assertArrayEquals(new int[]{1, 3, 2}, input);
    }

    @Test
    public void test2() {
        final int[] input = {3, 2, 1};

        final NextPermutation solution = new NextPermutation();
        solution.nextPermutation(input);

        Assert.assertArrayEquals(new int[]{1, 2, 3}, input);
    }

    @Test
    public void test3() {
        final int[] input = {1, 1, 5};

        final NextPermutation solution = new NextPermutation();
        solution.nextPermutation(input);

        Assert.assertArrayEquals(new int[]{1, 5, 1}, input);
    }


    @Test
    public void test4() {
        final int[] input = {1};

        final NextPermutation solution = new NextPermutation();
        solution.nextPermutation(input);

        Assert.assertArrayEquals(new int[]{1}, input);
    }

    @Test
    public void test5() {
        final int[] input = {1, 2};

        final NextPermutation solution = new NextPermutation();
        solution.nextPermutation(input);

        Assert.assertArrayEquals(new int[]{2, 1}, input);
    }

    @Test
    public void test6() {
        final int[] input = {1, 3, 2};

        final NextPermutation solution = new NextPermutation();
        solution.nextPermutation(input);

        Assert.assertArrayEquals(new int[]{2, 1, 3}, input);
    }
}
