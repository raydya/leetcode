package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongPressedNameTest {
    @Test
    public void test1() {
        final LongPressedName solution = new LongPressedName();
        final boolean output = solution.isLongPressedName("alex", "aaleex");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final LongPressedName solution = new LongPressedName();
        final boolean output = solution.isLongPressedName("saeed", "ssaaedd");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final LongPressedName solution = new LongPressedName();
        final boolean output = solution.isLongPressedName("leelee", "lleeelee");

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final LongPressedName solution = new LongPressedName();
        final boolean output = solution.isLongPressedName("laiden", "laiden");

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final LongPressedName solution = new LongPressedName();
        final boolean output = solution.isLongPressedName("saeed", "ssaaeeedd");

        Assert.assertTrue(output);
    }

    @Test
    public void test6() {
        final LongPressedName solution = new LongPressedName();
        final boolean output = solution.isLongPressedName("alex", "aaleexa");

        Assert.assertFalse(output);
    }

    @Test
    public void test7() {
        final LongPressedName solution = new LongPressedName();
        final boolean output = solution.isLongPressedName("alexd", "ale");

        Assert.assertFalse(output);
    }

    @Test
    public void test8() {
        final LongPressedName solution = new LongPressedName();
        final boolean output = solution.isLongPressedName("pyplrz", "ppyypllr");

        Assert.assertFalse(output);
    }

    @Test
    public void test9() {
        final LongPressedName solution = new LongPressedName();
        final boolean output = solution.isLongPressedName("alex", "alexxr");

        Assert.assertFalse(output);
    }
}
