package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingObservationsTest {

    @Test
    public void test1() {
        final FindMissingObservations solution = new FindMissingObservations();
        final int[] output = solution.missingRolls(new int[]{3, 2, 4, 3}, 4, 2);

        Assert.assertArrayEquals(new int[]{6, 6}, output);
    }

    @Test
    public void test2() {
        final FindMissingObservations solution = new FindMissingObservations();
        final int[] output = solution.missingRolls(new int[]{1, 5, 6}, 3, 4);

        Assert.assertArrayEquals(new int[]{3, 2, 2, 2}, output);
    }

    @Test
    public void test3() {
        final FindMissingObservations solution = new FindMissingObservations();
        final int[] output = solution.missingRolls(new int[]{1, 2, 3, 4}, 6, 4);

        Assert.assertArrayEquals(new int[]{}, output);
    }

    @Test
    public void test4() {
        final FindMissingObservations solution = new FindMissingObservations();
        final int[] output = solution.missingRolls(new int[]{1}, 3, 1);

        Assert.assertArrayEquals(new int[]{5}, output);
    }
}
