package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class StrongPasswordCheckerIITest {

    @Test
    public void test1() {
        final StrongPasswordCheckerII solution = new StrongPasswordCheckerII();
        final boolean output = solution.strongPasswordCheckerII("IloveLe3tcode!");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final StrongPasswordCheckerII solution = new StrongPasswordCheckerII();
        final boolean output = solution.strongPasswordCheckerII("Me+You--IsMyDream");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final StrongPasswordCheckerII solution = new StrongPasswordCheckerII();
        final boolean output = solution.strongPasswordCheckerII("1aB!");

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final StrongPasswordCheckerII solution = new StrongPasswordCheckerII();
        final boolean output = solution.strongPasswordCheckerII("a1A!A!A!");

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final StrongPasswordCheckerII solution = new StrongPasswordCheckerII();
        final boolean output = solution.strongPasswordCheckerII("0Aa!a!a!");

        Assert.assertTrue(output);
    }
}
