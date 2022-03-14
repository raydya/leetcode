package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockIITest {

    @Test
    public void test1() {
        final BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();
        final int maxProfit = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        Assert.assertEquals(7, maxProfit);
    }

    @Test
    public void test2() {
        final BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();
        final int maxProfit = solution.maxProfit(new int[]{1, 2, 3, 4, 5});

        Assert.assertEquals(4, maxProfit);
    }

    @Test
    public void test3() {
        final BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();
        final int maxProfit = solution.maxProfit(new int[]{7, 6, 4, 3, 1});

        Assert.assertEquals(0, maxProfit);
    }
}
