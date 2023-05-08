package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SumOfDigitsInBaseKTEst {

    @Test
    public void test1() {
        final SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        final int output = solution.sumBase(34, 6);

        Assert.assertEquals(9, output);
    }

    @Test
    public void test2() {
        final SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        final int output = solution.sumBase(10, 10);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        final int output = solution.sumBase(42, 2);

        Assert.assertEquals(3, output);
    }
}
