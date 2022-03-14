package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void test1() {
        final FindNumbersWithEvenNumberOfDigits solution = new FindNumbersWithEvenNumberOfDigits();
        final int output = solution.findNumbers(new int[]{12, 345, 2, 6, 7896});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindNumbersWithEvenNumberOfDigits solution = new FindNumbersWithEvenNumberOfDigits();
        final int output = solution.findNumbers(new int[]{555, 901, 482, 1771});

        Assert.assertEquals(1, output);
    }
}
