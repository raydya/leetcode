package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RingsAndRodsTest {

    @Test
    public void test1() {
        final RingsAndRods solution = new RingsAndRods();
        final int output = solution.countPoints("B0B6G0R6R0R6G9");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final RingsAndRods solution = new RingsAndRods();
        final int output = solution.countPoints("B0R0G0R9R0B0G0");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final RingsAndRods solution = new RingsAndRods();
        final int output = solution.countPoints("G4");

        Assert.assertEquals(0, output);
    }
}
