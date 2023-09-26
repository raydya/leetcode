package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PassThePillowTest {

    @Test
    public void test1() {
        final PassThePillow solution = new PassThePillow();
        final int output = solution.passThePillow(4, 5);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final PassThePillow solution = new PassThePillow();
        final int output = solution.passThePillow(3, 2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final PassThePillow solution = new PassThePillow();
        final int output = solution.passThePillow(18, 38);

        Assert.assertEquals(5, output);
    }
}
