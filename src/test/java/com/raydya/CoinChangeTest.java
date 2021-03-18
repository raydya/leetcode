package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTest {
    @Test
    public void test1() {
        final CoinChange solution = new CoinChange();
        final int output = solution.coinChange(new int[]{1, 2, 5}, 11);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final CoinChange solution = new CoinChange();
        final int output = solution.coinChange(new int[]{2}, 3);

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final CoinChange solution = new CoinChange();
        final int output = solution.coinChange(new int[]{1}, 0);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final CoinChange solution = new CoinChange();
        final int output = solution.coinChange(new int[]{1}, 1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test5() {
        final CoinChange solution = new CoinChange();
        final int output = solution.coinChange(new int[]{1}, 2);

        Assert.assertEquals(2, output);
    }
}
