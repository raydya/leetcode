package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountOfIntegersTest {

    @Test
    public void test1() {
        final CountOfIntegers solution = new CountOfIntegers();
        final int output = solution.count("1", "12", 1, 8);

        Assert.assertEquals(11, output);
    }

    @Test
    public void test2() {
        final CountOfIntegers solution = new CountOfIntegers();
        final int output = solution.count("1", "5", 1, 5);

        Assert.assertEquals(5, output);
    }

    @Test
    public void test3() {
        final CountOfIntegers solution = new CountOfIntegers();
        final int output = solution.count("4179205230", "7748704426", 8, 46);

        Assert.assertEquals(883045899, output);
    }
}
