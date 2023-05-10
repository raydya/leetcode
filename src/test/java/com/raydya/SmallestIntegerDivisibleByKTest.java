package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SmallestIntegerDivisibleByKTest {

    @Test
    public void test1() {
        final SmallestIntegerDivisibleByK solution = new SmallestIntegerDivisibleByK();
        final int output = solution.smallestRepunitDivByK(1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final SmallestIntegerDivisibleByK solution = new SmallestIntegerDivisibleByK();
        final int output = solution.smallestRepunitDivByK(2);

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final SmallestIntegerDivisibleByK solution = new SmallestIntegerDivisibleByK();
        final int output = solution.smallestRepunitDivByK(3);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test4() {
        final SmallestIntegerDivisibleByK solution = new SmallestIntegerDivisibleByK();
        final int output = solution.smallestRepunitDivByK(5);

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test5() {
        final SmallestIntegerDivisibleByK solution = new SmallestIntegerDivisibleByK();
        final int output = solution.smallestRepunitDivByK(17);

        Assert.assertEquals(16, output);
    }

    @Test
    public void test6() {
        final SmallestIntegerDivisibleByK solution = new SmallestIntegerDivisibleByK();
        final int output = solution.smallestRepunitDivByK(23);

        Assert.assertEquals(22, output);
    }
}
