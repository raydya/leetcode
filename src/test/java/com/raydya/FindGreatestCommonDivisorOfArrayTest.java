package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindGreatestCommonDivisorOfArrayTest {

    @Test
    public void test1() {
        final FindGreatestCommonDivisorOfArray solution = new FindGreatestCommonDivisorOfArray();
        final int output = solution.findGCD(new int[]{2, 5, 6, 9, 10});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindGreatestCommonDivisorOfArray solution = new FindGreatestCommonDivisorOfArray();
        final int output = solution.findGCD(new int[]{7, 5, 6, 8, 3});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final FindGreatestCommonDivisorOfArray solution = new FindGreatestCommonDivisorOfArray();
        final int output = solution.findGCD(new int[]{3, 3});

        Assert.assertEquals(3, output);
    }
}
