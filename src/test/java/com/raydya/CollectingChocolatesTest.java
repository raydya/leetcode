package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CollectingChocolatesTest {

    @Test
    public void test1() {
        final CollectingChocolates solution = new CollectingChocolates();
        final long output = solution.minCost(new int[]{20, 1, 15}, 5);

        Assert.assertEquals(13, output);
    }

    @Test
    public void test2() {
        final CollectingChocolates solution = new CollectingChocolates();
        final long output = solution.minCost(new int[]{1, 2, 3}, 4);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final CollectingChocolates solution = new CollectingChocolates();
        final long output = solution.minCost(new int[]{31, 25, 18, 59}, 27);

        Assert.assertEquals(119, output);
    }

    @Test
    public void test4() {
        final CollectingChocolates solution = new CollectingChocolates();
        final long output = solution.minCost(new int[]{15, 150, 56, 69, 214, 203}, 42);

        Assert.assertEquals(298, output);
    }
}
