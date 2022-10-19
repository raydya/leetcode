package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void test1() {
        final Factorial solution = new Factorial();
        final long f = solution.f(1);

        Assert.assertEquals(1, f);
    }

    @Test
    public void test2() {
        final Factorial solution = new Factorial();
        final long f = solution.f(2);

        Assert.assertEquals(2, f);
    }

    @Test
    public void test3() {
        final Factorial solution = new Factorial();
        final long f = solution.f(3);

        Assert.assertEquals(6, f);
    }

    @Test
    public void test4() {
        final Factorial solution = new Factorial();
        final long f = solution.f(4);

        Assert.assertEquals(24, f);
    }

    @Test
    public void test5() {
        final Factorial solution = new Factorial();
        final long f = solution.f(10);

        Assert.assertEquals(3628800, f);
    }

}
