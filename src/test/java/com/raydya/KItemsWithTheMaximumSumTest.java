package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class KItemsWithTheMaximumSumTest {

    @Test
    public void test1() {
        final KItemsWithTheMaximumSum solution = new KItemsWithTheMaximumSum();
        final int output = solution.kItemsWithMaximumSum(3, 2, 0, 2);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final KItemsWithTheMaximumSum solution = new KItemsWithTheMaximumSum();
        final int output = solution.kItemsWithMaximumSum(3, 2, 0, 4);

        Assert.assertEquals(3, output);
    }
}
