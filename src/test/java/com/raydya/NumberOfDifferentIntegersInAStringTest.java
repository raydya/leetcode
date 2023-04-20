package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDifferentIntegersInAStringTest {

    @Test
    public void test1() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers("a123bc34d8ef34");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers("leet1234code234");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final NumberOfDifferentIntegersInAString solution = new NumberOfDifferentIntegersInAString();
        final int output = solution.numDifferentIntegers("a1b01c001");

        Assert.assertEquals(1, output);
    }
}
