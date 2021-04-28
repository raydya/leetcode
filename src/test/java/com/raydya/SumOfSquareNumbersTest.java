package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SumOfSquareNumbersTest {
    @Test
    public void test1() {
        final SumOfSquareNumbers solution = new SumOfSquareNumbers();
        final boolean output = solution.judgeSquareSum(5);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final SumOfSquareNumbers solution = new SumOfSquareNumbers();
        final boolean output = solution.judgeSquareSum(3);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final SumOfSquareNumbers solution = new SumOfSquareNumbers();
        final boolean output = solution.judgeSquareSum(4);

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final SumOfSquareNumbers solution = new SumOfSquareNumbers();
        final boolean output = solution.judgeSquareSum(2);

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final SumOfSquareNumbers solution = new SumOfSquareNumbers();
        final boolean output = solution.judgeSquareSum(1);

        Assert.assertTrue(output);
    }

    @Test
    public void test6() {
        final SumOfSquareNumbers solution = new SumOfSquareNumbers();
        final boolean output = solution.judgeSquareSum(2147483646);

        Assert.assertFalse(output);
    }

    @Test
    public void test7() {
        final SumOfSquareNumbers solution = new SumOfSquareNumbers();
        final boolean output = solution.judgeSquareSum(1000);

        Assert.assertTrue(output);
    }
}
