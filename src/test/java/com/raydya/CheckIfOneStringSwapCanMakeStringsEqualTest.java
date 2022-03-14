package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfOneStringSwapCanMakeStringsEqualTest {

    @Test
    public void test1() {
        final CheckIfOneStringSwapCanMakeStringsEqual solution = new CheckIfOneStringSwapCanMakeStringsEqual();
        final boolean output = solution.areAlmostEqual("bank", "kanb");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfOneStringSwapCanMakeStringsEqual solution = new CheckIfOneStringSwapCanMakeStringsEqual();
        final boolean output = solution.areAlmostEqual("attack", "defend");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfOneStringSwapCanMakeStringsEqual solution = new CheckIfOneStringSwapCanMakeStringsEqual();
        final boolean output = solution.areAlmostEqual("kelb", "kelb");

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final CheckIfOneStringSwapCanMakeStringsEqual solution = new CheckIfOneStringSwapCanMakeStringsEqual();
        final boolean output = solution.areAlmostEqual("abcd", "dcba");

        Assert.assertFalse(output);
    }

    @Test
    public void test5() {
        final CheckIfOneStringSwapCanMakeStringsEqual solution = new CheckIfOneStringSwapCanMakeStringsEqual();
        final boolean output = solution.areAlmostEqual("caa", "aaz");

        Assert.assertFalse(output);
    }
}
