package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountGoodTripletsTest {

    @Test
    public void test1() {
        final CountGoodTriplets solution = new CountGoodTriplets();
        final int output = solution.countGoodTriplets(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final CountGoodTriplets solution = new CountGoodTriplets();
        final int output = solution.countGoodTriplets(new int[]{1, 1, 2, 2, 3}, 0, 0, 1);

        Assert.assertEquals(0, output);
    }

}
