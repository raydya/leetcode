package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ConvertToBase2Test {

    @Test
    public void test1() {
        final ConvertToBase2 solution = new ConvertToBase2();
        final String output = solution.baseNeg2(2);

        Assert.assertEquals("110", output);
    }

    @Test
    public void test2() {
        final ConvertToBase2 solution = new ConvertToBase2();
        final String output = solution.baseNeg2(3);

        Assert.assertEquals("111", output);
    }

    @Test
    public void test3() {
        final ConvertToBase2 solution = new ConvertToBase2();
        final String output = solution.baseNeg2(4);

        Assert.assertEquals("100", output);
    }
}
