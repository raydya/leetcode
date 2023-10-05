package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class Finding3DigitEvenNumbersTest {

    @Test
    public void test1() {
        final Finding3DigitEvenNumbers solution = new Finding3DigitEvenNumbers();
        final int[] output = solution.findEvenNumbers(new int[]{2, 1, 3, 0});

        Assert.assertArrayEquals(new int[]{102, 120, 130, 132, 210, 230, 302, 310, 312, 320}, output);
    }

    @Test
    public void test2() {
        final Finding3DigitEvenNumbers solution = new Finding3DigitEvenNumbers();
        final int[] output = solution.findEvenNumbers(new int[]{2, 2, 8, 8, 2});

        Assert.assertArrayEquals(new int[]{222, 228, 282, 288, 822, 828, 882}, output);
    }

    @Test
    public void test3() {
        final Finding3DigitEvenNumbers solution = new Finding3DigitEvenNumbers();
        final int[] output = solution.findEvenNumbers(new int[]{3, 7, 5});

        Assert.assertArrayEquals(new int[]{}, output);
    }
}
