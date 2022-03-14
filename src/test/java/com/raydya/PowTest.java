package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PowTest {

    @Test
    public void test1() {
        final Pow solution = new Pow();
        final double res = solution.myPow(2.00000, 10);

        Assert.assertEquals(1024.00000, res, 0);
    }

    @Test
    public void test2() {
        final Pow solution = new Pow();
        final double res = solution.myPow(2.10000, 3);

        Assert.assertEquals(9.26100, res, 1);
    }

    @Test
    public void test3() {
        final Pow solution = new Pow();
        final double res = solution.myPow(2.00000, -2);

        Assert.assertEquals(0.25000, res, 0);
    }

    @Test
    public void test4() {
        final Pow solution = new Pow();
        final double res = solution.myPow(1.00000, 2147483647);

        Assert.assertEquals(1.00000, res, 0);
    }

    @Test
    public void test5() {
        final Pow solution = new Pow();
        final double res = solution.myPow(2.00000, -2147483648);

        Assert.assertEquals(0.00000, res, 0);
    }
}
