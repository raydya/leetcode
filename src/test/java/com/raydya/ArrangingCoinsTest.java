package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ArrangingCoinsTest {
    @Test
    public void test1() {
        final ArrangingCoins solution = new ArrangingCoins();
        final int arrangeCoins = solution.arrangeCoins(5);

        Assert.assertEquals(2, arrangeCoins);
    }

    @Test
    public void test2() {
        final ArrangingCoins solution = new ArrangingCoins();
        final int arrangeCoins = solution.arrangeCoins(8);

        Assert.assertEquals(3, arrangeCoins);
    }
}
