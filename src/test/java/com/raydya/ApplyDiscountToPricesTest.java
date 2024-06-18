package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ApplyDiscountToPricesTest {

    @Test
    public void test1() {
        final ApplyDiscountToPrices solution = new ApplyDiscountToPrices();
        final String output = solution.discountPrices("there are $1 $2 and 5$ candies in the shop", 50);

        Assert.assertEquals("there are $0.50 $1.00 and 5$ candies in the shop", output);
    }

    @Test
    public void test2() {
        final ApplyDiscountToPrices solution = new ApplyDiscountToPrices();
        final String output = solution.discountPrices("1 2 $3 4 $5 $6 7 8$ $9 $10$", 100);

        Assert.assertEquals("1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$", output);
    }

    @Test
    public void test3() {
        final ApplyDiscountToPrices solution = new ApplyDiscountToPrices();
        final String output = solution.discountPrices("$76111 ab $6 $", 48);

        Assert.assertEquals("$39577.72 ab $3.12 $", output);
    }
}
