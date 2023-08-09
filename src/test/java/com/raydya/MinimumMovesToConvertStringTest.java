package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumMovesToConvertStringTest {

    @Test
    public void test1() {
        final MinimumMovesToConvertString solution = new MinimumMovesToConvertString();
        final int output = solution.minimumMoves("XXX");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MinimumMovesToConvertString solution = new MinimumMovesToConvertString();
        final int output = solution.minimumMoves("XX0X");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MinimumMovesToConvertString solution = new MinimumMovesToConvertString();
        final int output = solution.minimumMoves("0000");

        Assert.assertEquals(0, output);
    }
}
