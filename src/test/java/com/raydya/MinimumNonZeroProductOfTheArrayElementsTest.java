package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNonZeroProductOfTheArrayElementsTest {

    @Test
    public void test1() {
        final MinimumNonZeroProductOfTheArrayElements solution = new MinimumNonZeroProductOfTheArrayElements();
        final int output = solution.minNonZeroProduct(1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MinimumNonZeroProductOfTheArrayElements solution = new MinimumNonZeroProductOfTheArrayElements();
        final int output = solution.minNonZeroProduct(2);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final MinimumNonZeroProductOfTheArrayElements solution = new MinimumNonZeroProductOfTheArrayElements();
        final int output = solution.minNonZeroProduct(3);

        Assert.assertEquals(1512, output);
    }

    @Test
    public void test4() {
        final MinimumNonZeroProductOfTheArrayElements solution = new MinimumNonZeroProductOfTheArrayElements();
        final int output = solution.minNonZeroProduct(32);

        Assert.assertEquals(505517599, output);
    }
}
