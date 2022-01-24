package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {
    @Test
    public void test1() {
        final SubtractTheProductAndSumOfDigitsOfAnInteger solution = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        final int output = solution.subtractProductAndSum(234);

        Assert.assertEquals(15, output);
    }

    @Test
    public void test2() {
        final SubtractTheProductAndSumOfDigitsOfAnInteger solution = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        final int output = solution.subtractProductAndSum(4421);

        Assert.assertEquals(21, output);
    }
}
