package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWheatTest {

    @Test
    public void test1() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(1);
        final long output1 = solution.mathInduction(1);

        Assert.assertEquals(1, output);
        Assert.assertEquals(1, output1);
    }

    @Test
    public void test2() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(2);
        final long output1 = solution.mathInduction(2);

        Assert.assertEquals(3, output);
        Assert.assertEquals(3, output1);
    }

    @Test
    public void test3() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(3);
        final long output1 = solution.mathInduction(3);

        Assert.assertEquals(7, output);
        Assert.assertEquals(7, output1);
    }

    @Test
    public void test4() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(4);
        final long output1 = solution.mathInduction(4);

        Assert.assertEquals(15, output);
        Assert.assertEquals(15, output1);
    }

    @Test
    public void test5() {
        final NumberOfWheat solution = new NumberOfWheat();
        final long output = solution.getNumberOfWheat(63);
        final long output1 = solution.mathInduction(63);

        Assert.assertEquals(9223372036854775807L, output);
        Assert.assertEquals(9223372036854775807L, output1);
    }

}
