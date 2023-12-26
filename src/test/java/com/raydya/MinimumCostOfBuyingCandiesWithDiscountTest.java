package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumCostOfBuyingCandiesWithDiscountTest {

    @Test
    public void test1() {
        final MinimumCostOfBuyingCandiesWithDiscount solution = new MinimumCostOfBuyingCandiesWithDiscount();
        final int output = solution.minimumCost(new int[]{1, 2, 3});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final MinimumCostOfBuyingCandiesWithDiscount solution = new MinimumCostOfBuyingCandiesWithDiscount();
        final int output = solution.minimumCost(new int[]{6, 5, 7, 9, 2, 2});

        Assert.assertEquals(23, output);
    }

    @Test
    public void test3() {
        final MinimumCostOfBuyingCandiesWithDiscount solution = new MinimumCostOfBuyingCandiesWithDiscount();
        final int output = solution.minimumCost(new int[]{5, 5});

        Assert.assertEquals(10, output);
    }
}
