package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CalculateAmountPaidInTaxesTest {

    @Test
    public void test1() {
        final CalculateAmountPaidInTaxes solution = new CalculateAmountPaidInTaxes();
        final double output = solution.calculateTax(
            new int[][]{
                {3, 50},
                {7, 10},
                {12, 25}
            },
            10
        );

        Assert.assertEquals(2.6500, output, 0.0000);
    }

    @Test
    public void test2() {
        final CalculateAmountPaidInTaxes solution = new CalculateAmountPaidInTaxes();
        final double output = solution.calculateTax(
            new int[][]{
                {1, 0},
                {4, 25},
                {5, 50}
            },
            2
        );

        Assert.assertEquals(0.25000, output, 0.00000);
    }

    @Test
    public void test3() {
        final CalculateAmountPaidInTaxes solution = new CalculateAmountPaidInTaxes();
        final double output = solution.calculateTax(
            new int[][]{
                {2, 50}
            },
            0
        );

        Assert.assertEquals(0.00000, output, 0.00000);
    }
}
