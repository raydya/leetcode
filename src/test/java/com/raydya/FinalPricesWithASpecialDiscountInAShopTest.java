package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FinalPricesWithASpecialDiscountInAShopTest {

    @Test
    public void test1() {
        final FinalPricesWithASpecialDiscountInAShop solution = new FinalPricesWithASpecialDiscountInAShop();
        final int[] output = solution.finalPrices(new int[]{8, 4, 6, 2, 3});

        Assert.assertArrayEquals(new int[]{4, 2, 4, 2, 3}, output);
    }

    @Test
    public void test2() {
        final FinalPricesWithASpecialDiscountInAShop solution = new FinalPricesWithASpecialDiscountInAShop();
        final int[] output = solution.finalPrices(new int[]{1, 2, 3, 4, 5});

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, output);
    }

    @Test
    public void test3() {
        final FinalPricesWithASpecialDiscountInAShop solution = new FinalPricesWithASpecialDiscountInAShop();
        final int[] output = solution.finalPrices(new int[]{10, 1, 1, 6});

        Assert.assertArrayEquals(new int[]{9, 0, 1, 6}, output);
    }

}
