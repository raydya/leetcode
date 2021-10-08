package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BottleCostTest {
    @Test
    public void test1() {
        final BottleCost solution = new BottleCost();
        final int output = solution.consume(10);

        Assert.assertEquals(15, output);
    }
}
