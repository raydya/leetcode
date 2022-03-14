package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTrailingZeroesTest {

    @Test
    public void test1() {
        final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        final int trailingZeroes = solution.trailingZeroes(3);
        Assert.assertEquals(0, trailingZeroes);
    }

    @Test
    public void test2() {
        final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        final int trailingZeroes = solution.trailingZeroes(5);
        Assert.assertEquals(1, trailingZeroes);
    }

    @Test
    public void test3() {
        final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        final int trailingZeroes = solution.trailingZeroes(0);
        Assert.assertEquals(0, trailingZeroes);
    }

    @Test
    public void test4() {
        final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        final int trailingZeroes = solution.trailingZeroes(7);
        Assert.assertEquals(1, trailingZeroes);
    }

    @Test
    public void test5() {
        final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        final int trailingZeroes = solution.trailingZeroes(13);
        Assert.assertEquals(2, trailingZeroes);
    }

    @Test
    public void test6() {
        final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        final int trailingZeroes = solution.trailingZeroes(30);
        Assert.assertEquals(7, trailingZeroes);
    }

    @Test
    public void test7() {
        final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        final int trailingZeroes = solution.trailingZeroes(20);
        Assert.assertEquals(4, trailingZeroes);
    }

    @Test
    public void test8() {
        final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        final int trailingZeroes = solution.trailingZeroes(25);
        Assert.assertEquals(6, trailingZeroes);
    }

    @Test
    public void test9() {
        final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        final int trailingZeroes = solution.trailingZeroes(24);
        Assert.assertEquals(4, trailingZeroes);
    }
}
