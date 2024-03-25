package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeIITest {

    @Test
    public void test1() {
        final CoinChangeII solution = new CoinChangeII();
        final int output = solution.change(5, new int[]{1, 2, 5});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final CoinChangeII solution = new CoinChangeII();
        final int output = solution.change(3, new int[]{2});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final CoinChangeII solution = new CoinChangeII();
        final int output = solution.change(10, new int[]{10});

        Assert.assertEquals(1, output);
    }
}
