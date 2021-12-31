package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NthTribonacciNumberTest {
    @Test
    public void test1() {
        final NthTribonacciNumber solution = new NthTribonacciNumber();
        final int output = solution.tribonacci(4);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final NthTribonacciNumber solution = new NthTribonacciNumber();
        final int output = solution.tribonacci(25);

        Assert.assertEquals(1389537, output);
    }
}
