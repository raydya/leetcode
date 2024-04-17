package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class Largest3SameDigitNumberInStringTest {

    @Test
    public void test1() {
        final Largest3SameDigitNumberInString solution = new Largest3SameDigitNumberInString();
        final String output = solution.largestGoodInteger("6777133339");

        Assert.assertEquals("777", output);
    }

    @Test
    public void test2() {
        final Largest3SameDigitNumberInString solution = new Largest3SameDigitNumberInString();
        final String output = solution.largestGoodInteger("2300019");

        Assert.assertEquals("000", output);
    }

    @Test
    public void test3() {
        final Largest3SameDigitNumberInString solution = new Largest3SameDigitNumberInString();
        final String output = solution.largestGoodInteger("42352338");

        Assert.assertEquals("", output);
    }
}
