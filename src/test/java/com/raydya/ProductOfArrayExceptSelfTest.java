package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void test1() {
        final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        final int[] output = solution.productExceptSelf(new int[]{1, 2, 3, 4});

        Assert.assertArrayEquals(new int[]{24, 12, 8, 6}, output);
    }
}
