package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {
    @Test
    public void test1() {
        final int input = 4;

        final Sqrt solution = new Sqrt();
        final int output = solution.sqrt(input);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final int input = 8;

        final Sqrt solution = new Sqrt();
        final int output = solution.sqrt(input);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final int input = 2147483647;

        final Sqrt solution = new Sqrt();
        final int output = solution.sqrt(input);

        Assert.assertEquals(46340, output);
    }
}
