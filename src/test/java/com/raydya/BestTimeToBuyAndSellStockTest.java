package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void test1() {
        final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        final int maxProfit = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        Assert.assertEquals(5, maxProfit);
    }

    @Test
    public void test2() {
        final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        final int maxProfit = solution.maxProfit(new int[]{7, 6, 4, 3, 1});

        Assert.assertEquals(0, maxProfit);
    }

    @Test
    public void test3() {
        final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        final int maxProfit = solution.maxProfit(new int[]{2, 4, 1});

        Assert.assertEquals(2, maxProfit);
    }

    @Test
    public void test4() {
        final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        final int maxProfit = solution.maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2});

        Assert.assertEquals(2, maxProfit);
    }
}
