package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SlowestKeyTest {

    @Test
    public void test1() {
        final SlowestKey solution = new SlowestKey();
        final char output = solution.slowestKey(new int[]{9, 29, 49, 50}, "cbcd");

        Assert.assertEquals('c', output);
    }

    @Test
    public void test2() {
        final SlowestKey solution = new SlowestKey();
        final char output = solution.slowestKey(new int[]{12, 23, 36, 46, 62}, "spuda");

        Assert.assertEquals('a', output);
    }
}
