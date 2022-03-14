package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountPrimesTest {

    @Test
    public void test1() {
        final CountPrimes solution = new CountPrimes();
        final int countPrimes = solution.countPrimes(10);

        Assert.assertEquals(4, countPrimes);
    }

    @Test
    public void test2() {
        final CountPrimes solution = new CountPrimes();
        final int countPrimes = solution.countPrimes(0);

        Assert.assertEquals(0, countPrimes);
    }

    @Test
    public void test3() {
        final CountPrimes solution = new CountPrimes();
        final int countPrimes = solution.countPrimes(1);

        Assert.assertEquals(0, countPrimes);
    }

    @Test
    public void test4() {
        final CountPrimes solution = new CountPrimes();
        final int countPrimes = solution.countPrimes(120);

        Assert.assertEquals(30, countPrimes);
    }

    @Test
    public void test5() {
        final CountPrimes solution = new CountPrimes();
        final int countPrimes = solution.countPrimes(2);

        Assert.assertEquals(0, countPrimes);
    }

    @Test
    public void test6() {
        final CountPrimes solution = new CountPrimes();
        final int countPrimes = solution.countPrimes(10000);

        Assert.assertEquals(1229, countPrimes);
    }
}
