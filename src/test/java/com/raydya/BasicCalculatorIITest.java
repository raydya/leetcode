package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorIITest {
    @Test
    public void test1() {
        final BasicCalculatorII solution = new BasicCalculatorII();
        final int output = solution.calculate("3+2*2");

        Assert.assertEquals(7, output);
    }

    @Test
    public void test2() {
        final BasicCalculatorII solution = new BasicCalculatorII();
        final int output = solution.calculate(" 3/2 ");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final BasicCalculatorII solution = new BasicCalculatorII();
        final int output = solution.calculate("3+5 / 2  ");

        Assert.assertEquals(5, output);
    }

    @Test
    public void test4() {
        final BasicCalculatorII solution = new BasicCalculatorII();
        final int output = solution.calculate("1-1+1");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test5() {
        final BasicCalculatorII solution = new BasicCalculatorII();
        final int output = solution.calculate("0-2147483647");

        Assert.assertEquals(-2147483647, output);
    }

    @Test
    public void test6() {
        final BasicCalculatorII solution = new BasicCalculatorII();
        final int output = solution.calculate("1+1-1");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test7() {
        final BasicCalculatorII solution = new BasicCalculatorII();
        final int output = solution.calculate("4+3-7*5/6*5-8+4");

        Assert.assertEquals(-22, output);
    }
}
