package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SmallestEvenMultipleTest {

    @Test
    public void test1() {
        final SmallestEvenMultiple solution = new SmallestEvenMultiple();
        final int output = solution.smallestEvenMultiple(5);

        Assert.assertEquals(10, output);
    }

    @Test
    public void test2() {
        final SmallestEvenMultiple solution = new SmallestEvenMultiple();
        final int output = solution.smallestEvenMultiple(6);

        Assert.assertEquals(6, output);
    }
}
