package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerTest {

    @Test
    public void test1() {
        final StringToInteger solution = new StringToInteger();
        final int atoi = solution.myAtoi("42");

        Assert.assertEquals(42, atoi);
    }

    @Test
    public void test2() {
        final StringToInteger solution = new StringToInteger();
        final int atoi = solution.myAtoi("   -42");

        Assert.assertEquals(-42, atoi);
    }

    @Test
    public void test3() {
        final StringToInteger solution = new StringToInteger();
        final int atoi = solution.myAtoi("4193 with words");

        Assert.assertEquals(4193, atoi);
    }

    @Test
    public void test4() {
        final StringToInteger solution = new StringToInteger();
        final int atoi = solution.myAtoi("words and 987");

        Assert.assertEquals(0, atoi);
    }

    @Test
    public void test5() {
        final StringToInteger solution = new StringToInteger();
        final int atoi = solution.myAtoi("-91283472332");

        Assert.assertEquals(-2147483648, atoi);
    }
}
