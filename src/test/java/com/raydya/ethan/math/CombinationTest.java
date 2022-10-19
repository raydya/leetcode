package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class CombinationTest {

    @Test
    public void test1() {
        final Combination solution = new Combination();
        final long output = solution.c(10, 5);

        Assert.assertEquals(252, output);
    }

    @Test
    public void test2() {
        final Combination solution = new Combination();
        final long output = solution.c(10, 3);

        Assert.assertEquals(120, output);
    }

    @Test
    public void test3() {
        final Combination solution = new Combination();
        final long output = solution.c(6, 3);

        Assert.assertEquals(20, output);
    }

}
