package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RotateStringTest {
    @Test
    public void test1() {
        final RotateString solution = new RotateString();
        final boolean output = solution.rotateString("abcde", "cdeab");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final RotateString solution = new RotateString();
        final boolean output = solution.rotateString("abcde", "abced");

        Assert.assertFalse(output);
    }
}
