package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWaysToBuyPensAndPencilsTest {

    @Test
    public void test1() {
        final NumberOfWaysToBuyPensAndPencils solution = new NumberOfWaysToBuyPensAndPencils();
        final long output = solution.waysToBuyPensPencils(20, 10, 5);

        Assert.assertEquals(9, output);
    }

    @Test
    public void test2() {
        final NumberOfWaysToBuyPensAndPencils solution = new NumberOfWaysToBuyPensAndPencils();
        final long output = solution.waysToBuyPensPencils(5, 10, 10);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final NumberOfWaysToBuyPensAndPencils solution = new NumberOfWaysToBuyPensAndPencils();
        final long output = solution.waysToBuyPensPencils(1000000, 1, 1);

        Assert.assertEquals(500001500001L, output);
    }

    @Test
    public void test4() {
        final NumberOfWaysToBuyPensAndPencils solution = new NumberOfWaysToBuyPensAndPencils();
        final long output = solution.waysToBuyPensPencils(10, 99, 9);

        Assert.assertEquals(2, output);
    }
}
