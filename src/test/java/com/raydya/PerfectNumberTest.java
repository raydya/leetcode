package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PerfectNumberTest {
    @Test
    public void test1() {
        final PerfectNumber solution = new PerfectNumber();
        final boolean output = solution.checkPerfectNumber(28);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final PerfectNumber solution = new PerfectNumber();
        final boolean output = solution.checkPerfectNumber(6);

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final PerfectNumber solution = new PerfectNumber();
        final boolean output = solution.checkPerfectNumber(496);

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final PerfectNumber solution = new PerfectNumber();
        final boolean output = solution.checkPerfectNumber(8128);

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final PerfectNumber solution = new PerfectNumber();
        final boolean output = solution.checkPerfectNumber(2);

        Assert.assertFalse(output);
    }

    @Test
    public void test6() {
        final PerfectNumber solution = new PerfectNumber();
        final boolean output = solution.checkPerfectNumber(1);

        Assert.assertFalse(output);
    }
}
