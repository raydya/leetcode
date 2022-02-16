package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RichestCustomerWealthTest {
    @Test
    public void test1() {
        final RichestCustomerWealth solution = new RichestCustomerWealth();
        final int output = solution.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final RichestCustomerWealth solution = new RichestCustomerWealth();
        final int output = solution.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}});

        Assert.assertEquals(10, output);
    }

    @Test
    public void test3() {
        final RichestCustomerWealth solution = new RichestCustomerWealth();
        final int output = solution.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}});

        Assert.assertEquals(17, output);
    }
}
