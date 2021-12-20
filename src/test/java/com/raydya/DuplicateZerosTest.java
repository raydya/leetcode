package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateZerosTest {
    @Test
    public void test1() {
        final DuplicateZeros solution = new DuplicateZeros();
        final int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(input);

        Assert.assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, input);
    }

    @Test
    public void test2() {
        final DuplicateZeros solution = new DuplicateZeros();
        final int[] input = {1, 2, 3};
        solution.duplicateZeros(input);

        Assert.assertArrayEquals(new int[]{1, 2, 3}, input);
    }
}
