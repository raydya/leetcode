package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FormSmallestNumberFromTwoDigitArraysTest {

    @Test
    public void test1() {
        final FormSmallestNumberFromTwoDigitArrays solution = new FormSmallestNumberFromTwoDigitArrays();
        final int output = solution.minNumber(new int[]{4, 1, 3}, new int[]{5, 7});

        Assert.assertEquals(15, output);
    }

    @Test
    public void test2() {
        final FormSmallestNumberFromTwoDigitArrays solution = new FormSmallestNumberFromTwoDigitArrays();
        final int output = solution.minNumber(new int[]{3, 5, 2, 6}, new int[]{3, 1, 7});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final FormSmallestNumberFromTwoDigitArrays solution = new FormSmallestNumberFromTwoDigitArrays();
        final int output = solution.minNumber(new int[]{7, 5, 6}, new int[]{1, 4});

        Assert.assertEquals(15, output);
    }
}
