package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountIntegersWithEvenDigitSumTest {

    @Test
    public void test1() {
        final CountIntegersWithEvenDigitSum solution = new CountIntegersWithEvenDigitSum();
        final int output = solution.countEven(4);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CountIntegersWithEvenDigitSum solution = new CountIntegersWithEvenDigitSum();
        final int output = solution.countEven(30);

        Assert.assertEquals(14, output);
    }

    @Test
    public void test3() {
        final CountIntegersWithEvenDigitSum solution = new CountIntegersWithEvenDigitSum();
        final int output = solution.countEven(910);

        Assert.assertEquals(455, output);
    }

}
