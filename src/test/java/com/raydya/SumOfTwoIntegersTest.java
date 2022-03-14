package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoIntegersTest {

    @Test
    public void test1() {
        final SumOfTwoIntegers solution = new SumOfTwoIntegers();
        final int output = solution.getSum(1, 2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final SumOfTwoIntegers solution = new SumOfTwoIntegers();
        final int output = solution.getSum(-2, 3);

        Assert.assertEquals(1, output);
    }
}
