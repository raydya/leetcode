package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class UglyNumberTest {

    @Test
    public void test1() {
        final UglyNumber solution = new UglyNumber();
        final boolean ugly = solution.isUgly(6);

        Assert.assertTrue(ugly);
    }

    @Test
    public void test2() {
        final UglyNumber solution = new UglyNumber();
        final boolean ugly = solution.isUgly(8);

        Assert.assertTrue(ugly);
    }

    @Test
    public void test3() {
        final UglyNumber solution = new UglyNumber();
        final boolean ugly = solution.isUgly(14);

        Assert.assertFalse(ugly);
    }

    @Test
    public void test4() {
        final UglyNumber solution = new UglyNumber();
        final boolean ugly = solution.isUgly(-2147483648);

        Assert.assertFalse(ugly);
    }

    @Test
    public void test5() {
        final UglyNumber solution = new UglyNumber();
        final boolean ugly = solution.isUgly(0);

        Assert.assertFalse(ugly);
    }

    @Test
    public void test6() {
        final UglyNumber solution = new UglyNumber();
        final boolean ugly = solution.isUgly(11);

        Assert.assertFalse(ugly);
    }
}
