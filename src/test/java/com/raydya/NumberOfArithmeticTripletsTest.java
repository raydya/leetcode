package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfArithmeticTripletsTest {

    @Test
    public void test1() {
        final NumberOfArithmeticTriplets solution = new NumberOfArithmeticTriplets();
        final int output = solution.arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final NumberOfArithmeticTriplets solution = new NumberOfArithmeticTriplets();
        final int output = solution.arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2);

        Assert.assertEquals(2, output);
    }
}
