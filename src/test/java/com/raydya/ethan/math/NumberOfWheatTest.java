package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWheatTest {

    @Test
    public void test1() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(3);

        Assert.assertEquals(7, output);
    }

    @Test
    public void test4() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(4);

        Assert.assertEquals(15, output);
    }

    @Test
    public void test5() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(63);

        Assert.assertEquals(9223372036854775807L, output);
    }

}
