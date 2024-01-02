package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountElementsWithStrictlySmallerAndGreaterElementsTest {

    @Test
    public void test1() {
        final CountElementsWithStrictlySmallerAndGreaterElements solution = new CountElementsWithStrictlySmallerAndGreaterElements();
        final int output = solution.countElements(new int[]{11, 7, 2, 15});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CountElementsWithStrictlySmallerAndGreaterElements solution = new CountElementsWithStrictlySmallerAndGreaterElements();
        final int output = solution.countElements(new int[]{-3, 3, 3, 90});

        Assert.assertEquals(2, output);
    }
}
