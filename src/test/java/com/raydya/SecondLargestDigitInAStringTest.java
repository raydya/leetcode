package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestDigitInAStringTest {

    @Test
    public void test1() {
        final SecondLargestDigitInAString solution = new SecondLargestDigitInAString();
        final int output = solution.secondHighest("dfa12321afd");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final SecondLargestDigitInAString solution = new SecondLargestDigitInAString();
        final int output = solution.secondHighest("abc1111");

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final SecondLargestDigitInAString solution = new SecondLargestDigitInAString();
        final int output = solution.secondHighest("sjhtz8344");

        Assert.assertEquals(4, output);
    }
}
