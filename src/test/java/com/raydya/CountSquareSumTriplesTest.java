package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountSquareSumTriplesTest {
    @Test
    public void test1() {
        final CountSquareSumTriples solution = new CountSquareSumTriples();
        final int output = solution.countTriples(5);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CountSquareSumTriples solution = new CountSquareSumTriples();
        final int output = solution.countTriples(10);

        Assert.assertEquals(4, output);
    }
}
