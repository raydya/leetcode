package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfUnequalTripletsInArrayTest {

    @Test
    public void test1() {
        final NumberOfUnequalTripletsInArray solution = new NumberOfUnequalTripletsInArray();
        final int output = solution.unequalTriplets(new int[]{4, 4, 2, 4, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final NumberOfUnequalTripletsInArray solution = new NumberOfUnequalTripletsInArray();
        final int output = solution.unequalTriplets(new int[]{1, 1, 1, 1, 1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final NumberOfUnequalTripletsInArray solution = new NumberOfUnequalTripletsInArray();
        final int output = solution.unequalTriplets(new int[]{1, 3, 1, 2, 4});

        Assert.assertEquals(7, output);
    }

    @Test
    public void test4() {
        final NumberOfUnequalTripletsInArray solution = new NumberOfUnequalTripletsInArray();
        final int output = solution.unequalTriplets(new int[]{2, 5, 3, 3});

        Assert.assertEquals(2, output);
    }
}
