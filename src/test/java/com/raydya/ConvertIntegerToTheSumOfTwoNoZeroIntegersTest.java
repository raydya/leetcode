package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersTest {

    @Test
    public void test1() {
        final ConvertIntegerToTheSumOfTwoNoZeroIntegers solution = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        final int[] output = solution.getNoZeroIntegers(2);

        Assert.assertArrayEquals(new int[]{1, 1}, output);
    }

    @Test
    public void test2() {
        final ConvertIntegerToTheSumOfTwoNoZeroIntegers solution = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        final int[] output = solution.getNoZeroIntegers(11);

        Assert.assertArrayEquals(new int[]{2, 9}, output);
    }

    @Test
    public void test3() {
        final ConvertIntegerToTheSumOfTwoNoZeroIntegers solution = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        final int[] output = solution.getNoZeroIntegers(10000);

        Assert.assertArrayEquals(new int[]{1, 9999}, output);
    }

    @Test
    public void test4() {
        final ConvertIntegerToTheSumOfTwoNoZeroIntegers solution = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        final int[] output = solution.getNoZeroIntegers(69);

        Assert.assertArrayEquals(new int[]{1, 68}, output);
    }

    @Test
    public void test5() {
        final ConvertIntegerToTheSumOfTwoNoZeroIntegers solution = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        final int[] output = solution.getNoZeroIntegers(1010);

        Assert.assertArrayEquals(new int[]{11, 999}, output);
    }
}
