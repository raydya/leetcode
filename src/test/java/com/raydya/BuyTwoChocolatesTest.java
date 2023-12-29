package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BuyTwoChocolatesTest {

    @Test
    public void test1() {
        final BuyTwoChocolates solution = new BuyTwoChocolates();
        final int output = solution.buyChoco(new int[]{1, 2, 2}, 3);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test2() {
        final BuyTwoChocolates solution = new BuyTwoChocolates();
        final int output = solution.buyChoco(new int[]{3, 2, 3}, 3);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final BuyTwoChocolates solution = new BuyTwoChocolates();
        final int output = solution.buyChoco(new int[]{98, 54, 6, 34, 66, 63, 52, 39}, 62);

        Assert.assertEquals(22, output);
    }
}
