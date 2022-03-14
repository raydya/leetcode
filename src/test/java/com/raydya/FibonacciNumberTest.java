package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberTest {

    @Test
    public void test1() {
        final FibonacciNumber solution = new FibonacciNumber();
        final int output = solution.fib(2);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final FibonacciNumber solution = new FibonacciNumber();
        final int output = solution.fib(3);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final FibonacciNumber solution = new FibonacciNumber();
        final int output = solution.fib(4);

        Assert.assertEquals(3, output);
    }
}
