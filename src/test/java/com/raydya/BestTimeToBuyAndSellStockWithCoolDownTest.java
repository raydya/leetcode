package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockWithCoolDownTest {

    @Test
    public void test1() {
        final BestTimeToBuyAndSellStockWithCoolDown solution = new BestTimeToBuyAndSellStockWithCoolDown();
        final int output = solution.maxProfit(new int[]{1, 2, 3, 0, 2});

        Assert.assertEquals(3, output);
    }
}
